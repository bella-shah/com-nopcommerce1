package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class EdgeDriver {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new org.openqa.selenium.edge.EdgeDriver();
        // launch the url
        driver.get(baseUrl);
        //maximise the window
        driver.manage().window().maximize();
        // we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        //get the title
        String title = driver.getTitle();
        System.out.println(title);
        // get the current url
        System.out.println("Current URL = " + driver.getCurrentUrl());
         //find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("bellashah123@gmail.com");
        //find the password element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("bella123");
        //close the browser
        driver.close();
    }
}
