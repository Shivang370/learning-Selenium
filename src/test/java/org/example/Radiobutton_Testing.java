package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class Radiobutton_Testing {
    private WebDriver driver;
    @BeforeClass
    public static void init()
    {
        WebDriverManager.chromedriver().setup();
    }
    @Before
    public void setup()
    {
        driver=new ChromeDriver();
        driver.get("http://localhost:8082/index.html");
        driver.findElement(By.id("radioLink")).click();
    }
    @After
    public void Endtest()
    {
        driver.quit();
    }
    @Test
    public void Check_radioRed()
    {
        WebElement Red=driver.findElement(By.cssSelector("body > div > form > input[type=radio]:nth-child(1)"));
        Red.click();
        assertTrue(Red.isSelected());
    }
    @Test
    public void Check_radioBlue()
    {
        WebElement Blue=driver.findElement(By.cssSelector("body > div > form > input[type=radio]:nth-child(5)"));
        Blue.click();
        assertTrue(Blue.isSelected());
    }
    @Test
    public void Check_radioGreen()
    {
        WebElement Green=driver.findElement(By.cssSelector("body > div > form > input[type=radio]:nth-child(3)"));
        Green.click();
        assertTrue(Green.isSelected());
    }
}
