Feature: login page

Scenario Outline: login with invalid credentials
Given open loginPage_url
When enter "<username>" and "<password>"
Then click on checkbox
Then click on sign in button 
Then error "username/password" should display
Examples:
|username|password|
|harsha|pass123|
|vardhan|pass456|
|mula|pass789|

Scenario: login with valid credentials 
Given open loginPage_url
When enter username "rahulshettyacademy"  and password "learning"
When click on checkbox
Then click on sign in button 
Then Home should be displayed 



 