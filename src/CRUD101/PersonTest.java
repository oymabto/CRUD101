package CRUD101;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
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
        Emma.setAddress(456, "Sherbrooke St.", "Apartment", 238, "Montreal", "QC", "CANADA", "H3A 3G4");
        Peter.setAddress(17, "Sainte-Catherine St.", "Apartment", 203, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Lisa.setAddress(28, "Broad St.", "Apartment", 623, "New York", "NY", "USA", "PX 4Q");
        James.setAddress(5890, "Notre-Dame", "Apartment", 253, "Montreal", "QC", "CANADA", "H2Y 1B5");
        Robert.setAddress(17, "Sainte-Catherine St.", "Apartment", 323, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Mary.setAddress(15, "Richardson", "Apartment", 223, "New York", "QC", "CANADA", "H3K 1G6");
        Kevin.setAddress(17, "Sainte-Catherine St.", "Apartment", 768, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Michelle.setAddress(467, "René-Lévesque Blvd", "Apartment", 2, "Montreal", "QC", "CANADA", "H3B 1X9");
        Stephanie.setAddress(5890, "Notre-Dame", "Apartment", 5, "Montreal", "QC", "CANADA", "H2Y 1B5");
        William.setAddress(15, "Richardson", "Apartment", 8, "Montreal", "QC", "CANADA", "H3K 1G6");
        Ashley.setAddress(17, "Sainte-Catherine St.", "Apartment", 9, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Susan.setAddress(467, "René-Lévesque Blvd", "Apartment", 80, "Montreal", "QC", "CANADA", "H3B 1X9");
        Roger.setAddress(17, "Sainte-Catherine St.", "Apartment", 70, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Sarah.setAddress(467, "René-Lévesque Blvd", "Apartment", 46, "Montreal", "QC", "CANADA", "H3B 1X9");
        Jesse.setAddress(5890, "Notre-Dame", "Apartment", 37, "Montreal", "QC", "CANADA", "H2Y 1B5");
        Bruce.setAddress(17, "Sainte-Catherine St.", "Apartment", 25, "Montreal", "QC", "CANADA", "H2Y 3X4");
        Nancy.setAddress(467, "René-Lévesque Blvd", "Apartment", 46, "Montreal", "QC", "CANADA", "H3B 1X9");
        Austin.setAddress(467, "René-Lévesque Blvd", "Apartment", 78, "Montreal", "QC", "CANADA", "H3B 1X9");
        Carol.setAddress(456, "Sherbrooke St.", "Apartment", 23, "Montreal", "QC", "CANADA", "H3A 3G4");

        Paul.setPhoneNumber(1, 514, 546, 9876);
        Emma.setPhoneNumber(1, 514, 278, 2389);
        Peter.setPhoneNumber(1, 212, 880, 7654);
        Lisa.setPhoneNumber(1, 514, 123, 1089);
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

        Scanner input = new Scanner(System.in);
        System.out.println("Which area code are you looking for?\n");
        int areaCodeNumber = input.nextInt();

        int count = 0;
        for (int i = 0; i < allPersons.size(); i++) {
            if (allPersons.get(i).getPhoneNumber().getAreaCode() == areaCodeNumber) {
                System.out.print("\n" + i + ": ");
                System.out.println(allPersons.get(i));
                count++;
            }
        }
        System.out.println("\nThere are " + count + " phone numbers with " + areaCodeNumber + "area code.");
    }
}
