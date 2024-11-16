package java8Examples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MethodRefrenceExample {
    public void print(String message) {
        System.out.println("Message of method reference");
    }

    public static void main(String[] args) {
        //Static method reference by class
        List<String> messages = Arrays.asList("Hello", "How are you?") ;
        messages.forEach(PrintService::print);

        //Instance method reference by intance
        PrintService printService = new PrintService();
        messages.forEach(printService::copy);

        //Instance method reference by class
        //messages.forEach(MethodRefrenceExample::print);

    }
}

class PrintService {
    public void copy(String message) {
        System.out.println("COPY of : " + message);
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
