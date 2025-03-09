package com.thetestingacademy.SeleniumExamples.project.myownexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium31 {
    @Test
    public void test_verify_imacprices () {

        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        edgeOptions.addArguments("--start-maximized");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com/#/login");
        WebElement  username = driver.findElement(By.id("login-username"));
        username.sendKeys("abhimansinghyadav@gmail.com");
        WebElement  password = driver.findElement(By.name("password"));
        password.sendKeys("Abhiman@12345");
        WebElement  checkbox = driver.findElement(By.name("icon--checkbox-button"));
        checkbox.click();
        WebElement  submit = driver.findElement(By.id("js-login-btn"));
        submit.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
