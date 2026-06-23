package com.example.loose;

public class UserService {
    public  NotificationService notificationService;
    UserService(){}
    UserService(NotificationService notificationService){
        this.notificationService = notificationService;
    }
    public void  notifyUser(String message){
        this.notificationService.send("Notiifcation service Hello");
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
