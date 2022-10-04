Feature: User Purchase the product

Scenario: Home Page
Given user Launch The Application Url.
When user Select The Category From The Dropdown.
And user Enter The Product in Search Box
Then check On The Suggestions and Click On The Matching Suggestion.


Scenario: Product List Out Page
When user Check The Number Of Products Under Results 
Then user Check The Number Of Products Under More Results 


