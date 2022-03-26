package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Checkboxes extends BaseClass {
    //    Checkboxes - проверить, что первый чекбокс unchecked, отметить первый чекбокс,
//    проверить что он checked. Проверить, что второй чекбокс checked, сделать unheck,
//    проверить, что он unchecked

    private boolean isChecked;

    @Test
    public void checkingTheFirstCheckboxTest() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        if (!driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected()) {
            driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
            isChecked = driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected();
            Assert.assertEquals(isChecked, true);
        }
    }

    @Test
    public void checkingTheSecondCheckboxTest() {
        if ((driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected())) {
            driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
            isChecked = driver.findElement(By.xpath("//input[@type='checkbox'][2]")).isSelected();
            Assert.assertEquals(isChecked, false);
        }
    }
}
