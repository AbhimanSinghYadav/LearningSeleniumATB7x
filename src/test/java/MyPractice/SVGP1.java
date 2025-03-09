package MyPractice;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class SVGP1 {
    EdgeDriver driver;
    @BeforeTest
    public void svg() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }
        @Test
        @Description("Verify the product title")
        public void search () {
            driver.findElement(By.xpath("//input[@class='zDPmFV']")).sendKeys("macmini");


            List<WebElement> svgelements = driver.findElements(By.xpath("//*[name()='svg']"));
            svgelements.get(0).click();

            List<WebElement> L = driver.findElements(By.xpath("//div[contains(@data-id,'CPU')]/div/a[2]"));

            for (WebElement title : L) {
                System.out.println(title.getText());
            }
        }
            public void closeBro () {

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);

                }
                driver.quit();
            }


        }

