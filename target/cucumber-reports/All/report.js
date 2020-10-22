$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/ProductStore.feature");
formatter.feature({
  "name": "Product Store",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Productstorefeature"
    }
  ]
});
formatter.scenario({
  "name": "verify Product Store",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Productstorefeature"
    },
    {
      "name": "@productstore"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to laptop",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStepDefs.i_navigate_to_laptop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Sony vaio i5\" to move to PDP",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.i_click_to_move_to_PDP(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add to Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "PDPStepDefs.i_click_on_Add_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I move to HomePage",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefs.i_move_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to laptop",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.i_navigate_to_laptop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \"Dell i7 8gb\" to move to PDP",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefs.i_click_to_move_to_PDP(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add to Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "PDPStepDefs.i_click_on_Add_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I move to cart page",
  "keyword": "And "
});
formatter.match({
  "location": "PDPStepDefs.i_move_to_cartpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete \"Dell i7 8gb\" from cart",
  "keyword": "Then "
});
formatter.match({
  "location": "CartPageStepDefs.i_delete_from_cart(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I place an order",
  "keyword": "And "
});
formatter.match({
  "location": "CartPageStepDefs.i_place_an_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the purchase amount is \"1490\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CartPageStepDefs.i_verify_the_purchase_amount_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click ok",
  "keyword": "And "
});
formatter.match({
  "location": "CartPageStepDefs.i_click_ok()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});