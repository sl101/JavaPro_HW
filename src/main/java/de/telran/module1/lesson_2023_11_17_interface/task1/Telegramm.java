package de.telran.module1.lesson_2023_11_17_interface.task1;

public class Telegramm implements Messenger{
    String messengerName = "Telegramm";
    @Override
    public void sendMessage(String message) {
        System.out.printf("%s принял сообщение: - '%s'\n", this.messengerName, message);
    }

    @Override
    public String getMessage() {
        return "Это сообщение отправлено из" + messengerName;
    }
}
