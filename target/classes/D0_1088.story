Browse MovieTickets.com

Meta:
@category In order to purchase a ticket with correct redemption option.
@color blue




Scenario: On refreshing the page the redemption options displayed

Given a user is purchasing a ticket 
When they are on the Redemption Option page
!-- Then Verify if the redemption page is displayed.
Then the user refreshes the page
And clicked Continue Order
Then they should be returned to the Redemption Option page