package MyPractice;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.thetestingacademy.SeleniumExamples.Seleniumwaits.Waithelpers.checkVisibilityByFluentWait;

public class Loginverifyfluentwait {
@Test


    public void verifyfluentwaits(){

            // <input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">
            EdgeOptions edgeOptions = new EdgeOptions();
            edgeOptions.addArguments("--incognito");
            edgeOptions.addArguments("--start-maximized");

            // FindElement -> 1 element first web element
            // FindElements -> which can find multiple web elements

            WebDriver driver = new EdgeDriver(edgeOptions);
            driver.navigate().to("https://app.vwo.com");
            System.out.println(driver.getTitle());

            Assert.assertEquals(driver.getTitle(), "Login - VWO");
            Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");


            // 1. Find the email inputbox and enter the email
            WebElement emailInputBox = driver.findElement(By.id("login-username"));
            emailInputBox.sendKeys("admin@admin.com");


            WebElement passwordInputBox = driver.findElement(By.name("password"));
            passwordInputBox.sendKeys("password@321");


            WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
            buttonSubmit.click();

//        // After 3 seconds error comes
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


            // Condition
//        FluentWait<WebDriver> wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(10))
//                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
//
//
//        WebElement error_message = wait.until(new Function<WebDriver, WebElement>() {
//            public WebElement apply(WebDriver driver) {
//                return driver.findElement(By.className("notification-box-description"));
//            }
//        });

            WebElement error_message = checkVisibilityByFluentWait(driver,By.className("notification-box-description"));


            Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");


            driver.quit();


        }

    }


