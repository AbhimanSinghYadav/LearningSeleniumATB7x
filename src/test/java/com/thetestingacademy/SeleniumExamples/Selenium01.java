package com.thetestingacademy.SeleniumExamples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Selenium01 {
    //Code here--API request>browser driver(server) .exe,sh
    //Client and Server
    public static void main(String[] args) {

        ChromiumDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
    }
}