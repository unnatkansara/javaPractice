package java8Examples;

public class LambdaExample {
    public static void main(String[] args) {
        Operator<Integer> addition = (a, b) -> a + b;
        System.out.println("ADDITION : " + addition.process(1,2));

        Operator<String> concatenation = (a, b) -> a + b;
        System.out.println("CONCAT : " + concatenation.process("Unnat","Kansara"));


    }

    @FunctionalInterface
    interface Operator<T> {
        public T process(T a, T b);
    }
}
