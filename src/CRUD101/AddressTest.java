package CRUD101;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressTest {
    public static void main(String[] args) {

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

        ArrayList<Address> allAddresses = new ArrayList<>();

        addressNames(paulAddress, emmaAddress, peterAddress, lisaAddress, jamesAddress, robertAddress, maryAddress, kevinAddress, michelleAddress, stephanieAddress, williamAddress, ashleyAddress, susanAddress, rogerAddress, sarahAddress, jesseAddress, bruceAddress, nancyAddress, austinAddress, carolAddress, allAddresses);

        Scanner input = new Scanner(System.in);

        System.out.println("\nMenu:");
        System.out.println("1: Add Address" + "\n2: Remove Address" + "\n3: Update Address" + "\n4: Search and Display Address");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
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
                Address newAddress = new Address(streetNumber, streetName, buildingType, apartmentNumber, cityName, stateName, countryName, zipCode);
                allAddresses.add(newAddress);
                break;
            case 2:
                System.out.println("Which street name are you looking for?\n");
                String street = input.next();
                for (int i = 0; i < allAddresses.size(); i++) {
                    if (allAddresses.get(i).getStreetName().equals(street)) {
                        System.out.println("\n" + i + ": ");
                        System.out.println(allAddresses.get(i));
                    }
                }
                System.out.println("Please select the address number you wish to remove?\n");
                int addressNumber = input.nextInt();
                allAddresses.remove(addressNumber);
                System.out.println("Done!");
                break;
            case 3:
                System.out.println("Which street name are you looking for?\n");
                String nameOfTheStreet = input.next();
                for (int i = 0; i < allAddresses.size(); i++) {
                    if (allAddresses.get(i).getStreetName().equals(nameOfTheStreet)) {
                        System.out.print("\n" + i + ": ");
                        System.out.println(allAddresses.get(i));
                    }
                }
                System.out.println("Please select the address number you wish to update?\n");
                int number = input.nextInt();
                System.out.println("Please enter a new street name: ");
                String newStreetName = input.next();
                allAddresses.get(number).setStreetName(newStreetName);
                System.out.println("Done!");
                System.out.println("New address:\n");
                System.out.print(number + ": ");
                System.out.println(allAddresses.get(number));
                break;
            case 4:
                System.out.println("Which street name are you looking for?\n");
                String street1 = input.next();
                int count = 0;
                for (int i = 0; i < allAddresses.size(); i++) {
                    if (allAddresses.get(i).getStreetName().equals(street1)) {
                        System.out.print("\n" + i + ": ");
                        System.out.println(allAddresses.get(i));
                        count++;
                    }
                }
                System.out.println("\nThere are " + count + " addresses include " + street1 + ".");
                break;
        }
    }

    private static void addressNames(Address paulAddress, Address emmaAddress, Address peterAddress, Address lisaAddress, Address jamesAddress, Address robertAddress, Address maryAddress, Address kevinAddress, Address michelleAddress, Address stephanieAddress, Address williamAddress, Address ashleyAddress, Address susanAddress, Address rogerAddress, Address sarahAddress, Address jesseAddress, Address bruceAddress, Address nancyAddress, Address austinAddress, Address carolAddress, ArrayList<Address> allAddresses) {
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
    }
}
