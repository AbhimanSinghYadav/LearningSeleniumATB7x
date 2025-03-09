package MyPractice;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Showallprices {
    @Test
    public void verifyprice() {
        ChromiumDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("-start maximized");
        options.addArguments("open incognitomode");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
        search.sendKeys("iphone15");
        search.sendKeys(Keys.ENTER);

        List<WebElement> searchtitles = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
        int maxSize = 10; // example limit
        int size = Math.min(searchtitles.size(), maxSize);

        for (int i = 0; i < size; i++) {
            System.out.println("Title: " + searchtitles.get(i).getText());
        }

        }
    }
