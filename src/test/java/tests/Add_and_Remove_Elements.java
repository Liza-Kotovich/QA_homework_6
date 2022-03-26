package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Add/Remove Elements - добавить 2 элемента, удалить элемент, проверить количество элементов

public class Add_and_Remove_Elements extends BaseClass {
    int counter = 1;

    @Test
    public void addAndRemoveElementsTest() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();
        driver.findElement(By.xpath("//button[text()='Delete'][2]")).click();
        int counterOfElements = driver.findElements(By.xpath("//button[text()='Delete']")).size();
        Assert.assertEquals(counterOfElements, counter);
    }
}
