package java8Examples;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args){
        //Stream to get distinct numbers
        System.out.println("Unique numbers");
        Stream.of(1,6,2,4,7,6,4,5,2).distinct().forEach(System.out::println);

        //Stream to generate numbers
        System.out.println("First 10 numbers");
        Stream.iterate(1,n->n+1).limit(10).forEach(System.out::println);

        //Stream to generate numbers and skip first 2
        System.out.println("First 10 numbers and skit first 2");
        Stream.iterate(1,n->n+1).skip(2).limit(8).forEach(System.out::println);
    }
}
