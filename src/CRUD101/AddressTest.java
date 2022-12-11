package CRUD101;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressTest {
    public static void main(String[] args) {


    Address address1 = new Address(5890, "Notre-Dame", "Apartment", 263, "Montreal", "QC", "CANADA", "H2Y 1B5");
    Address address2 = new Address(456, "Sherbrooke St.", "Apartment", 238, "Montreal", "QC", "CANADA", "H3A 3G4");
    Address address3 = new Address(17, "Sainte-Catherine St.", "Apartment", 203, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address address4 = new Address(28, "Broad St.", "Apartment", 623, "New York", "NY", "USA", "PX 4Q");
    Address address5 = new Address(5890, "Notre-Dame", "Apartment", 253, "Montreal", "QC", "CANADA", "H2Y 1B5");
    Address address6 = new Address(17, "Sainte-Catherine St.", "Apartment", 323, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address address7 = new Address(15, "Richardson", "Apartment", 223, "New York", "QC", "CANADA", "H3K 1G6");
    Address address8 = new Address(17, "Sainte-Catherine St.", "Apartment", 768, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address address9 = new Address(467, "René-Lévesque Blvd", "Apartment", 2, "Montreal", "QC", "CANADA", "H3B 1X9");
    Address address10 = new Address(5890, "Notre-Dame", "Apartment", 5, "Montreal", "QC", "CANADA", "H2Y 1B5");
    Address address11 = new Address(15, "Richardson", "Apartment", 8, "Montreal", "QC", "CANADA", "H3K 1G6");
    Address address12 = new Address(17, "Sainte-Catherine St.", "Apartment", 9, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address address13 = new Address(467, "René-Lévesque Blvd", "Apartment", 80, "Montreal", "QC", "CANADA", "H3B 1X9");
    Address address14 = new Address(17, "Sainte-Catherine St.", "Apartment", 70, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address address15 = new Address(467, "René-Lévesque Blvd", "Apartment", 46, "Montreal", "QC", "CANADA", "H3B 1X9");
    Address address16 = new Address(5890, "Notre-Dame", "Apartment", 37, "Montreal", "QC", "CANADA", "H2Y 1B5");
    Address address17 = new Address(17, "Sainte-Catherine St.", "Apartment", 25, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address address18 = new Address(467, "René-Lévesque Blvd", "Apartment", 46, "Montreal", "QC", "CANADA", "H3B 1X9");
    Address address19 = new Address(467, "René-Lévesque Blvd", "Apartment", 78, "Montreal", "QC", "CANADA", "H3B 1X9");
    Address address20 = new Address(456, "Sherbrooke St.", "Apartment", 23, "Montreal", "QC", "CANADA", "H3A 3G4");

    ArrayList <Address> allAddresses = new ArrayList<>();

    allAddresses.add(address1);
    allAddresses.add(address2);
    allAddresses.add(address3);
    allAddresses.add(address4);
    allAddresses.add(address5);
    allAddresses.add(address6);
    allAddresses.add(address7);
    allAddresses.add(address8);
    allAddresses.add(address9);
    allAddresses.add(address10);
    allAddresses.add(address11);
    allAddresses.add(address12);
    allAddresses.add(address13);
    allAddresses.add(address14);
    allAddresses.add(address15);
    allAddresses.add(address16);
    allAddresses.add(address17);
    allAddresses.add(address18);
    allAddresses.add(address19);
    allAddresses.add(address20);

    Scanner input = new Scanner(System.in);
        System.out.println("Which street name are you looking for?\n");
        String street = input.nextLine();

        int count =0;
    for (int i = 0; i < allAddresses.size(); i++){
        if (allAddresses.get(i).getStreetName().equals (street)){
            System.out.println("\n" + i);
            System.out.println(allAddresses.get(i));
            count++;
        }
    }
        System.out.println("\nThere are " + count + " addresses include " + street + ".");
    }
}
