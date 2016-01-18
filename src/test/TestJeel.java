package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestJeel {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://jeel-patel.weebly.com");
        Thread.sleep(2500);

        driver.findElement(By.className("wsite-button-inner")).click();
        Thread.sleep(3000);

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,850)","");
        Thread.sleep(2000);

        driver.findElement(By.className("wsite-button-inner")).click();
        Thread.sleep(3000);

        JavascriptExecutor jsee = (JavascriptExecutor)driver;
        jsee.executeScript("window.scrollBy(0,850)","");
        Thread.sleep(2000);

        driver.findElement(By.className("wsite-button-inner")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("input-572455315222663644")).sendKeys("Jeel");
        Thread.sleep(1000);

        driver.findElement(By.id("input-572455315222663644-1")).sendKeys("Patel");
        Thread.sleep(1000);

        driver.findElement(By.id("input-312684153433324557")).sendKeys("jeelpatel771@gmail.com");
        Thread.sleep(1000);

        JavascriptExecutor ejs = (JavascriptExecutor)driver;
        ejs.executeScript("window.scrollBy(0,850)","");
        Thread.sleep(1000);

        driver.findElement(By.id("input-713380684465530085")).sendKeys("Test Complete!!!!!");
        Thread.sleep(1000);

        driver.findElement(By.className("wsite-button-inner")).click();
        Thread.sleep(6000);

        driver.quit();
    }
}
