package Classes;

import enums.Status;
import interfacess.WhatsAppInterface;

import java.util.*;

public class WhatsApp implements WhatsAppInterface {
    private String phoneNumber;
    private String name;
    private String password;
    private Status status = Status.ПРИВЕТЬ_Я_ИСПОЛЬЗУЮ_WHATSAPP;
    private String imeges = "DEFOLT_IMAGES";
    private List<Contact> contacts;

    private List<String> group;

    public WhatsApp() {
    }

    public WhatsApp(String phoneNumber, String name, String password, Status status, String imeges, List<Contact> contacts, List<String> group) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.password = password;
        this.status = status;
        this.imeges = imeges;
        this.contacts = contacts;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGroup() {
        return group;
    }

    public void setGroup(List<String> group) {
        this.group = group;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getImeges() {
        return imeges;
    }

    public void setImeges(String imeges) {
        this.imeges = imeges;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public void createWhatsapp(List<Person> people, List<WhatsApp> whatsApps) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("najmite 1 chtoby zayti v whatsapp");
        int a = scanner1.nextInt();
        switch (a) {
            case 1:
                Scanner scanner = new Scanner(System.in);
            System.out.println("write phone number");
            String strNumber = scanner.nextLine();
            for (Person person: people) {
                if (person.getPhoneNumber().contains(strNumber)) {
                    System.out.println("write name");
                    String strName = scanner.nextLine();
                    System.out.println("write password");
                    String strPassword = scanner.nextLine();
                    if (person.getPassword().contains(strPassword)) {
                        System.out.println("write number this add contact ");
                        whatsApps.add(new WhatsApp(strNumber, strName, strPassword, status, imeges,contacts, getGroup()));
                        System.out.println(whatsApps);
                        System.out.println("registration completed successfully");
                    } else {
                        System.out.println("porol ne pravilno");
                    }
                }
            }break;
        }


    }

    public void getContact(Contact contacts, List<WhatsApp> whatsApps) {
        System.out.println("write number this add contact ");
        Scanner scanner = new Scanner(System.in);
        String strPhoneNumber = scanner.nextLine();
        for (WhatsApp whatsApp : whatsApps) {
            if (whatsApp.getPhoneNumber().contains(strPhoneNumber)){
                System.out.println("write name ");
                String strName = scanner.nextLine();
                contacts.setPhoneNumber(strPhoneNumber);
                contacts.setName(strName);
                System.out.println(contacts);
            }
        }
    }

    public void messegerS(List<WhatsApp> whatsApps , List<String> meseger){
        System.out.println("comu pishite sms napishte number ili name ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (WhatsApp whatsApp : whatsApps) {
            if (whatsApp.getContacts().contains(str)){
                System.out.println("napishite sms");
                String meseg = scanner.nextLine();
                System.out.println(meseger.add(meseg));
            }
        }
    }

    void statusChenge(List<WhatsApp> statuses) {
    }

    @Override
    public String toString() {
        return "\nPhone Number :" + phoneNumber +
                "\nName :" + name +
                "\nImages :" + imeges +
                "\nStatus :" + status +
                "\nContacts :" + contacts +
                "\nGroup :" + group +
                "\n>>>>>>>>><<<<<<<<<";
    }
}
