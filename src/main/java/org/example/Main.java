package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        //googletesting(driver);
        SeleniumTest(driver);
        //driver.findElement(By.xpath("(a[@href='https://www.guru99.com/introduction-to-selenium.html'])")).click();
    }

    private static void googletesting(WebDriver driver) {
        driver.get("https://google.com");

        // document.getElementsByName("q")[0]
        WebElement searchbox= driver.findElement(By.name("q"));
        searchbox.click();

        // document.getElementsByName("q")[0].value="Selenium Testing"
        searchbox.sendKeys("Selenium Testing");
        searchbox.sendKeys(Keys.ENTER);
    }
    public static void SeleniumTest(WebDriver driver)
    {
        driver.get("https://www.selenium.dev/");
        driver.findElement(By.linkText("blog"));
        driver.findElement(By.linkText(""));
//        driver.findElement(By.cssSelector("#main_navbar > ul > li:nth-child(7) > a")).click();
//        driver.findElement(By.id("m-blog2016-li")).click();
//        driver.findElement(By.cssSelector("body > div > div.td-main > div > main > div:nth-child(1) > div > ul > li:nth-child(4) > div > h5 > a")).click();
        driver.quit();
    }
    public static WebDriver ChromeDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }
}
