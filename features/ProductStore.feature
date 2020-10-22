@Productstorefeature
Feature: Product Store

  @productstore @Sanity @Regression
  Scenario: verify Product Store
  Given I navigate to laptop
  Then I click "Sony vaio i5" to move to PDP
  Then I click on Add to Cart
  And I move to HomePage
  Then I navigate to laptop
  And I click "Dell i7 8gb" to move to PDP
  Then I click on Add to Cart
  And I move to cart page
  Then I delete "Dell i7 8gb" from cart
  And I place an order
  Then I verify the purchase amount is "1490"
  And I click ok