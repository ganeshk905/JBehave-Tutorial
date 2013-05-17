Browse MovieTickets.com

Meta:
@author Sai Krishna
@themes UI Usability
@color red


Narrative: 
In order to search for the Ticketing Theaters 
As a user 
I want to display the results within a search range .

Scenario: Retain the search range value when moving between the tabs

Given A user is on the house list page
When they change the default search range
And click the Ticketing Theaters tab
Then the search range should retain the choosen value

Scenario:Search for Ticketing Theaters when changing the search range value

Meta:
@skip   
@ignored false
Given A user is on the house list page
When User Navigates to  the Ticketing Theaters tab
And then change the default search range
Then they should remain on the Ticketing Theaters tab





