package constructors;


// U don't need to write constructures and reduces a lot of codes
record  Bike(String brand,int speed){}

public class RecordDemo {
    public static void main(String args[]){
        Bike bike = new Bike("BMW",220);
        System.out.println("Brand " + bike.brand());
        System.out.println("Speed " + bike.speed());
        System.out.println(bike);

    }
}
