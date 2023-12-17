package lesson2;

public class Car extends Vehicle {
    int numWheels = 4;
    public Car(String company, String model, int yearRelease) {
        super(company, model, yearRelease);
    }

    public void testDrive() {
        speed = 60;
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
