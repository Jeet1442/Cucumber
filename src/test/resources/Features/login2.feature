Feature: Search in wikipedia and validate title

Scenario: Home Page Search
Given User on Wikipedia Home Page url
When User enter <item> to be searched
Then User press search button in wikipedia
And Validate the title of page and close browser

Examples:
|item	      |
|australia	  |
|india        |


