package com.brunoyam.selenium_test;

import com.brunoyam.utils.pages.AllCoursesPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.brunoyam.utils.Constants.ALL_COURSES_PAGE_TITLE;
import static com.brunoyam.utils.Constants.ALL_COURSES_URI;

public class BrunoyamAllCoursesPageTest {
    private WebDriver driver;

    @Before
    public void setupDriver() {
        System.getProperties().setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(ALL_COURSES_URI);
    }

    @After
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testPageTitle() {
        AllCoursesPage allCoursesPage = new AllCoursesPage(driver);
        Assert.assertEquals(ALL_COURSES_PAGE_TITLE, allCoursesPage.getPageTitle());
    }
}
