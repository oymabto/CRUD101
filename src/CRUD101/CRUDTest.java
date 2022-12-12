package CRUD101;

import java.util.ArrayList;
import java.util.Scanner;

public class CRUDTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Person Paul = new Person("Paul");
        Person Emma = new Person("Emma");
        Person Peter = new Person("Peter");
        Person Lisa = new Person("Lisa");
        Person James = new Person("James");
        Person Robert = new Person("Robert");
        Person Mary = new Person("Mary");
        Person Kevin = new Person("Kevin");
        Person Michelle = new Person("Michelle");
        Person Stephanie = new Person("Stephanie");
        Person William = new Person("William");
        Person Ashley = new Person("Ashley");
        Person Susan = new Person("Susan");
        Person Roger = new Person("Roger");
        Person Sarah = new Person("Sarah");
        Person Jesse = new Person("Jesse");
        Person Bruce = new Person("Bruce");
        Person Nancy = new Person("Nancy");
        Person Austin = new Person("Austin");
        Person Carol = new Person("Carol");

        ArrayList<Person> allPersons = new ArrayList<>();

        allPersons.add(Paul);
        allPersons.add(Emma);
        allPersons.add(Peter);
        allPersons.add(Lisa);
        allPersons.add(James);
        allPersons.add(Robert);
        allPersons.add(Mary);
        allPersons.add(Kevin);
        allPersons.add(Michelle);
        allPersons.add(Stephanie);
        allPersons.add(William);
        allPersons.add(Ashley);
        allPersons.add(Susan);
        allPersons.add(Roger);
        allPersons.add(Sarah);
        allPersons.add(Jesse);
        allPersons.add(Bruce);
        allPersons.add(Nancy);
        allPersons.add(Austin);
        allPersons.add(Carol);

        Address paulAddress = new Address(5890, "Notre-Dame", "Apartment", 263, "Montreal", "QC", "CANADA", "H2Y 1B5");
        Address emmaAddress = new Address(456, "Sherbrooke", "Apartment", 238, "Montreal", "QC", "CANADA", "H3A 3G4");
        Address peterAddress = new Address(17, "Sainte-Catherine", "Apartment", 203, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Address lisaAddress = new Address(28, "Broad", "Apartment", 623, "New York", "NY", "USA", "PX 4Q");
        Address jamesAddress = new Address(5890, "Notre-Dame", "Apartment", 253, "Montreal", "QC", "CANADA", "H2Y 1B5");
        Address robertAddress = new Address(17, "Sainte-Catherine", "Apartment", 323, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Address maryAddress = new Address(15, "Richardson", "Apartment", 223, "New York", "QC", "CANADA", "H3K 1G6");
        Address kevinAddress = new Address(17, "Sainte-Catherine", "Apartment", 768, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Address michelleAddress = new Address(467, "Saint-Antoine", "Apartment", 2, "Montreal", "QC", "CANADA", "H3B 1X9");
        Address stephanieAddress = new Address(5890, "Notre-Dame", "Apartment", 5, "Montreal", "QC", "CANADA", "H2Y 1B5");
        Address williamAddress = new Address(15, "Richardson", "Apartment", 8, "Montreal", "QC", "CANADA", "H3K 1G6");
        Address ashleyAddress = new Address(17, "Sainte-Catherine", "Apartment", 9, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Address susanAddress = new Address(467, "Saint-Antoine", "Apartment", 80, "Montreal", "QC", "CANADA", "H3B 1X9");
        Address rogerAddress = new Address(17, "Sainte-Catherine", "Apartment", 70, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Address sarahAddress = new Address(467, "Saint-Antoine", "Apartment", 46, "Montreal", "QC", "CANADA", "H3B 1X9");
        Address jesseAddress = new Address(5890, "Notre-Dame", "Apartment", 37, "Montreal", "QC", "CANADA", "H2Y 1B5");
        Address bruceAddress = new Address(17, "Sainte-Catherine", "Apartment", 25, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Address nancyAddress = new Address(467, "Saint-Antoine", "Apartment", 46, "Montreal", "QC", "CANADA", "H3B 1X9");
        Address austinAddress = new Address(467, "Saint-Antoine", "Apartment", 78, "Montreal", "QC", "CANADA", "H3B 1X9");
        Address carolAddress = new Address(456, "Sherbrooke", "Apartment", 23, "Montreal", "QC", "CANADA", "H3A 3G4");

        ArrayList <Address> allAddresses = new ArrayList<>();

        allAddresses.add(paulAddress);
        allAddresses.add(emmaAddress);
        allAddresses.add(peterAddress);
        allAddresses.add(lisaAddress);
        allAddresses.add(jamesAddress);
        allAddresses.add(robertAddress);
        allAddresses.add(maryAddress);
        allAddresses.add(kevinAddress);
        allAddresses.add(michelleAddress);
        allAddresses.add(stephanieAddress);
        allAddresses.add(williamAddress);
        allAddresses.add(ashleyAddress);
        allAddresses.add(susanAddress);
        allAddresses.add(rogerAddress);
        allAddresses.add(sarahAddress);
        allAddresses.add(jesseAddress);
        allAddresses.add(bruceAddress);
        allAddresses.add(nancyAddress);
        allAddresses.add(austinAddress);
        allAddresses.add(carolAddress);

        Phone paulPhone = new Phone(1, 514, 546, 9876);
        Phone emmaPhone = new Phone(1, 514, 278, 2389);
        Phone peterPhone = new Phone(1, 514, 880, 7654);
        Phone lisaPhone = new Phone(1, 212, 123, 1089);
        Phone jamesPhone = new Phone(1, 438, 947, 8181);
        Phone robertPhone = new Phone(1, 514, 234, 9000);
        Phone maryPhone = new Phone(1, 438, 312, 9338);
        Phone kevinPhone = new Phone(1, 514, 778, 4227);
        Phone michellePhone = new Phone(1, 438, 543, 8065);
        Phone stephaniePhone = new Phone(1, 514, 903, 4555);
        Phone williamPhone = new Phone(1, 514, 167, 3987);
        Phone ashleyPhone = new Phone(1, 438, 421, 5076);
        Phone susanPhone = new Phone(1, 514, 850, 6550);
        Phone rogerPhone = new Phone(1, 438, 126, 4540);
        Phone sarahPhone = new Phone(1, 514, 873, 7676);
        Phone jessePhone = new Phone(1, 438, 200, 9834);
        Phone brucePhone = new Phone(1, 514, 666, 2783);
        Phone nancyPhone = new Phone(1, 438, 777, 8374);
        Phone austinPhone = new Phone(1, 514, 888, 8902);
        Phone carolPhone = new Phone(1, 438, 999, 1759);

        ArrayList<Phone> allPhones = new ArrayList<>();

        allPhones.add(paulPhone);
        allPhones.add(emmaPhone);
        allPhones.add(peterPhone);
        allPhones.add(lisaPhone);
        allPhones.add(jamesPhone);
        allPhones.add(robertPhone);
        allPhones.add(maryPhone);
        allPhones.add(kevinPhone);
        allPhones.add(michellePhone);
        allPhones.add(stephaniePhone);
        allPhones.add(williamPhone);
        allPhones.add(ashleyPhone);
        allPhones.add(susanPhone);
        allPhones.add(rogerPhone);
        allPhones.add(sarahPhone);
        allPhones.add(jessePhone);
        allPhones.add(brucePhone);
        allPhones.add(nancyPhone);
        allPhones.add(austinPhone);
        allPhones.add(carolPhone);

        for (int j = 0; j < allPersons.size(); j++) {
            allPersons.get(j).setPhoneNumber(allPhones.get(j));
            allPersons.get(j).setAddress(allAddresses.get(j));
        }

        System.out.println("\nSearch for?\n");
        System.out.println("1-Area code\n" + "2-Street name\n" + "3-Zip code\n");
        int number = in.nextInt();

        System.out.println("\nReturn:\n");
        System.out.println("1-Person\n" + "2-Full Address\n" + "3-Phone number\n");
        int answer = in.nextInt();

        int count = 0;

        if (number == 1) {
            System.out.println("Please enter the area code: \n");
            int areaCodeNumber = in.nextInt();

            for (Person allPerson : allPersons) {
                if (allPerson.getPhoneNumber().getAreaCode() == areaCodeNumber) {
                    count++;
                    System.out.print("\n" + count + ": ");
                    if (answer == 1) {
                        System.out.println(allPerson.getName());
                    } else if (answer == 2) {
                        System.out.println(allPerson.getAddress());
                    } else if (answer == 3) {
                        System.out.println(allPerson.getPhoneNumber());
                    } else {
                        System.out.println("Please enter a number between 1 and 3.");
                    }
                }
            }
            System.out.println("\nThere are " + count + " persons with " + areaCodeNumber + " area code.");
        } else if (number == 2) {
            System.out.println("Please enter the street name: \n");
            String street = in.next();

            for (Person allPerson : allPersons) {

                if (allPerson.getAddress().getStreetName().equals(street)) {
                    count++;
                    System.out.print("\n" + count + ":  ");
                    if (answer == 1) {
                        System.out.println(allPerson.getName());
                    } else if (answer == 2) {
                        System.out.println(allPerson.getAddress());
                    } else if (answer == 3) {
                        System.out.println(allPerson.getPhoneNumber());
                    } else {
                        System.out.println("Please enter a number between 1 and 3.");
                    }
                }
            }
            System.out.println("\nThere are " + count + " persons with " + street + " street name.");
        } else if (number == 3) {
            System.out.println("Please enter the street name: \n");
            String addressZipCode = in.next();

            for (Person allPerson : allPersons) {
                if (allPerson.getAddress().getZipCode().equals(addressZipCode)) {
                    count++;
                    System.out.print("\n" + count + ": ");
                    if (answer == 1) {
                        System.out.println(allPerson.getName());
                    } else if (answer == 2) {
                        System.out.println(allPerson.getAddress());
                    } else if (answer == 3) {
                        System.out.println(allPerson.getPhoneNumber());
                    } else {
                        System.out.println("Please enter a number between 1 and 3.");
                    }
                }
            }
            System.out.println("\nThere are " + count + " persons live in an address with " + addressZipCode + " zip code.");
        }
        else {
            System.out.println("Please enter a number between 1 and 3.");
        }
    }
}
