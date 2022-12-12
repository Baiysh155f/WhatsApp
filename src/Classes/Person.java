package Classes;

import enums.Country;
import enums.Gender;
import interfacess.Personable;

import java.util.*;

public class Person implements Personable {
    private String id;
    private String phoneNumber;
    private String name;
    private Country country;

    private String password;
    private Gender gender;

    public Person() {
    }

    public Person(String id, String phoneNumber, String name, Country country, String password, Gender gender) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.country = country;
        this.password = password;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void creatPerson(List<Person> people) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("you wont add account ?");
            String str = scanner.nextLine();
            if (str.contains("no")) {
                break;
            } else {
                System.out.println("write a key");
                String strKey = scanner.nextLine();
                System.out.println("write ID");
                String strLongId = scanner.nextLine();
                System.out.println("write phone number");
                String strLongNum = scanner.nextLine();
                System.out.println("write name");
                String srtStringName1 = scanner.nextLine();
                System.out.println("write address");
                String srtStringAddress = scanner.nextLine().toUpperCase();
                System.out.println("write password");
                String strPossword = scanner.nextLine();
                System.out.println("write gen");
                String strGender = scanner.nextLine().toUpperCase();
                    people.add(new Person(strLongId, strLongNum, srtStringName1, Country.valueOf(srtStringAddress), strPossword, Gender.valueOf(strGender)));
                    System.out.println("registration completed successfully");
            }
        }
    }


//    @Override
//    public void getContact(List<Contact> contacts, List<WhatsApp> whatsApps) {
//        System.out.println("write number this add contact ");
//        Scanner scanner = new Scanner(System.in);
//        String strId = scanner.nextLine();
//        for (WhatsApp whatsApp : whatsApps) {
//            if (whatsApp.getPhoneNumber().contains(strId)){
//                contacts.add(new Contact(Collections.singletonList(whatsApp.getPhoneNumber() + " " + whatsApp.getName())));
//                System.out.println(contacts);
//            }
//        }
//    }



    @Override
    public String toString() {
        return "\nID :" + id +
                "\nPhone Number :" + phoneNumber +
                "\nName :" + name +
                "\nCountry :" + country +
                "\nPassword :" + password +
                "\nGender :" + gender +
                "\n>>>>>>>><<<<<<<<";
    }
}