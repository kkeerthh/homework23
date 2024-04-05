import devices.Smartphones;
import devices.iOS;

public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Виклик на iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Повідомлення на iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Під'єднання інтернету до iPhone");
    }

    @Override
    public void iOSApp() {
        System.out.println("Встановлення iOS додатка на iPhone");
    }
}
