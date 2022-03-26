package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Typos extends BaseClass {
    String expectedText = "This example demonstrates a typo being introduced. It does it randomly on each page load. Sometimes you'll see a typo, other times you won't.";
    String firstPartOfText;
    String secondPartOfText;
    String actualText;

    @Test
    public void spellingTest() {
        driver.get("http://the-internet.herokuapp.com/typos");
        firstPartOfText = driver.findElement(By.tagName("p")).getText();
        secondPartOfText = driver.findElement(By.xpath("//p[2]")).getText();
        actualText = firstPartOfText + " " + secondPartOfText;
        Assert.assertEquals(actualText, expectedText);
    }
}
