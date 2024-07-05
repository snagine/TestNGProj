package com.shy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class WebTest {

    ChromeOptions options = new ChromeOptions();
    //options.setImplicitWaitTimeout(Duration.ofSeconds(1));

    WebDriver driver;
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test(enabled = false)
    public void testAutoWebpage() {
        driver.get("https://trytestingthis.netlify.app/");
    }

    @Test(enabled = false)
    public void testDuckWebpage() {
        //driver.get("https://duckduckgo.com");
        //driver.findElement(By.xpath("//*[@id='searchbox_input']")); //duck
    }

    @Test
    public void testSeleWebpage() {
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.findElement(By.id("adder")).click();
        WebElement added = driver.findElement(By.id("box0"));
        Assert.assertEquals("redbox", added.getDomAttribute("class"));
    }


    @Test
    public void testGoogleLoad(){
        driver.get("https://www.google.com");
        try {
            WebElement element = driver.findElement(By.xpath("//*[@id='fname']"));
            Thread.sleep(2000);
            element.sendKeys("Shylaja Nagineni");
            driver.findElement(By.name("btnK")).click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
