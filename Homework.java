package com.syntax.class03;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    /*
        Navigate to http://syntaxprojects.com
        Click on start practicing
        click on simple form demo
        enter any text on first text box
        click on show message
        quit the browser
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();

        WebElement startPractising = driver.findElement(By.xpath("//a[contains(@id, 'btn_basic_example')]"));
        startPractising.click();
        Thread.sleep(5000);

        WebElement simpleFormDemo = driver.findElement(By.xpath("//a[@class = 'list-group-item']/preceding-sibling::a"));
        simpleFormDemo.click();
        Thread.sleep(5000);

        WebElement anyText = driver.findElement(By.xpath("(//input[@class = 'form-control'])[1]"));
        anyText.sendKeys("I am learning Selenium");
        Thread.sleep(5000);

        WebElement showMessage = driver.findElement(By.xpath("//button[contains(@onclick, 'showInput();')]"));
        showMessage.click();
        Thread.sleep(5000);

        driver.quit();


    }
}