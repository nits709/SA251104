Feature: validate test automation login feature


#Scenario: validate testautomation login
#Given The user launch application URL "https://practicetestautomation.com/practice-test-login/"
#When The user enter username "student"
#When The user enter password "Password123"
#When The user submit login page
#Then The user validates login succsesfully




Scenario Outline: validate testautomation login
Given The user launch application URL "<URL>"
When The user enter username "<Username>"
When The user enter password "<Password>"
When The user submit login page
Then The user validates login succsesfully

Examples:
|URL|Username|Password|
|https://practicetestautomation.com/practice-test-login/|student|Password123|
|https://practicetestautomation.com/practice-test-login/|student|Password123|
|https://practicetestautomation.com/practice-test-login/|student|Password123|
|https://practicetestautomation.com/practice-test-login/|student|Password123|
|https://practicetestautomation.com/practice-test-login/|student|Password123|
|https://practicetestautomation.com/practice-test-login/|student|Password123|
|https://practicetestautomation.com/practice-test-login/|student|Password123|