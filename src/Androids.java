import devices.LinuxOS;
import devices.Smartphones;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Виклик на Android");
    }

    @Override
    public void sms() {
        System.out.println("Повідомлення на Android");
    }

    @Override
    public void internet() {
        System.out.println("Під'єднання інтернету до Android");
    }

    @Override
    public void LinuxOSApp() {
        System.out.println("Встановлення Linux додатка на Android");
    }
}
