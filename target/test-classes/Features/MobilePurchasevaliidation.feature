#Author: your.email@your.domain.com


Feature: Mobile purchase validation
 
  Scenario: Mobile purchase validation
    Given User launches flipkart application
    And User handles login
    When User search mobile
    And User select the mobile
    And user validating Mobile name
    And user validating Mobile price and offers
    And user validating pincode by invalid code  
    Then add to cart and validating product delivery date
    And validating total price details
