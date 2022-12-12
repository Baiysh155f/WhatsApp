package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Contact {
    private String phoneNumber;
    private String name;
    private List<String> messenger = new ArrayList<>();

    public Contact() {
    }

    public Contact(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;

    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMessenger() {
        return messenger;
    }

    public void setMessenger(List<String> messenger) {
        this.messenger = messenger;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", name='" + name + '\'' +
                ", messenger=" + messenger +
                '}';
    }
}
