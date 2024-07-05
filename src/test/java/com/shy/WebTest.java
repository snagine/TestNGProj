package com.shy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class WebTest {

    ChromeOptions options = new ChromeOptions();
    WebDriver driver;
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver(options);
    }

    @Test
    public void loadWebpage() {
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @Test(enabled = false)
    public void checkText(){

        WebElement element = driver.findElement(By.id("//*[@id=\"APjFqb\"]"));
        element.sendKeys("Shylaja Nagineni");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        driver.get("http://www.google.com");
//        driver.findElement(By.cssSelector("[name='q']")).sendKeys("webElement");
//
//        // Get attribute of current active element
//        String attr = driver.switchTo().activeElement().getAttribute("title");
//        System.out.println(attr);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
