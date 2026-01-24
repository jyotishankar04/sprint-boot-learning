package constructors;

public class Contructor {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","White",200);

        Car car2 = new Car("Kia","Red",100);

        System.out.println(car1.getSpeed());
    }
}
