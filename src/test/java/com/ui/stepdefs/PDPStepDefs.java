package com.ui.stepdefs;

import org.openqa.selenium.WebDriver;

import com.google.inject.Inject;
import com.ui.pages.PDP;

import cucumber.api.java.en.Then;

public class PDPStepDefs {

    WebDriver driver;
    PDP pdp;

    @Inject
    public PDPStepDefs(PDP pdp) {
	this.pdp = pdp;
	this.driver = Hooks.driver;
    }

    @Then("^I click on Add to Cart$")
    public void i_click_on_Add_to_Cart() throws InterruptedException {
	pdp.clickAddToCart(driver);
    }

    @Then("^I move to cart page$")
    public void i_move_to_cartpage() {
	pdp.moveToCart(driver);
    }

}
