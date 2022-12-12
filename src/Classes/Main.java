package Classes;

import enums.Country;
import enums.Gender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> meseger = new ArrayList<>();
        Contact contacts = new Contact();
        Person person = new Person();
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(new Person("333", "0552930920", "Baiysh", Country.BISHKEK, "b77", Gender.GENDER),
        new Person("444", "0777888888", "Kurstan", Country.BISHKEK, "k22", Gender.GENDER)));
        WhatsApp whatsApp = new WhatsApp();
        ArrayList<WhatsApp> whatsApps = new ArrayList<>();


        while (true) {
            System.out.println("========= Comands =========");
            System.out.println("press 1 to get by  all account ");
            System.out.println("press 2 to great Person");
            System.out.println("press 3 to great WhatsApp");
            System.out.println("press 4 to change status");
            System.out.println("press 5 to send messenger");
            System.out.println("press 6 to videt vse whatspp");
            System.out.println("najmite 7 choby videt vse votsappy");
            System.out.println("najmite 8 chtoby nayti contact");
            Scanner scanner = new Scanner(System.in);
            int str = scanner.nextInt();
            switch (str) {
                case 1:
                    System.out.println(people);
                    break;
                case 2:
                    person.creatPerson(people);
                    break;
                case 3:
                    whatsApp.createWhatsapp(people, whatsApps);
                    break;
                case 4:
                    whatsApp.statusChenge(whatsApps);
                case 5:
                    whatsApp.messegerS(whatsApps, meseger);
                    break;
                case 6:
                    System.out.println(whatsApps);
                    break;
                case 7:
                    System.out.println(contacts);
                    break;
                case 8:
                    whatsApp.getContact(contacts, whatsApps);
                    break;
                case 9:
                    break;
            }


        }
    }
}