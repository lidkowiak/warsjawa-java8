package pl.touk.wasjawa.java8.exercise.ex13;

public class DomainRegister {
    public void registry(String domainName, User user) {
        System.out.println("Registering domain " + domainName + " for buyer " + user.getName());
    }

    public void renew(String domainName) {
        System.out.println("Registering domain " + domainName);
    }

    public void reactivate(String domainName) {
        System.out.println("Registering domain " + domainName);
    }
}
