package com.ui.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.inject.Inject;
import com.ui.utils.Selenium_Functions;

import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class PDP {

    @Inject
    public PDP() {

    }

    public void clickAddToCart(WebDriver driver) throws InterruptedException {
	By element = By.xpath("//a[text()='Add to cart']");
	Selenium_Functions.waitTillDisplayed(driver, element);
	Selenium_Functions.click(driver, element);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	alert.accept();
    }

    public void moveToCart(WebDriver driver) {
	By element = By.id("cartur");
	Selenium_Functions.waitTillDisplayed(driver, element);
	Selenium_Functions.click(driver, element);
    }

}
