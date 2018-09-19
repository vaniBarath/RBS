Feature: update First Name

@smoke
Scenario Outline: Sign into user Account and update the FirstName
And click the SignIn 
And enter the emailid as (.*)
And enter the password as (.*)
And click the SignIn button
And click the Personal Info
When enter the firstName
Then Verify first name is entered

Examples:
|emailid|password|
|someone@example.com|Password123|



