package de.telran.module1.lecture3.task1;

public class Viber implements Messenger{
    String messengerName = "Viber";
    @Override
    public void sendMessage(String message) {
        System.out.printf("%s принял сообщение: - '%s'\n", this.messengerName, message);
    }

    @Override
    public String getMessage() {
        return "Это сообщение отправлено из" + messengerName;
    }
}
