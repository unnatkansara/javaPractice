package springExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class DependencyInjection {
    @Autowired
    static TestLogin testLogin;

    @Autowired
    static TestCases testCases;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        System.out.println("CHROME BEAN : " + context.getBean("chrome"));
        System.out.println("FF BEAN : " + context.getBean("firefox"));
        context.getBean(TestCases.class);


        testCases.loginTest();

    }
}

@Configuration
class TestConfig {
    @Bean
    public String chrome() {
        return "Chrome";
    }

    @Bean
    public String firefox() {
        return "Firefox";
    }
}

class TestLogin {
    public void performLogin(){
        System.out.println("login is being performed");
    }
}

class TestCases {
    @Autowired
    private TestLogin testLogin;

    public void loginTest() {
        testLogin.performLogin();
    }
}




