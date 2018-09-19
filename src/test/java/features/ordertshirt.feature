Feature: Order TShirt

@smoke
Scenario Outline: Login to AutomationPractise and order TShirt(Positive)
And click the SignIn 
And enter the emailid as (.*)
And enter the password as (.*)
And click the SignIn button
And click the TShirt
And Mover hover the Image 
And click the AddtoCart button
When click the User Account
Then Verify order history page is displayed

Examples:
|emailid|password|
|someone@example.com|Password123|



