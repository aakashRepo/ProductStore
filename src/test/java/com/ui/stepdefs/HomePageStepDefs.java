package com.ui.stepdefs;

import org.openqa.selenium.WebDriver;

import com.google.inject.Inject;
import com.ui.pages.HomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDefs {

    private WebDriver driver;

    HomePage homePage;

    @Inject
    public HomePageStepDefs(HomePage homePage) {
	this.homePage = homePage;
	driver = Hooks.driver;
    }

    @Given("^I navigate to laptop$")
    public void i_navigate_to_laptop() {
	homePage.navigateToLaptop(driver);
    }

    @Then("^I click \"([^\"]*)\" to move to PDP$")
    public void i_click_to_move_to_PDP(String arg1) {
	homePage.clickToMoveToPDP(driver, arg1);
    }

    @And("^I move to HomePage$")
    public void i_move_to_homepage() {
	homePage.moveToHomePage(driver);
    }

}
