package Interfaces;

public class ElectricCar implements CarControls{
    @Override
    public void turnRight() {
        System.out.println("Electric right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Electric left");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Electric break");

    }
}
