package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstStreams {
    static Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            int rem = integer % 2;
            return rem == 0;
        }
    };
//    Shorthand of the predicate p1
    static Predicate<Integer> p2 = (integer -> integer % 2 ==0);


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNumbers = new ArrayList<>();
//
        for (int num : numbers){
            if(num % 2 == 0)
                evenNumbers.add(num);
        }
        System.out.println("Even numbers without streams :" + evenNumbers);


//        Refactor 1
        Stream<Integer> integerStream1 = numbers.stream();
        Stream<Integer> integerStream2 = integerStream1.filter(p);
        List<Integer> evenNumbers2 = integerStream2.toList();
        System.out.println("Even numbers without streams :" + evenNumbers2);

//        Refactor 2
        List<Integer> evenNumbers3 = numbers.stream().filter(num -> num % 2 ==0).collect(Collectors.toList());
        System.out.println("Even numbers without streams :" + evenNumbers3);


//        Refactor 3
        List<Integer> evenNumbers4 = numbers.stream().filter(p2).toList();
        System.out.println("Even numbers without streams :" + evenNumbers4);

    }
}
