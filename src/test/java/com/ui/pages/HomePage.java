package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.google.inject.Inject;
import com.ui.utils.Selenium_Functions;

import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class HomePage {

    @Inject
    public HomePage() {

    }

    public void navigateToLaptop(WebDriver driver) {
	By element = By.xpath("//a[text()='Laptops']");
	Selenium_Functions.waitTillDisplayed(driver, element);
	Selenium_Functions.click(driver, element);
    }

    public void clickToMoveToPDP(WebDriver driver, String arg1) {
	By element = By.xpath("//a[text()='" + arg1 + "']");
	Selenium_Functions.waitTillDisplayed(driver, element);
	Selenium_Functions.click(driver, element);
    }

    public void moveToHomePage(WebDriver driver) {
	driver.findElement(By.id("nava")).click();
    }
}
