package Homework_7.Task3;

public class SmartphoneTester {
    public static void main(String[] args) {
        iOSSmartphone iOSSmartphone = new iOSSmartphone();
        iOSSmartphone.phoneNumber();
        System.out.println("The operation system is: " + iOSSmartphone.getOperationSystem());
        System.out.println("The Charger is: " + iOSSmartphone.getCharger());
        System.out.println("The Store is: " + iOSSmartphone.getAppStore());

        AndroidSmartphone AndroidSmartphone = new AndroidSmartphone();
        System.out.println("The operation system is: " + AndroidSmartphone.getOperationSystem());
        System.out.println("The Charger is: " + AndroidSmartphone.getCharger());
        System.out.println("The Store is: " + AndroidSmartphone.getAppStore());

    }
}
