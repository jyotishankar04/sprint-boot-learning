package encapsulation;

class Car {
    private String brand;
    private String color;
    private int speed;

    Car(String brand, String color, int speed) {
        setSpeed(speed);
        System.out.println("Contractor Called....");
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }

    //    Getter setter


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed < 0) speed = 0;
        this.speed = speed;
    }
}

public class Encapsulation {
    public static void main(String args[]){
        Car car1 = new Car("Toyota","White",-200);
        car1.setSpeed(-200);
        car1.drive();
        Car car2 = new Car("Kia","Red",100);

    }
}
