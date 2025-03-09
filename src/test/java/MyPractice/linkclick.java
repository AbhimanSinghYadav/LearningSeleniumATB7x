package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

public class linkclick {
@Test
    public void linkclickvwo(){
        ChromiumDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");


       // WebElement link=driver.findElement(By.className("text-link"));
       // link.click();
   // WebElement link=driver.findElement(By.linkText("Start a free trial"));
   //  link.click();

    WebElement link=driver.findElement(By.partialLinkText("a free"));
    link.click();
        driver.quit();

    }

}
