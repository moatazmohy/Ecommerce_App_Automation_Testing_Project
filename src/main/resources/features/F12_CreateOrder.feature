@regression
Feature: Create Order

  Background: User should be logged
    Given User navigates to login page
    When User fills the required fields with valid email and password
    And User clicks login button
    Then User could login successfully

  Scenario: User can create successful Order
    Given Shopping cart is empty
    When User clicks Books category
    And User clicks add to cart of a book
    And User goes to cart
    And User clicks checkout button
    And User fills required fields of billing address
    And User selects shipping method and payment method
    And User confirms the order
    Then Successful message appears
