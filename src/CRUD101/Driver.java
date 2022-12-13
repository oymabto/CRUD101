package CRUD101;

public class Driver extends Person {
    private String job;

    public Driver() {

    }

    public Driver(String name, Address address, Phone phoneNumber, String job) {
        super(name, address, phoneNumber);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "job='" + job + '\'' +
                '}';
    }
}
