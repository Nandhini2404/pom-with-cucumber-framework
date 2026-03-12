Feature: CreateLead Functionality of leaftaps application


@Regression @Sanity 
Scenario Outline: CreateLead with Different set of data
Given Launch the browser
And Load the URL
And Enter the Username as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
When Clicking on the Login button
Then It should navigate to home page
When Click on the crmsfa link
And click on the leads link
And Click on the Create Lead
Given Enter the companayname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
When Click on the CreateLead button
Then Lead should be created


Examples:
|companyname|firstname|lastname|
|Testleaf|Nandhini|s|
|IDrive|prabhu|g|
|Qeagle|yashna|p|

