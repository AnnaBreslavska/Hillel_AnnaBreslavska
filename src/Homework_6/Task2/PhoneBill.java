package Homework_6.Task2;

import static Homework_5.Task3.internet;
import static Homework_5.Task3.calls;
import static Homework_5.Task3.messages;
import static Homework_5.Task3.roamingZoneOne;
import static Homework_5.Task3.roamingZoneTwo;


public class PhoneBill {

    private double phoneBill;

    private int gigabytes;
    private int minutes;
    private int sms;
    private int roamingZone1;
    private int roamingZone2;

    public PhoneBill(int gigabytes, int minutes, int sms, int roamingZone1, int roamingZone2) {
        this.gigabytes = gigabytes;
        this.minutes = minutes;
        this.sms = sms;
        this.roamingZone1 = roamingZone1;
        this.roamingZone2 = roamingZone2;
        setPhoneBill(totalPhoneBill(gigabytes,minutes,sms,roamingZone1,roamingZone2));
    }

    public double getPhoneBill() {
        return phoneBill;
    }

    public void setPhoneBill(double phoneBill) {
        this.phoneBill = phoneBill;
    }

    public static double totalPhoneBill(int gigabytes, int minutes, int sms, int roamingZone1, int roamingZone2) {
        double totalPaymentWithoutTax = internet(gigabytes) + calls(minutes) + messages(sms) + roamingZoneOne(roamingZone1) + roamingZoneTwo(roamingZone2);
        double tax = ((totalPaymentWithoutTax / 100) * 7);
        double totalPaymentWithTax = totalPaymentWithoutTax + tax;
        return totalPaymentWithTax;

    }
}
