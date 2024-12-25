package seleniumExamples;

import org.testng.IAnnotationTransformer;
import org.testng.TestNG;
import org.testng.annotations.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class InvocationCountTestAnnotationTransformer implements IAnnotationTransformer {
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        if (testMethod.getName().contains("test")) {
            annotation.setInvocationCount(5);
        }
    }
}

public class AnnotationTransformerExample {
    public static void main(String[] args) {
        TestNG testNG= new TestNG();
        testNG.setTestClasses(new Class[] {TestClass.class});
        testNG.addListener(new InvocationCountTestAnnotationTransformer());
        testNG.run();
    }
}


class TestClass {

    @Test
    public void test1(){
        System.out.println("test1 is run");
    }

    @Test(invocationCount = 2)
    public void test2() {
        System.out.println("test2 is run");
    }

}


