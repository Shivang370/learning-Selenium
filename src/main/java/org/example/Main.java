package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Main {
    public static void main(String[] args) {

        //FirefoxOptions options=new FirefoxOptions();
        //options.setBinary("/usr/bin/firefox");

        //WebDriver driver=new FirefoxDriver(options);
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");

        // document.getElementsByName("q")[0]
        WebElement searchbox=driver.findElement(By.name("q"));
        searchbox.click();

       // document.getElementsByName("q")[0].value="Selenium Testing"
        searchbox.sendKeys("Selenium Testing");
        searchbox.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("(a[@href='https://www.guru99.com/introduction-to-selenium.html'])")).click();

    }
}
