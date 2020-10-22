package com.ui.stepdefs;

import org.openqa.selenium.WebDriver;

import com.google.inject.Inject;
import com.ui.pages.Cart;

import cucumber.api.java.en.Then;

public class CartPageStepDefs {

    Cart cart;
    WebDriver driver;

    @Inject
    public CartPageStepDefs(Cart cart) {
	this.cart = cart;
	this.driver = Hooks.driver;
    }

    @Then("^I delete \"([^\"]*)\" from cart$")
    public void i_delete_from_cart(String arg1) throws InterruptedException {
	cart.deleteFromCart(driver, arg1);
    }

    @Then("^I place an order$")
    public void i_place_an_order() {
	cart.placeAnOrder(driver);
    }

    @Then("^I verify the purchase amount is \"([^\"]*)\"$")
    public void i_verify_the_purchase_amount_is(String arg1) {
	cart.verifyPurchaseAmount(driver, arg1);
    }

    @Then("^I click ok$")
    public void i_click_ok() {
	cart.clickOk(driver);
    }

}
