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

import static org.junit.Assert.assertEquals;

public class Selenium_Testing {

    //AAA :Arrange Act & Assert
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
        driver.get("https://selenium.dev");
        driver.findElement(By.linkText("Blog")).click();
    }
    @After
    public void EndTest()
    {
        driver.quit();
    }
    @Test
    public void test_selenium_dot_dev_blog() {

        driver.findElement(By.id("m-blog2016")).click();
        WebElement element = driver.findElement(By.linkText("Fall Selenium Conf, Save the Date & Call for Speakers!"));
        assertEquals("Fall Selenium Conf, Save the Date & Call for Speakers!", element.getText());
        String title = driver.getTitle();
        assertEquals("Blog Posts - 2016 | Selenium", title);

    }
    @Test
    public void test_selenium_dot_dev_blog_2017()
    {
        driver.findElement(By.id("m-blog2017")).click();
        String title = driver.getTitle();
        assertEquals("Blog Posts - 2017 | Selenium", title);
    }
}
