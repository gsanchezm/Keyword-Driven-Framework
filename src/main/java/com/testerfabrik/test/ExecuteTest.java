package com.testerfabrik.test;

import com.testerfabrik.utils.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecuteTest {
    WebDriver driver;
    String chromePath = System.getProperty("user.dir") + "/drivers/chromedriver.exe";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(dataProviderClass = TestData.class, dataProvider = "ParserData")
    public void driverEngine(String... perform) throws Exception {
        
    }
}
