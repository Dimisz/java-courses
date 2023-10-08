public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car");
        car.drive();

        Car gasCar = new GasPoweredCar("Gas Powered Car");
        gasCar.drive();

        Car electricCar = new ElectricCar("Electric Car");
        electricCar.drive();
    }
}