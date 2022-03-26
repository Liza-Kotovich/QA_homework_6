package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Inputs extends BaseClass{
    //    Проверить на возможность ввести различные цифровые и нецифровые значения,

    String firstNumericValue = "12345";
    String secondNumericValue = "0";
    String thirdNumericValue = "-5";
    String textValue ="hi";

    @Test
    public void inputNumericValuesTest() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(firstNumericValue);
        driver.findElement(By.xpath("//input[@type='number']")).clear();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(secondNumericValue);
        driver.findElement(By.xpath("//input[@type='number']")).clear();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(thirdNumericValue);
        String num = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        Assert.assertEquals(num, thirdNumericValue);
    }

    @Test
    public void inputTextValuesTest() {
        driver.findElement(By.xpath("//input[@type='number']")).clear();
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys(textValue);
        String word = driver.findElement(By.xpath("//input[@type='number']")).getAttribute("value");
        Assert.assertEquals(word, textValue);
    }
}