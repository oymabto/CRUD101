package CRUD101;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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

        Paul.setAddress(5890, "Notre-Dame", "Apartment", 263, "Montreal", "QC", "CANADA", "H2Y 1B5");
        Emma.setAddress(456, "Sherbrooke", "Apartment", 238, "Montreal", "QC", "CANADA", "H3A 3G4");
        Peter.setAddress(17, "Sainte-Catherine", "Apartment", 203, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Lisa.setAddress(28, "Broad", "Apartment", 623, "New York", "NY", "USA", "PX 4Q");
        James.setAddress(5890, "Notre-Dame", "Apartment", 253, "Montreal", "QC", "CANADA", "H2Y 1B5");
        Robert.setAddress(17, "Sainte-Catherine", "Apartment", 323, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Mary.setAddress(15, "Richardson", "Apartment", 223, "New York", "QC", "CANADA", "H3K 1G6");
        Kevin.setAddress(17, "Sainte-Catherine", "Apartment", 768, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Michelle.setAddress(467, "Saint-Antoine", "Apartment", 2, "Montreal", "QC", "CANADA", "H3B 1X9");
        Stephanie.setAddress(5890, "Notre-Dame", "Apartment", 5, "Montreal", "QC", "CANADA", "H2Y 1B5");
        William.setAddress(15, "Richardson", "Apartment", 8, "Montreal", "QC", "CANADA", "H3K 1G6");
        Ashley.setAddress(17, "Sainte-Catherine", "Apartment", 9, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Susan.setAddress(467, "Saint-Antoine", "Apartment", 80, "Montreal", "QC", "CANADA", "H3B 1X9");
        Roger.setAddress(17, "Sainte-Catherine", "Apartment", 70, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Sarah.setAddress(467, "Saint-Antoine", "Apartment", 46, "Montreal", "QC", "CANADA", "H3B 1X9");
        Jesse.setAddress(5890, "Notre-Dame", "Apartment", 37, "Montreal", "QC", "CANADA", "H2Y 1B5");
        Bruce.setAddress(17, "Sainte-Catherine", "Apartment", 25, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Nancy.setAddress(467, "Saint-Antoine", "Apartment", 46, "Montreal", "QC", "CANADA", "H3B 1X9");
        Austin.setAddress(467, "Saint-Antoine", "Apartment", 78, "Montreal", "QC", "CANADA", "H3B 1X9");
        Carol.setAddress(456, "Sherbrooke", "Apartment", 23, "Montreal", "QC", "CANADA", "H3A 3G4");

        Paul.setPhoneNumber(1, 514, 546, 9876);
        Emma.setPhoneNumber(1, 514, 278, 2389);
        Peter.setPhoneNumber(1, 514, 880, 7654);
        Lisa.setPhoneNumber(1, 212, 123, 1089);
        James.setPhoneNumber(1, 438, 947, 8181);
        Robert.setPhoneNumber(1, 514, 234, 9000);
        Mary.setPhoneNumber(1, 438, 312, 9338);
        Kevin.setPhoneNumber(1, 514, 778, 4227);
        Michelle.setPhoneNumber(1, 438, 543, 8065);
        Stephanie.setPhoneNumber(1, 514, 903, 4555);
        William.setPhoneNumber(1, 514, 167, 3987);
        Ashley.setPhoneNumber(1, 438, 421, 5076);
        Susan.setPhoneNumber(1, 514, 850, 6550);
        Roger.setPhoneNumber(1, 438, 126, 4540);
        Sarah.setPhoneNumber(1, 514, 873, 7676);
        Jesse.setPhoneNumber(1, 438, 200, 9834);
        Bruce.setPhoneNumber(1, 514, 666, 2783);
        Nancy.setPhoneNumber(1, 438, 777, 8374);
        Austin.setPhoneNumber(1, 514, 888, 8902);
        Carol.setPhoneNumber(1, 438, 999, 1759);

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

        System.out.println("\nMenu:");
        System.out.println("1: Add a person" + "\n2: Remove a person" + "\n3: Update Phone Number" + "\n4: Update Address" + "\n5: Search and Display Phone Number" + "\n6: Search and Display Address");
        int menu = input.nextInt();

        int count = 0;

        switch (menu) {
            case 1:
                System.out.println("Please add a person: ");
                String newPerson = input.next();
                Person person = new Person(newPerson);
                System.out.println("Please add a country code: ");
                int countryCode = input.nextInt();
                System.out.println("Please add an area code: ");
                int areaCode = input.nextInt();
                System.out.println("Please add a phone prefix: ");
                int phonePrefix = input.nextInt();
                System.out.println("Please add a line number: ");
                int lineNumber = input.nextInt();
                person.setPhoneNumber(countryCode, areaCode, phonePrefix, lineNumber);

                System.out.println("Please add a street number: ");
                int streetNumber = input.nextInt();
                System.out.println("Please add a street name: ");
                String streetName = input.next();
                System.out.println("Please add a building Type: ");
                String buildingType = input.next();
                System.out.println("Please add an apartment number ");
                int apartmentNumber = input.nextInt();
                System.out.println("Please add a city name: ");
                String cityName = input.next();
                System.out.println("Please add a state name: ");
                String stateName = input.next();
                System.out.println("Please add a country name: ");
                String countryName = input.next();
                System.out.println("Please add a zip code: ");
                String zipCode = input.next();
                person.setAddress(streetNumber, streetName, buildingType, apartmentNumber, cityName, stateName, countryName, zipCode);
                allPersons.add(person);
                break;
            case 2:
                System.out.println("Please enter the name of the person you wish to remove: \n");
                String personName = input.next();
                for (int i = 0; i < allPersons.size(); i++) {
                    if (allPersons.get(i).equals(personName)) {
                        allPersons.remove(i);
                    }
                }
                System.out.println("Done!");
                break;
            case 3:
                System.out.println("Which area code are you looking for ?\n");
                int areaCode1 = input.nextInt();
                for (int i = 0; i < allPersons.size(); i++) {
                    if (allPersons.get(i).getPhoneNumber().getAreaCode() == areaCode1) {
                        System.out.print("\n" + i + ": ");
                        System.out.println(allPersons.get(i).getPhoneNumber());
                    }
                }
                System.out.println("Please select the Phone number index you wish to update?\n");
                int phoneIndex1 = input.nextInt();
                System.out.println("Please enter a new are code: ");
                int newAreaCode = input.nextInt();
                allPersons.get(phoneIndex1).getPhoneNumber().setAreaCode(newAreaCode);

                System.out.println("Done!");
                System.out.println("New phone number:\n");
                System.out.print(phoneIndex1 + ": ");
                System.out.println(allPersons.get(phoneIndex1).getPhoneNumber());
                break;
            case 4:
                System.out.println();
        }
    }
}

