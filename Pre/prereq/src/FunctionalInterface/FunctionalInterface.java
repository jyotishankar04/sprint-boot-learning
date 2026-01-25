package FunctionalInterface;

// A interface which has only one abstract method is called functionalInterface
@java.lang.FunctionalInterface
interface BookAction{
    void perform();
}

// Lambda Expression - Using lambda functions u can provide functionaly to a interface
//parameter -> expression body
// () -> {}

//Anohter task
@java.lang.FunctionalInterface
interface Operation {
    int add(int a, int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        BookAction action1 = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action performed 1");
            }
        };
        action1.perform();

        BookAction action2 = ()->{
          System.out.println("Action performed 2");
        };
        action2.perform();

        BookAction action3 = ()-> System.out.println("Action performed 3");
        action3.perform();



//        Operation functional interface
        Operation op1 = (a,b) ->{
            return a + b;
        };

        System.out.println(op1.add(4,56));
    }
}
