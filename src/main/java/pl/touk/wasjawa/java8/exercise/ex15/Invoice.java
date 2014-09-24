package pl.touk.wasjawa.java8.exercise.ex15;

public class Invoice {

    private User user;
    private NotifyType notifyType;

    public void sendInvoice() {
        if (notifyType == NotifyType.EMAIL) {
            System.out.println("build and send email");
        } else if (notifyType == NotifyType.SMS) {
            System.out.println("send sms");
        } else {
            throw new IllegalStateException("Unknow notify type " + notifyType);
        }
    }

    public void sendPaymentReminder() {
        if (notifyType == NotifyType.EMAIL) {
            System.out.println("build and send email");
        } else if (notifyType == NotifyType.SMS) {
            System.out.println("send sms");
        } else {
            throw new IllegalStateException("Unknow notify type " + notifyType);
        }
    }

    public enum NotifyType {
        EMAIL,
        SMS
    }
}
