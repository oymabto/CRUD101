package CRUD101;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneTest {
    public static void main(String[] args) {

        Phone paulPhone = new Phone(1, 514, 546, 9876);
        Phone emmaPhone = new Phone(1, 514, 278, 2389);
        Phone peterPhone = new Phone(1, 212, 880, 7654);
        Phone lisaPhone = new Phone(1, 514, 123, 1089);
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

        Scanner input = new Scanner(System.in);
        System.out.println("Which area code are you looking for?\n");
        int areaCodeNumber = input.nextInt();

        int count = 0;
        for (int i = 0; i < allPhones.size(); i++) {
            if (allPhones.get(i).getAreaCode() == areaCodeNumber) {
                System.out.println("\n" + i + ": ");
                System.out.println(allPhones.get(i));
                count++;
            }
        }
        System.out.println("\nThere are " + count + " phone numbers with " + areaCodeNumber + "area code.");
    }

}

