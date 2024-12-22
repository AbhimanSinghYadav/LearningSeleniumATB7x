package com.thetestingacademy.SeleniumExamples;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium10 {
    @Test
    public void testQuitVsClose(){
        EdgeDriver driver=new EdgeDriver();//dynamic dispatch
        driver.get("https://sdet.live");
         driver.close();
         //close the current browser window-not the full browser
        //closed the window,session id!=null, Error-Invalid session ID

        driver.quit();
        //close all the window/sessions and stop the browsers



    }
}
