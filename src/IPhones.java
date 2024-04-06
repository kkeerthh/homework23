import devices.Smartphones;
import devices.IOS;

public class IPhones implements Smartphones, IOS {
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
    public void IOSApp() {
        System.out.println("Встановлення iOS додатка на iPhone");
    }
}
