package com.thetestingacademy.SeleniumExamples;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium11 {
    //get vs Navigate.to()
    public static void main(String[] args) {
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://bing.com");
        //No back,forward allowed in case of get

        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



    }


}
