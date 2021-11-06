Feature: Search in wikipedia

Scenario: Home Page Search
Given User on Wikipedia Home Page
When User enter subject to be searched in homepage
Then User press search button
And Result is displayed
