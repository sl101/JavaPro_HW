package de.telran.module1.lecture_17_11_interface.task1;

public class WhatsApp implements Messenger{
    String messengerName = "WhatsApp";
    @Override
    public void sendMessage(String message) {
        System.out.printf("%s принял сообщение: - '%s'\n", this.messengerName, message);
    }

    @Override
    public String getMessage() {
        return "Это сообщение отправлено из" + messengerName;
    }
}
