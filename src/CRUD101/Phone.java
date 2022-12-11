package CRUD101;

public class Phone {
    private int countryCode;
    private int areaCode;
    private int phonePrefix;
    private int lineNumber;

    //constructor
    public Phone() {
    }

    public Phone(int countryCode, int areaCode, int phonePrefix, int lineNumber) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.phonePrefix = phonePrefix;
        this.lineNumber = lineNumber;
    }

    //getter and setter

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPhonePrefix() {
        return phonePrefix;
    }

    public void setPhonePrefix(int phonePrefix) {
        this.phonePrefix = phonePrefix;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getPhoneNumber() {
        return countryCode + "" + areaCode + "" + phonePrefix + "" + lineNumber;
    }

    public void setPhone(int newCountryCode, int newAreaCode, int newPhonePrefix, int newLineNumber) {
        this.countryCode = newCountryCode;
        this.areaCode = newAreaCode;
        this.phonePrefix = newPhonePrefix;
        this.lineNumber = newLineNumber;
    }

    @Override
    public String toString() {
        return "(" + countryCode + ")" +
                " " + areaCode +
                "-" + phonePrefix +
                "-" + lineNumber;
    }
}

