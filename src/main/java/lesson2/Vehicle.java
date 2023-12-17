package lesson2;

public class Vehicle {
    String company;
    String model;
    int yearRelease;
    int numWheels;
    static int speed = 0;

    public Vehicle(String company, String model, int yearRelease) {
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
    }

    public void testDrive() {
    }

    public void park() {
    }

    public int getSpeed() {
        return speed;
    }
    public int getNumWheels() {
        return numWheels;
    }

}
