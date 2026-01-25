package polymorphism;
class Calculator{
    public int add(int a , int b){
        System.out.println("In int function");
        return  a + b;
    }
    public  double add(double a, double b){
        System.out.println("In double function");
        return a + b;
    }
}



public class Polymorphish {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota",200,4);
        c1.displayInfo();
        Bike b1 = new Bike("Yamaha",200,false);
        b1.displayInfo();
        c1.start();
        b1.start();

        Vehicle v1 = new Vehicle("Kia",200);
        v1.start();

//        Method Overriding run time polymorphism
        //It will print the Starting the car....
        Vehicle v2 = new Car("Audi",202,4);
        v2.start();
        b1.start("Hello");



//        Calculator
        Calculator cal = new Calculator();
        System.out.println("Result : "+ cal.add(4,6));
        System.out.println("Result : "+ cal.add(4.5,6));

    }
}
