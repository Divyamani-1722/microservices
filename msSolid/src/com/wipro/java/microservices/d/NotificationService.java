package com.wipro.java.microservices.d;


public class NotificationService {
    private MessageSender messageSender; // Depending on abstraction

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.sendMessage(message);
    }
}