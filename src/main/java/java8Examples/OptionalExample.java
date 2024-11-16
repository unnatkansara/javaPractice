package java8Examples;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<Integer> op1 = Optional.of(5);
        System.out.println(op1.isEmpty());
        System.out.println(op1.isPresent());
        System.out.println(op1.get());
        System.out.println("Filter out five");
        op1.filter(x -> x == 5).ifPresent(System.out::println);

        Optional<Integer> op2 = Optional.empty();
        System.out.println(op2.isEmpty());
        System.out.println(op2.isPresent());

        Optional<Integer> possible = Optional.ofNullable(null);
        System.out.println(possible.isEmpty());
        System.out.println(possible.orElse(5));

    }
}
