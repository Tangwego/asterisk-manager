package top.wdcc.ast.ami.client;

import top.wdcc.ast.ami.AmiEventListener;
import top.wdcc.ast.ami.AmiMessage;
import top.wdcc.ast.ami.actions.LoginAction;
import top.wdcc.ast.ami.AmiAction;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 客户端处理Channel收到数据
 *
 * @author Wavin
 */
public class AmiClientHandler extends AbstractAmiHandler {
    private static final Logger logger = LoggerFactory.getLogger(AmiClientHandler.class);
    private AmiConfig config;
    private AmiEventListener listener;
    public AmiClientHandler(AmiConfig config, AmiEventListener listener) {
        this.config = config;
        this.listener = listener;
    }

    @Override
    protected void handleEvent(ChannelHandlerContext ctx, AmiMessage message) {
        AmiEvent event = new AmiEvent(message);
        if (this.listener != null) {
            this.listener.onEvent(event);
        }
    }

    @Override
    protected void handleLogin(ChannelHandlerContext ctx, AmiMessage message) {
        AmiAction authAction = new LoginAction(config.getUsername(), config.getSecret());
        AmiMessage amiMessage = sendCommand(ctx.channel(), authAction);

        if (this.listener != null) {
            this.listener.onLogin(amiMessage.isSuccess());
        }
    }
}
