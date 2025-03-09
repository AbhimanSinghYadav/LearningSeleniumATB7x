package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Makemytripnormalwait {
@Test
    public void closepopup(){

        EdgeDriver driver=new EdgeDriver();
        EdgeOptions options=new EdgeOptions();
        driver.get("https://www.makemytrip.com/");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='commonModal__close']")));

        WebElement Close= driver.findElement(By.xpath("//span[@class='commonModal__close']"));
        Close.click();

      try {
        Thread.sleep(10000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    driver.quit();
}
}
