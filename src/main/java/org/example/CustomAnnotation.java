package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class CustomAnnotation {
    public static void main(String[] args) throws NoSuchMethodException {
        //Execution normal
        printMethod();

        //Execution using reflection
        CustomAnnotation customAnnotation=new CustomAnnotation();
        executionTimes executionTimesAnnotation =  customAnnotation.getClass().getMethod("printMethod").getAnnotation(executionTimes.class);
        for(int index=0;index<executionTimesAnnotation.times();index++) {
            printMethod();
        }
    }

    @executionTimes(times = 4)
    public static void printMethod() {
        System.out.println("executing print method");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface executionTimes {
    int times();
}
