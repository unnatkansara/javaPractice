package java8Examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args){
        //Stream to get distinct numbers
        System.out.println("Unique numbers");
        Stream.of(1,6,2,4,7,6,4,5,2).distinct().forEach(System.out::println);
        Stream<String> stream = Stream.of("ABCDEF".split(""));
//        stream.forEach(System.out::println);

        //Stream to generate numbers
        System.out.println("First 10 numbers");
        Stream.iterate(1,n->n+1).limit(10).forEach(System.out::println);

        //Stream to generate numbers and skip first 2
        System.out.println("First 10 numbers and skit first 2");
        Stream.iterate(1,n->n+1).skip(2).limit(8).forEach(System.out::println);

        //intermediate operations
        //filter
        stream.filter(s -> s.startsWith("A")).forEach(System.out::println);
        //map
        Stream.of("abcdef".split("")).map(s -> s.toUpperCase()).forEach(System.out::print);
        //sorted
        Stream.of("DCBA".split("")).sorted().forEach(System.out::println);

        //terminal operations
        //min
        System.out.println(Stream.of(1,2,3,10,3,2).min((i,j) -> i.compareTo(j)));
        //max
        System.out.println(Stream.of(1,2,3,10,3,2).max((i,j) -> i.compareTo(j)));
        //collect
        List<String> str = Stream.of("ABC", "BCD", "CDE").filter(s -> s.contains("B")).collect(Collectors.toList());
        System.out.println(str);
        //reduce
        System.out.println(Stream.of("ABCD".split("")).reduce((a,b) -> a + "#" + b));
        //match
        System.out.println(Stream.of("ABC", "BCD", "CDE").anyMatch(s -> s.contains("C")));
        System.out.println(Stream.of("ABC", "BCD", "CDE").allMatch(s -> s.contains("C")));
        System.out.println(Stream.of("ABC", "BCD", "CDE").noneMatch(s -> s.contains("C")));

        //count
        System.out.println(Stream.of("ABC", "BCD", "CDE").filter(s -> s.contains("B")).count());

    }
}
