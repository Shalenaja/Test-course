package lesson2;

import junit.framework.TestCase;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class VehicleTest extends TestCase {

    private static Car car;
    private static Motorcycle moto;

    @BeforeAll
    static void setup() {
        System.out.println("Tests to test vehicle performance");
    }

    @AfterAll
    static void teardown() {
        System.out.println("4 tests were performed for each object");
    }

    @ParameterizedTest
    @DisplayName("Test TestExampleVehicle - expected object instance Vehicle")
    @MethodSource("methodForArguments")
    public void testExampleVehicle(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            assertTrue(vehicle instanceof Vehicle);
        };
        if (vehicle instanceof Motorcycle) {
            assertTrue(vehicle instanceof Vehicle);
        }
    }

    @ParameterizedTest
    @DisplayName("Test NumWheels -expected number of wheels ")
    @MethodSource("methodForArguments")
    public void testNumWheels(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            assertEquals("should equal 4",4, vehicle.getNumWheels());
        };
        if (vehicle instanceof Motorcycle) {
            assertEquals("should equal 2", 2, vehicle.getNumWheels());
        }
    }

    @ParameterizedTest
    @DisplayName("Test TestDrive - expected max speed")
    @MethodSource("methodForArguments")
    public void testTestDrive(Vehicle vehicle) {
        vehicle.testDrive();
        if (vehicle instanceof Car) {
            assertEquals("should equal 60", 60, vehicle.getSpeed());
        };
        if (vehicle instanceof Motorcycle) {
            assertEquals("should equal 75",75, vehicle.getSpeed());
        }
    }

    @ParameterizedTest
    @DisplayName("Test Park - expected shutdown speed")
    @MethodSource("methodForArguments")
    public void testPark(Vehicle vehicle) {
        vehicle.park();
        assertTrue(vehicle.getSpeed() == 0);
    }
    private static Stream<Vehicle> methodForArguments() {
        return Stream.of(new Car("company1", "123", 2020),
                new Motorcycle("company1", "fgp56", 2023));
    }
}