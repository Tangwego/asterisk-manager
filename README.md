## Usage
## Common Usage:
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

## Possible Usage:
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