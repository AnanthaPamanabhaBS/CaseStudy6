Feature: Login into the TestMeApp
 
  Scenario Outline: Sucessfull Login
    Given  user is on the login page
    When user enters "<username>" and "<password>"
    Then user does succefull login

    Examples: 
      | username |password  | 
      | Lalitha  |password123|
