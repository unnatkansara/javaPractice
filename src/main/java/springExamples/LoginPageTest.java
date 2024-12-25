package springExamples;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

class LoginPage {
    public void enterUsername(String username){
        System.out.println("username entered");
    }
    public void enterPassword(String password){
        System.out.println("password entered");
    }
    public void clickLoginButton() {
        System.out.println("login clicked");
    }
}
public class LoginPageTest {

    @Autowired
    private WebDriver driver;

    @Autowired
    private LoginPage loginPage;

    @Test
    public void testLogin() {
        loginPage.enterUsername("user");
        loginPage.enterPassword("password");
        loginPage.clickLoginButton();
        // ...
    }
}
