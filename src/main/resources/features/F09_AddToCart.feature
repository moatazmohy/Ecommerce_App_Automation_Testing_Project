@regression
Feature: Add Product to Cart

  Background: User should be logged
    Given User navigates to login page
    When User fills the required fields with valid email and password
    And User clicks login button
    Then User could login successfully

  Scenario:  Logged user could add different products to Shopping cart
      When User hover over electronics category
      And User clicks Camera & photo sub-Category
      And User clicks add to cart of a product
      And User goes to cart
      Then Product added successfully to the cart

  Scenario: Logged user could add different products to Shopping cart from the product page
    When User hover over electronics category
    And User clicks Cell Phones sub-Category
    And User clicks a product from the shown products
    And User clicks add to cart of the product
    And User goes to cart
    Then The Product added successfully to the cart