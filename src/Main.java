public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Honda 3");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("Yamaha 6","VinFast");
        System.out.println(Car.numberOfCars);
    }
}
