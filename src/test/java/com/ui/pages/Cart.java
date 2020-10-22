package com.ui.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.google.inject.Inject;
import com.ui.utils.Selenium_Functions;

import cucumber.runtime.java.guice.ScenarioScoped;

@ScenarioScoped
public class Cart {

    @Inject
    public void Cart() {

    }

    public void deleteFromCart(WebDriver driver, String arg) throws InterruptedException {
	By element = By.id("tbodyid");
	Selenium_Functions.waitTillDisplayed(driver, element);
	By element1 = By.xpath("//tbody[@id='tbodyid']//td[text()='Dell i7 8gb']");
	Selenium_Functions.click(driver, element1);
	Selenium_Functions.waitTillDisplayed(driver, element);
	Thread.sleep(2000);

    }

    public void placeAnOrder(WebDriver driver) {
	By element = By.xpath("//button[text()='Place Order']");
	Selenium_Functions.click(driver, element);

	By name = By.xpath("//div[@id='orderModal']//form/div/input[@id='name']");
	Selenium_Functions.sendKeys(driver, "Aakash", name);

	By country = By.xpath("//div[@id='orderModal']//form/div/input[@id='country']");
	Selenium_Functions.sendKeys(driver, "India", country);

	By city = By.xpath("//div[@id='orderModal']//form/div/input[@id='city']");
	Selenium_Functions.sendKeys(driver, "Gurgaon", city);

	By card = By.xpath("//div[@id='orderModal']//form/div/input[@id='card']");
	Selenium_Functions.sendKeys(driver, "1232123221133221", card);

	By month = By.xpath("//div[@id='orderModal']//form/div/input[@id='month']");
	Selenium_Functions.sendKeys(driver, "Nov", month);

	By year = By.xpath("//div[@id='orderModal']//form/div/input[@id='year']");
	Selenium_Functions.sendKeys(driver, "2022", year);

	By purchase = By.xpath("//button[text()='Purchase']");
	Selenium_Functions.click(driver, purchase);
    }

    public void verifyPurchaseAmount(WebDriver driver, String arg1) {
	By element = By.xpath("//div[contains(@class,'sweet-alert')]//p");
	String text = driver.findElement(element).getText();
	text = text.split("Amount: ")[1].split("USD")[0].trim();
	Assert.assertTrue("Value doesn't match. Expected: " + arg1 + " Actual: " + text, text.equalsIgnoreCase(arg1));
    }

    public void clickOk(WebDriver driver) {
	By element = By.xpath("//button[text()='OK']");
	Selenium_Functions.click(driver, element);
    }

}
