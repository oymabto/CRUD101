package CRUD101;

import java.util.ArrayList;

public class Person {
    private String name;
    private Address address;
    private Phone phoneNumber;

    private ArrayList<Person> kids = new ArrayList<>();

    public Person(){
    }

    public Person(String name){
        this.name = name;
    }
    public Person(String name, Address address, Phone phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(int newStreetNumber, String newStreetName, String newBuildingType, int newApartmentNumber, String newCityName, String newStateName, String newCountryName, String newZipCode) {
        this.address = new Address(newStreetNumber, newStreetName, newBuildingType, newApartmentNumber, newCityName, newStateName, newCountryName, newZipCode);
    }

    public Phone getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int countryCode, int areaCode, int phonePrefix, int lineNumber) {
        this.phoneNumber = new Phone(countryCode, areaCode, phonePrefix, lineNumber);
    }

    public void setPhoneNumber(Phone phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Person> getKids() {
        return this.kids;
    }

    public void setKids(Person kid) {
        this.kids.add(kid);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
