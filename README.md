## 使用方法(Usage)
```
AmiClient amiClient = new AmiClient();
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
AmiConfig amiConfig = new AmiConfig();
amiConfig.setUsername("dishui");
amiConfig.setSecret("7moorcom");
amiClient.connect("192.168.121.63", 6058, 30, amiConfig);
AmiAction action = new ListCommandAction();
AmiMessage amiMessage = amiClient.sendAction(action);

amiClient.close();
```
