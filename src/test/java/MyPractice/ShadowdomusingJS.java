package MyPractice;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.sql.Driver;

public class ShadowdomusingJS {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Description("Verify Shadow DOM")
    @Test
    public void test_shadow_dom() {

        driver.manage().window().maximize();
        String URL = "https://selectorshub.com/xpath-practice-page/";
        driver.get(URL);
        driver.manage().window().maximize();
        JavascriptExecutor Js=(JavascriptExecutor)driver;
        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));
        Js.executeScript("arguments[0].scrollIntoView(true);",div_to_scroll);

       // Thread.sleep(3000);

        WebElement inputboxPizza = (WebElement) Js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"#pizza\");");
        inputboxPizza.sendKeys("farmhouse");





    }

    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}

