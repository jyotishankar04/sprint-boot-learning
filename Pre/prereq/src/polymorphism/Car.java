package polymorphism;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void start(){
        System.out.println("Starting the Car.....");
    }


    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
//        super.displayInfo();
        System.out.println("Brand: "+getBrand() + " Speed: "+ getSpeed() + "boors: " + getDoors());
    }

}
