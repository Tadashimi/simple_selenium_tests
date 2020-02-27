package com.brunoyam.utils.pages;

import org.openqa.selenium.WebDriver;

public class AllCoursesPage {
    private final WebDriver driver;

    public AllCoursesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
