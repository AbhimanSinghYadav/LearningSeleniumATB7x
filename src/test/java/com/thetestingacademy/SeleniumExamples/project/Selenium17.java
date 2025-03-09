package com.thetestingacademy.SeleniumExamples.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium17 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.zatak.store");

        driver.close();
        // Close the Current Browser Window
        // Session ID != NULL
        // Not the full browser

        driver.quit();
        // Close all the /sessions/windows and stop the browser
        // Session = null, Error - Session ID is null


    }
}