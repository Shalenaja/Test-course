package lesson2;

public class Motorcycle extends Vehicle {
    int numWheels = 2;
    public Motorcycle(String company, String model, int yearRelease) {
        super(company, model, yearRelease);

    }
    public void testDrive() {
        speed = 75;
    }

    public void park() {
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getNumWheels() {
        return numWheels;
    }
}
