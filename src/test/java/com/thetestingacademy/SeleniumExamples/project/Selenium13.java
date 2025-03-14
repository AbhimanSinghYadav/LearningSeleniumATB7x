package com.thetestingacademy.SeleniumExamples.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium13 {
    public static void main(String[] args) {


        //Imp concept of OOPS in Selenium Webdriver->
        // WebDriver driver=new EdgeDriver();
        //WebDriver driver1=new ChromeDriver();
        //Opera-Selenium 4 -Removed


        // SearchContext(I) (2)
        // -> WebDriver(I)( 10)
        // -> RemoteWebDriver(C) (15)
        // -> ChromiumDriver(C) 25
        // -> EdgeDriver(C) (45)
        // -> ChromeDriver(C)


        // SearchContext driver = new EdgeDriver(); // Dynamic Dispatch (RunTime Polymorphism) | upcasting
        // Possible but two functions, which is not much used.
        //driver.findElement()
        //driver.findElements()

//         WebDriver driver = new EdgeDriver();
//        // 12 which are good

//         RemoteWebDriver driver = new EdgeDriver();

//        EdgeDriver driver = new EdgeDriver();


        // Scenarios
        // 1. Do want to run on  Chrome or Edge?
//        ChromeDriver driver = new ChromeDriver();
//        EdgeDriver driver2 = new EdgeDriver();

        // 2  Do you want to run on Chrome then change to Edge ?
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();


        // 3. Do you want to run on multiple browsers /machine? 10%
        // RemoteWebDriver driver (with GRID) - Advance (Last 2 Sessions)

    }
}


