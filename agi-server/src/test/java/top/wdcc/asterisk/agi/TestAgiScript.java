package top.wdcc.asterisk.agi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wdcc.asterisk.ami.apps.Dial;
import top.wdcc.asterisk.ami.apps.Playback;

import java.util.Date;
import java.util.TimeZone;

public class TestAgiScript implements BaseAgiScript {
    private static final Logger logger = LoggerFactory.getLogger(TestAgiScript.class);
    @Override
    public void service(AgiChannel channel) {
        channel.answer();
//        channel.sayDateTime(new Date(), "digits/at", TimeZone.getDefault());
        channel.exec(new Playback("demo-abouttotry"));
    }
}
