package com.thetestingacademy.SeleniumExamples.project.myownexercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium28 {
    @Test
    public void verifytitle(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com");
        driver.quit();



    }
}
