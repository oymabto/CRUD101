package CRUD101;

import java.util.ArrayList;

public class Testtest {
    public static void main(String[] args) {
        Person adam = new Person("adam");
        Person jon = new Person("jon");
        Person tom = new Person("tom");
        Person steve = new Person("steve");
        Person mark = new Person("mark");
        ArrayList<Person> allPerson = new ArrayList<>();
        allPerson.add(adam);
        allPerson.add(jon);
        allPerson.add(tom);
        allPerson.add(steve);
        allPerson.add(mark);
        int counter = 0;
        for (int i = 0; i < allPerson.size(); i++) {
            if (allPerson.get(i).getPhoneNumber().getAreaCode() == 514) {
                counter++;
                System.out.println(allPerson.get(i));
            }
        }
        System.out.println(counter);
    }
}
