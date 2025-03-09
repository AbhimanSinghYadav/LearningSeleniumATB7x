package MyPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class alert {
    public void alert() {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        element.click();


        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Abhiman");
        alert.accept();

        WebElement ele= driver.findElement(By.xpath("//p[@id='result']"));

        String result=driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result,"You entered: Abhiman");



    }}
