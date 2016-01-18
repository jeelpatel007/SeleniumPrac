/*
This is a Java based Selenium functional test of http://jeel-patel.weebly.com
First all important modules related to the Class is imported and then the main class 'TestJeel' begins
*/
package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestJeel {

    public static void main(String[] args) throws InterruptedException {

// Setting up the driver object for Firefox browser        
        WebDriver driver = new FirefoxDriver();
//Initializing the browser screen to maximum size for optimal visibility
        driver.manage().window().maximize();
        
//Directing the browser to intended URL
        driver.get("http://jeel-patel.weebly.com");
//Hold on for 2.5 seconds before going to the next page        
        Thread.sleep(2500);
        
//Clicking the Enter button to go to the next page. Triggered the button by its Class-Name
        driver.findElement(By.className("wsite-button-inner")).click();
        Thread.sleep(3000);
        
// Creating a JavaScript object which will enable Scrolling Down the page
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,850)","");
        Thread.sleep(2000);
        
//Navigating to the next page by Clicking its button. Button is triggered by its Class-Name
        driver.findElement(By.className("wsite-button-inner")).click();
        Thread.sleep(3000);

//Similar process of above is repeated for all other pages till the last 'contact' page
        JavascriptExecutor jsee = (JavascriptExecutor)driver;
        jsee.executeScript("window.scrollBy(0,850)","");
        Thread.sleep(2000);

        driver.findElement(By.className("wsite-button-inner")).click();
        Thread.sleep(3000);

//Filling out the relevant text-box fields of the contact form 
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

//Finally calling the Submit button by its Class-Name and click it to submit the form entry
        driver.findElement(By.className("wsite-button-inner")).click();
        Thread.sleep(6000);
//After completion of all automaation operations, the drivers are closed to release the memory and close the application
        driver.quit();
    }
}
