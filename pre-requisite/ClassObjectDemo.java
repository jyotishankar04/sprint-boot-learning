public class ClassObjectDemo {
    
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.brand = "Toyota";
        car1.color = "Red";
        car1.speed = 100;

        car2.brand = "Honda";
        car2.color = "Blue";
        car2.speed = 120;

        car3.brand = "Ford";
        car3.color = "Black";
        car3.speed = 90;

        car1.drive();
        car2.drive();
        car3.drive();
    }
}
