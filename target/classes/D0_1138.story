Browse MovieTickets.com

Meta:
@category 
@color green


Narrative:
In order to purchase a tickets
As a user with a Guest Checkout
I want to book the ticket without saving the credit card details to the current account.

Scenario: On Guest Checkout - Credit card option should not be displayed.

Given a user is already signed In
When the user is purchasing a ticket
And selects the Guest Checkout to complete the transcation
Then they should not be able to store Credit card into the account that is signed  in