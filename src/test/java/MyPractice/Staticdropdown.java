package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Staticdropdown {

@Test

        public void verifydropdown() {
    EdgeDriver driver = new EdgeDriver();
    driver.get("https://the-internet.herokuapp.com/dropdown");
    System.out.println(driver.getTitle());
    driver.manage().window().maximize();

    WebElement element_select = driver.findElement(By.id("dropdown"));
    Select select = new Select(element_select);
//        select.selectByVisibleText("Option 2");
    select.selectByIndex(2);
}
}
