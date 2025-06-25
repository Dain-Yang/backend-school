package dain.backend.annotation.custom;
import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    void testGetModel_Ionic() {
        Car car = new Car("Ionic",2025);
        car.getModel();
    }

    @Test
    void testGetModel_Sonata() {
        Car car = new Car("Sonata",2025);
        car.getModel();
    }

    @Test
    void testGetModel_Grandeur() {
        Car car = new Car("Grandeur",2025);
        car.getModel();
    }

    @Test
    void testGetModel_Avante() {
        Car car = new Car("Avante",2025);
        car.getModel();
    }

    @Test
    void testGetModel_Morning() {
        Car car = new Car("Morning",2025);
        car.getModel();
    }

    @Test
    void testGetModel_Unknown() {
        Car car = new Car("Tesla",2025);
        car.getModel();
    }

}