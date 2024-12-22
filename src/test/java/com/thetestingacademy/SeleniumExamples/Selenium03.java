package com.thetestingacademy.SeleniumExamples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium03 {
    @Test
    public void test(){
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://sdet.live");
        driver.quit();  //Close the driver instance created



    }


}
