package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ChromeDriver {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        //launch the url
        driver.get(baseUrl);
        // maximise window
        driver.manage().window().maximize();
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        //get the title
        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URL = " + driver.getCurrentUrl());
        //find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("bellashah123@gmail.com");
        // find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("bella123");
        // close the browser
        driver.close();
}
}
