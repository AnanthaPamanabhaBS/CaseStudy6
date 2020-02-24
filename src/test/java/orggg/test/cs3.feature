Feature: Purchase a product

  Scenario: Purchase done fast
    Given user enters the TestMeApp and Logs in
    When user searches aproduct in search engine 
    Then user purchases the product
