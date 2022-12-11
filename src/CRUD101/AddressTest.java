package CRUD101;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressTest {
    public static void main(String[] args) {


    Address paulAddress = new Address(5890, "Notre-Dame", "Apartment", 263, "Montreal", "QC", "CANADA", "H2Y 1B5");
    Address emmaAddress = new Address(456, "Sherbrooke St.", "Apartment", 238, "Montreal", "QC", "CANADA", "H3A 3G4");
    Address peterAddress = new Address(17, "Sainte-Catherine St.", "Apartment", 203, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address lisaAddress = new Address(28, "Broad St.", "Apartment", 623, "New York", "NY", "USA", "PX 4Q");
    Address jamesAddress = new Address(5890, "Notre-Dame", "Apartment", 253, "Montreal", "QC", "CANADA", "H2Y 1B5");
    Address robertAddress = new Address(17, "Sainte-Catherine St.", "Apartment", 323, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address maryAddress = new Address(15, "Richardson", "Apartment", 223, "New York", "QC", "CANADA", "H3K 1G6");
    Address kevinAddress = new Address(17, "Sainte-Catherine St.", "Apartment", 768, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address michelleAddress = new Address(467, "René-Lévesque Blvd", "Apartment", 2, "Montreal", "QC", "CANADA", "H3B 1X9");
    Address stephanieAddress = new Address(5890, "Notre-Dame", "Apartment", 5, "Montreal", "QC", "CANADA", "H2Y 1B5");
    Address williamAddress = new Address(15, "Richardson", "Apartment", 8, "Montreal", "QC", "CANADA", "H3K 1G6");
    Address ashleyAddress = new Address(17, "Sainte-Catherine St.", "Apartment", 9, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address susanAddress = new Address(467, "René-Lévesque Blvd", "Apartment", 80, "Montreal", "QC", "CANADA", "H3B 1X9");
    Address rogerAddress = new Address(17, "Sainte-Catherine St.", "Apartment", 70, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address sarahAddress = new Address(467, "René-Lévesque Blvd", "Apartment", 46, "Montreal", "QC", "CANADA", "H3B 1X9");
    Address jesseAddress = new Address(5890, "Notre-Dame", "Apartment", 37, "Montreal", "QC", "CANADA", "H2Y 1B5");
    Address bruceAddress = new Address(17, "Sainte-Catherine St.", "Apartment", 25, "Montreal", "QC", "CANADA", "H2Y 3X4");
    Address nancyAddress = new Address(467, "René-Lévesque Blvd", "Apartment", 46, "Montreal", "QC", "CANADA", "H3B 1X9");
    Address austinAddress = new Address(467, "René-Lévesque Blvd", "Apartment", 78, "Montreal", "QC", "CANADA", "H3B 1X9");
    Address carolAddress = new Address(456, "Sherbrooke St.", "Apartment", 23, "Montreal", "QC", "CANADA", "H3A 3G4");

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

    Scanner input = new Scanner(System.in);
        System.out.println("Which street name are you looking for?\n");
        String street = input.nextLine();

    int count =0;
    for (int i = 0; i < allAddresses.size(); i++){
        if (allAddresses.get(i).getStreetName().equals (street)){
            System.out.println("\n" + i + ": ");
            System.out.println(allAddresses.get(i));
            count++;
        }
    }
        System.out.println("\nThere are " + count + " addresses include " + street + ".");
    }
}
