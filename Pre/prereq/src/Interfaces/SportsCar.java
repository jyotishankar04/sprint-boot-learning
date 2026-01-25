package Interfaces;

public class SportsCar implements CarControls{
    @Override
    public void turnRight() {
        System.out.println("Sports right");
    }

    @Override
    public void turnLeft() {
        System.out.println("Sports left");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Sports break");

    }
}
