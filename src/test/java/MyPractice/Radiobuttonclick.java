package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Radiobuttonclick {
@Test
    public void radiobuttonclick() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/practice.html");
    WebElement fname=driver.findElement(By.name("firstname"));
    fname.sendKeys("Abhiman");
    WebElement lname=driver.findElement(By.name("lastname"));
    lname.sendKeys("Yadav");
    WebElement date=driver.findElement(By.id("datepicker"));
    date.sendKeys("20-12-2025");
    WebElement countryselect=driver.findElement(By.id("continents"));
    Select select  = new Select(countryselect);
    select.selectByVisibleText("Africa");
    WebElement selcommands=driver.findElement(By.id("selenium_commands"));
   Select selectcommands = new Select(selcommands);
    selectcommands.selectByVisibleText("WebElement Commands");
    //selenium_commands
    WebElement filePath = driver.findElement(By.xpath("//input[@class='input-file']"));
    filePath.sendKeys("C:\\Users\\Abhim\\Downloads\\logo TM-01 Edited.png");


    driver.findElement(By.id("sex-1")).click();
        driver.findElement(By.id("profession-0")).click();
       driver.findElement(By.id("tool-2")).click();

//input[@class='input-file']

        //input[@id='profession-0']/-
    //input[@id='tool-2']
    //input[@name='firstname']
    //input[@id='datepicker']
    //select[@id='continents']
    }
}