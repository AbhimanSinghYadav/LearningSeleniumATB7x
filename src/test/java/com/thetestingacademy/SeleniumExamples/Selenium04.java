package com.thetestingacademy.SeleniumExamples;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Selenium04 {
    //oops-upcasting-dynamic dispatch-polymorphism
    //selenium 4.25
    //selenium 3 --//system.set property
    public void testmethod(){
        SearchContext driver=new ChromeDriver();
        WebDriver driver1=new EdgeDriver();
        WebDriver driver2=new ChromeDriver();
        WebDriver driver3=new FirefoxDriver();
        WebDriver driver4=new InternetExplorerDriver();
        WebDriver driver5=new SafariDriver();
        WebDriver driver6=new ChromeDriver();
        RemoteWebDriver driver7=new ChromeDriver();
        //driver1=New EdgeDriver()
        ChromeDriver driver8=new ChromeDriver();

        WebDriver driver9=new ChromeDriver();
        driver9=new ChromeDriver();
        //Scenario 1
        //do you want to run on chrome or edge
        //        ChromeDriver driver8=new ChromeDriver();   <1%
        //Scenario 2
        //do you want to run on chrome then change to edge
        //        WebDriver driver9=new ChromeDriver();     //97%
        //Scenario 3
        //do you want to run on multiple browsers or aws machine
        //RemoteWebDriver driver(with GRID)-Advance(Last 2 sessions)  //2%







    }







}
