Feature:	To register in the TestMeApp
 
  Scenario Outline: 
   Given User click on register or signup button on register app
   When user enters "<userName>" , "<firstName>" , "<lastName>" , "<password>" , "<confirmPassword>" , "<emailAddress>" , "<moblieNumber>" , "<dob>" , "<address>" , "<answer>"
   Then user navigates to the home page 
   
    Examples:
      |userName|firstName|lastName  |password|confirmPassword|gender|emailAddress    |mobileNumber|dob       |address|SecurityQuestion              |answer|Submit|
      |Aghuyg  |anana    |padmanabha|12345   |12345          |male  |ananth@gmail.com|8217353049  |24/12/1997|Chennai|Which is your favourite colour|blue  |click |