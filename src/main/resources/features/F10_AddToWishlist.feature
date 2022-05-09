@regression
Feature: Add Product to Wishlist

  Background: User should be logged
    Given User navigates to login page
    When User fills the required fields with valid email and password
    And User clicks login button
    Then User could login successfully

  Scenario:  Logged user could add different products to Wishlist
    Given Wishlist is empty
    When User clicks Books category
    And User clicks Wishlist button of a product
    And User goes to Wishlist
    Then Product added successfully to the Wishlist

  Scenario: Logged user could add different products to Wishlist from the product page
    Given Wishlist is empty
    When User clicks jewelry category
    And User clicks a jewelry from the shown products
    And User clicks add to Wishlist of the product
    And User goes to Wishlist
    Then The Product added successfully to the Wishlist