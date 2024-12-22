package com.thetestingacademy.SeleniumExamples;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Selenium08 {
// it will help you set the browsers
    //option to browser
    //window size
    //headless mode-there is not UI -Advantage-fast execution
   //full UI mode -default -UI browser
    //Incognito mode--Switch
    //start max
    //add extensions -browsers
    //100+ others,https,http
    //local storage,download
    @Test
     public void Testmethod01()
{
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");
    edgeOptions.addArguments("--incognito");

        EdgeDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://google.com");

    }
}

