package net.cicdproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class TC1 {

    private WebDriver driver;

    @BeforeTest
    public void launchDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @Test
    public void test1(){
        driver.navigate().to("https://blinkit.com");
        System.out.println("Test 1 Website Title is: "+driver.getTitle());
    }

    @Test
    public void test2(){
        driver.navigate().to("https://amazon.com");
        System.out.println("Test 2 Website title is: "+driver.getTitle());
    }

    @Test
    public void test3(){
        driver.navigate().to("https://google.com");
        System.out.println("Test 3 Website title is: "+driver.getTitle());
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }
}