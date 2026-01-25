package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    //    Streams --> Assembly line / pipeline
    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Grapes", "Banana", "Orange");
//        for(String item : items){
//            System.out.println(item);
//        }
//        Using streams
//        A sequence of elements supporting sequential and parallel aggregate operations

        Stream<String> stream = items.stream();

        stream.forEach(item-> System.out.println(item));
        Stream<String> newStream =   items.stream();

        System.out.println("====Filtere=========");
//        Stream<String> filteredString = newStream.filter(item->item.startsWith("O"));
//        filteredString.forEach(item-> System.out.println(item));

 newStream.filter(item->item.startsWith("O")).forEach(item-> System.out.println(item));
    }
}
