## Ami Client Usage
### Common Usage:
```
AmiConfig amiConfig = new AmiConfig();
amiConfig.setUsername("asterisk");
amiConfig.setSecret("asterisk");
amiConfig.setHost("192.168.0.120");
amiConfig.setPort(5038);
AmiClient amiClient = new AmiClient(amiConfig);
amiClient.setEventListener(new AmiEventListener() {
    @Override
    public void onLogin(boolean success) {
        // TODO login
    }

    @Override
    public void onEvent(AmiEvent event) {
        // TODO received event
    }
});

amiClient.login();
AmiAction action = new ListCommandAction();
AmiMessage amiMessage = amiClient.sendAction(action);

amiClient.close();
```

### Possible Usage:
```
AmiClient amiClient = new AmiClient("192.168.0.120", 5038);
amiClient.setEventListener(new AmiEventListener() {
    @Override
    public void onLogin(boolean success) {
        // TODO login
    }

    @Override
    public void onEvent(AmiEvent event) {
        // TODO received event
    }
});

amiClient.login("asterisk", "asterisk");
AmiAction action = new ListCommandAction();
AmiMessage amiMessage = amiClient.sendAction(action);

amiClient.close();
```

<hr/>

## Agi Server Usage
### create an agi script
```
public class TestAgiScript implements BaseAgiScript {
    private static final Logger logger = LoggerFactory.getLogger(TestAgiScript.class);
    @Override
    public void service(AgiChannel channel) {
        channel.xxxx();
        List<String> args = channel.getArguments();
        // channel.hangup(); // channel cannot hangup, this is a problem is not resolved until now.
        channel.close();
    }
}
```

### start an agi server
```
AgiServer server = new AgiServer([your customize port]);
server.start();
```

### do agi request
```
agi://[your server ip]:[your server port]/TestAgiScript?arg1=aaa&arg2=bbb
```
## Author
- Wavin Don

## Welcome to contributed your beautiful code.