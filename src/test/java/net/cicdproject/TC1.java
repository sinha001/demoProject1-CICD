package net.cicdproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class TC1 {

    private WebDriver driver;

    @BeforeTest
    public void launchDriver(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);

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