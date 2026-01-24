package constructors;


public class Car {
    String brand;
    String color;
    int speed;

    Car(String brand, String color, int speed) {
        this.color = color;
        this.brand = brand;
        this.speed = speed;
        System.out.println("Contractor Called....");
    }

    public void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }

    //    Getter setter
    public int getSpeed() {
        return this.speed;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        if(speed <= 0) return;

        this.speed = speed;
    }



}