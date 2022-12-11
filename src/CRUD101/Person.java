package CRUD101;

import java.util.ArrayList;

public class Person {
    private String name;
    private Address address;
    private Phone phoneNumber;
    private ArrayList<Person> kids = new ArrayList<>();
}
