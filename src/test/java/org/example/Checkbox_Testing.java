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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Checkbox_Testing {
    private WebDriver driver;
    @BeforeClass
    public static void init()
    {
        WebDriverManager.chromedriver().setup();
    }
    @Before
    public void setup()
    {
        driver = new ChromeDriver();
        driver.get("http://localhost:8082/index.html");
        driver.findElement(By.id("checkboxLink")).click();
    }
    @After
    public void EndTest()
    {
        driver.quit();
    }
    @Test
    public void verifylettuce_checkbox_lettuce() {

        WebElement lettuce=driver.findElement(By.id("lettuceCheckbox"));
        lettuce.click();
        assertTrue(lettuce.isSelected());

    }@Test
    public void verifymayo_checkbox_lettuce() {

        WebElement mayo=driver.findElement(By.id("lettuceCheckbox"));
        mayo.click();
       assertTrue(mayo.isSelected());
    }
    @Test
    public void verifyturkey_checkbox_lettuce() {

        WebElement turkey=driver.findElement(By.id("lettuceCheckbox"));
        turkey.click();
        assertTrue(turkey.isSelected());

    }
    @Test
    public void verifyloadingcomplete_checkbox_lettuce() {

        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        WebElement msg = driver.findElement(By.id("message"));
        assertEquals("Loading complete...", msg.getText());
    }
}
