package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifyloginwithwrongcredentials {
     @Test
    public void logverify() {
        ChromiumDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
    ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito"); // Set browser to incognito mode
        chromeOptions.addArguments("--start-maximized"); // Start browser maximized
    WebElement email=driver.findElement(By.id("login-username"));
        email.sendKeys("abhimansinghyadav444@gmail.com");
    WebElement password=driver.findElement(By.id("login-password"));
         password.sendKeys("Abhiman@12345");

    WebElement signinbutton=driver.findElement(By.id("js-login-btn"));
         signinbutton.click();
             try {
        Thread.sleep(3000);

    } catch (InterruptedException e)
    {
        throw new RuntimeException(e);
    }
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    WebElement ErrorDes=driver.findElement(By.id("js-notification-box-msg"));
                Assert.assertEquals(ErrorDes.getText(),"Your email, password, IP address or location did not match");

    driver.quit();


}

}