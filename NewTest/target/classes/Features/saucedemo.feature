Feature: Saucedemo web functions
  Scenario Outline: Add a product to Saucedemo cart
    Given User opens the browser
    When User logs into the application with correct <Username> and <Password>
    Then User Selects a product and adds the product to the cart
    Then User verifies if the correct product is added to the cart


    Examples:
    |Username| |Password|
    | standard_user| |secret_sauce|