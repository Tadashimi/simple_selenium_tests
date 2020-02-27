package com.brunoyam.selenium_test;

import com.brunoyam.utils.pages.MainPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.brunoyam.utils.Constants.*;

public class BrunoyamMainPageTest {
    private WebDriver driver;
    private MainPage mainPage;

    @Before
    public void setupDriver() {
        System.getProperties().setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(MAIN_PAGE_URI);
        mainPage = new MainPage(driver);
    }

    @After
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testPageTitle() {
        Assert.assertEquals(MAIN_PAGE_TITLE, mainPage.getPageTitle());
    }

    @Test
    public void testLogoLink() {
        WebElement logoLink = mainPage.getLogoLink();
        Assert.assertEquals(MAIN_PAGE_URI, logoLink.getAttribute("href"));
    }

    @Test
    public void testLogoImg() {
        WebElement logoLink = mainPage.getLogoImg();
        Assert.assertEquals(LOGO_SRC, logoLink.getAttribute("src"));
    }

    @Test
    public void testAllCoursesButton() {
        WebElement allCoursesButton = mainPage.getAllCoursesButton();
        Assert.assertTrue(allCoursesButton.isDisplayed());
        Assert.assertTrue(allCoursesButton.isEnabled());
    }

    @Test
    public void testFrowardToAllCoursesPage() {
        mainPage.clickOnAllCoursesButton();
        Assert.assertEquals(driver.getCurrentUrl(), ALL_COURSES_URI);
    }

}
