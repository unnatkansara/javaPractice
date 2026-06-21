package java8Examples;

public class LambdaExample {
    public static void main(String[] args) {
        //Without parameters, no braces, no return
        WihtoutPrams noparam = () -> System.out.println("console output");
        noparam.process();

        //With parameters, no braces, no return
//        Operator<Integer> addition = (a, b) -> a + b;
//        System.out.println("ADDITION : " + addition.process(1,2));

        Operator<String> concatenation = (a, b) -> a + b;
        System.out.println("CONCAT : " + concatenation.process("Unnat","Kansara"));

//        WithParamsMultiStatementWithReturnBraces<Integer> w = (a, b) -> {
//            int multiplier = 2;
//            return (multiplier * (a + b));
//        };
//        System.out.println(w.process(1,2));
    }

    @FunctionalInterface
    interface Operator<T> {
        public T process(T a, T b);
    }

    @FunctionalInterface
    interface WithParamsMultiStatementWithReturnBraces<T> {
        public T process(T a, T b);
    }

    @FunctionalInterface
    interface WihtoutPrams {
        public void process();
    }
}
