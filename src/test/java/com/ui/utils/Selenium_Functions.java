package com.ui.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.inject.Inject;

import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class Selenium_Functions {

    @Inject
    public Selenium_Functions() {

    }

    public static void waitTillDisplayed(WebDriver driver, By element) {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void click(WebDriver driver, By element) {
	driver.findElement(element).click();
    }

    public static void sendKeys(WebDriver driver, String keys, By element) {
	driver.findElement(element).sendKeys(keys);
    }
}
