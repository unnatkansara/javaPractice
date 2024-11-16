package java8Examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Unnat Kansara", 43, "Male");
        Employee emp2 = new Employee(2, "Labdhi Kansara", 42, "Female");
        Employee emp3 = new Employee(3, "Mahir Kansara", 15, "Male");

        Predicate<Employee> isAdult = employe -> employe.age > 21;
        Predicate<Employee> isMale = employe -> employe.gender.equals("Male");
        Predicate<Employee> st = employe -> employe.name.startsWith("U");


    }

    @FunctionalInterface
    interface Operator<T> {
        public <T,V> void add(T a, V b);
    }



}

class Employee{
    int id;
    String name;
    int age;
    String gender;

    Employee(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


}