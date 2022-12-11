package CRUD101;

public class Address {
    private int streetNumber;
    private String streetName;
    private String buildingType;
    private int apartmentNumber;
    private String cityName;
    private String stateName;
    private String countryName;
    private String zipCode;

    //constructor
    public Address() {
    }

    //constructor
    public Address(int streetNumber, String streetName, String buildingType, int apartmentNumber, String cityName, String stateName, String countryName, String zipCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.buildingType = buildingType;
        this.apartmentNumber = apartmentNumber;
        this.cityName = cityName;
        this.stateName = stateName;
        this.countryName = countryName;
        this.zipCode = zipCode;
    }

    // Getters and setters
    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int newStreetNumber) {
        this.streetNumber = newStreetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String newStreetName) {
        this.streetName = newStreetName;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String newBuildingType) {
        this.buildingType = newBuildingType;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int newApartmentNumber) {
        this.apartmentNumber = newApartmentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String newCityName) {
        this.cityName = newCityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String newStateName) {
        this.stateName = newStateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String newCountryName) {
        this.countryName = newCountryName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String newZipCode) {
        this.zipCode = newZipCode;
    }

    public String getAddress() {
        return this.streetNumber + "" + this.streetName + "" + this.apartmentNumber + "" + this.cityName + "" + this.stateName + "" + this.countryName + "" + this.zipCode;
    }

    @Override
    public String toString() {
        return streetNumber +
                ", " + streetName + "\n" +
                "              " + buildingType +
                ", # " + apartmentNumber + "\n" +
                "              " + cityName +
                ", " + stateName +
                ", " + countryName + "\n" +
                "              " + zipCode;
    }
}

