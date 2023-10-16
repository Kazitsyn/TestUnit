package seminars.second.hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VehicleTest {


//    @BeforeEach
//    void carNew(){
//        Car car = new Car("company", "model", 5);
//    }
    @Test
    @DisplayName("1) Эемпляр объекта Car также является экземпляром транспортного средства")
    void carInstanceOfVehicle(){
        Car car = new Car("company", "model", 5);
        Vehicle vehicle = car instanceof Vehicle ? ((Vehicle) car) : null;
    }

    @Test
    @DisplayName("2) Объект Car создается с 4-мя колесами")
    void valueNumWheels(){
        Car car = new Car("company", "model", 5);

        assertEquals(car.getNumWheels(),4);
    }

    @Test
    @DisplayName("3) Объект Motorcycle создается с 2-мя колесами")
    void valueNumWheelsInMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "VS1000", 3);
        assertEquals(motorcycle.getNumWheels(),2);
    }

    @Test
    @DisplayName("4) Объект Car развивает скорость 60 в режиме тестового вождения ")
    void testDriveSpeed(){
        Car car = new Car("company", "model", 5);
        car.testDrive();
        assertEquals(car.getSpeed(),60);
    }

    @Test
    @DisplayName("5) Объект Motorcycle развивает скорость 75 в режиме тестового вождения ")
    void testDriveSpeedMotorcycle(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "VS1000", 3);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(),75);
    }

    @Test
    @DisplayName("6) Режим парковки Car")
    void testDriveSpeedInPerking(){
        Car car = new Car("company", "model", 5);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(),0);
    }

    @Test
    @DisplayName("7) Режим парковки Motorcycle")
    void testDriveSpeedMotorcycleInParking(){
        Motorcycle motorcycle = new Motorcycle("Yamaha", "VS1000", 3);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(),0);
    }



}