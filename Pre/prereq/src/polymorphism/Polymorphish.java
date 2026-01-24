package polymorphism;

public class Polymorphish {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota",200,4);
        c1.displayInfo();
        Bike b1 = new Bike("Toyota",200,false);
        b1.displayInfo();

        c1.start();
    }
}
