package Homework_7.Task3;

public class iOSSmartphone extends Phone {
    private String operationSystem;
    private String charger;
    private String appStore;

    public iOSSmartphone() {
        setOperationSystem("IOS");
        setCharger("Lightning");
        setAppStore("App Store IOS");
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getAppStore() {
        return appStore;
    }

    public void setAppStore(String appStore) {
        this.appStore = appStore;
    }

    @Override
    String operationSystem() {
        return getOperationSystem();
    }

    @Override
    String charger() {
        return getCharger();
    }

    @Override
    String appStore() {
        return getAppStore();
    }

    @Override
    public void phoneNumber() {
        super.phoneNumber();
    }
}
