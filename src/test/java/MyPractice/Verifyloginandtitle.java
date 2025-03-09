package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifyloginandtitle {
    @Test
    public void verifytile(){
        ChromiumDriver driver=new ChromeDriver();
        driver.get("https://www.idrive360.com/enterprise/login");
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("-start maximized");
        options.addArguments("open incognitomode");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement email=driver.findElement(By.id("username"));
        email.sendKeys("augtest_040823@idrive.com");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("123456");
        WebElement check=driver.findElement(By.xpath("//span[@class='id-checkmark']"));
        check.click();
        WebElement signin=driver.findElement(By.xpath("//button[@id='frm-btn']"));
        signin.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
       // WebElement text=driver.findElement(By.xpath("//span[starts-with(text(), 'Your free trial has expired')]"));
        WebElement text = driver.findElement(By.xpath("//span[starts-with(., 'Your free trial has expired')]"));
        Assert.assertEquals("Your free trial has expired", text.getText());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
