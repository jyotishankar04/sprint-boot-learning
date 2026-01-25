package Interfaces;

public class Interface {
    public static void main(String[] args) {
//        ElectricCar e1 = new ElectricCar();
//        e1.applyBreaks();
//        e1.turnLeft();
        CarControls myCar = new ElectricCar();
        myCar.turnLeft();

        CarControls newCar = new SportsCar();
        newCar.turnLeft();
    }
}
