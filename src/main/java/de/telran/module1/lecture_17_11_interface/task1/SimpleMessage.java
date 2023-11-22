package de.telran.module1.lecture_17_11_interface.task1;

public class SimpleMessage{
    public static void main(String[] args) {
        Messenger viber = new Viber();
        Messenger telegramm = new Telegramm();
        Messenger whatsApp = new WhatsApp();
        Messenger[] messendgersList = new Messenger[]{viber, telegramm, whatsApp};

        for (Messenger item: messendgersList) {
            item.sendMessage("Привет !!!");
            System.out.println(item.getMessage());
        }
    }
}
