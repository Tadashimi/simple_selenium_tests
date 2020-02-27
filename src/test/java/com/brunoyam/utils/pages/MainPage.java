package com.brunoyam.utils.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;
    private final String ALL_COURSES_XPATH = "//div[contains(@class, 'text-center')]/a[@href=\"https://brunoyam.com/obuchenie\"]";
    private final String LOGO_LINK_CLASS = "logo-link";
    private final String LOGO_IMG_CSS = "img[class='img-fluid logo']";

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public WebElement getAllCoursesButton() {
        return driver.findElement(By.xpath(ALL_COURSES_XPATH));
    }

    public void clickOnAllCoursesButton() {
        getAllCoursesButton().click();
    }

    public WebElement getLogoLink() {
        return driver.findElement(By.className(LOGO_LINK_CLASS));
    }

    public WebElement getLogoImg() {
        return driver.findElement(By.cssSelector(LOGO_IMG_CSS));
    }
}
