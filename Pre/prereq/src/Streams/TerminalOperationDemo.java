package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationDemo {
    public static void main(String[] args) {
//        reduce()
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        int sum = numbers.stream().reduce(0,(acc,num)->acc + num);
        System.out.println(sum);
        //        collect()

        numbers.stream().filter(n-> n%2 !=0).collect(Collectors.toList()).forEach(System.out::println);
//        find & match
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());
        System.out.println(numbers.stream().anyMatch(n-> n ==4)); // Search the stream and return true or false


//        iteration
//Using the for each
    }
}
