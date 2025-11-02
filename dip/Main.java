package dip;

public class Main {
    public static void main(String[] args) {
        // Notifikasi via Email
        Notification email = new EmailNotification();
        NotificationService emailService = new NotificationService(email);
        emailService.notifyUser("Selamat datang!");
        
        // Notifikasi via SMS
        Notification sms = new SMSNotification();
        NotificationService smsService = new NotificationService(sms);
        smsService.notifyUser("Pembayaran berhasil");
    }
}