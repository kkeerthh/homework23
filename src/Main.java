import devices.Smartphones;

public class Main {
    public static void main(String[] args) {

        Smartphones android = new Androids();
        Smartphones iphone = new IPhones();

        System.out.println("Мобільний телефон-Android");
        android.call();
        android.sms();
        android.internet();
        ((Androids) android).LinuxOSApp();
        System.out.println();
        System.out.println("Мобільний телефон-iPhone");
        iphone.call();
        iphone.sms();
        iphone.internet();
        ((IPhones) iphone).IOSApp();
    }
}
