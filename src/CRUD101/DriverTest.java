package CRUD101;

public class DriverTest {
    public static void main(String[] args) {
        creatDriverObjects();
    }

    private static void creatDriverObjects() {
        Driver smith = new Driver();
        smith.setAddress(5890, "Notre-Dame", "Apartment", 263, "Montreal", "QC", "CANADA", "H2Y 1B5");
        smith.setName("smith");
        smith.setPhoneNumber(1, 514, 546, 9876);
        smith.setJob("Driver");
        System.out.println("\n" + smith.getName()+ " is a " + smith.getJob() +".");
        System.out.println("\n" + smith.getName() + " lives in: \n" + "    " + smith.getAddress());
        System.out.println("\n" + smith.getName() + " phone number is " +smith.getPhoneNumber() +".");
    }
}
