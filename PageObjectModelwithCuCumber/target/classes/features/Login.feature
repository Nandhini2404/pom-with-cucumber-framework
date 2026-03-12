Feature: Login Functionn of Leaftaps Application.

@Smoke
Scenario: Login with Valid credentials.


And Enter the Username as 'Demosalesmanager'
And  Enter the Password as 'crmsfa'
When Clicking on the Login button
Then It should navigate to home page

@Sanity @Smoke
Scenario: Login with Invalid credentials.


And Enter the Username as 'Demo'
And  Enter the Password as 'crms'
When Clicking on the Login button
But it should throws error