@Alltest
Feature: this file holds demo of tags scenario's

@Gmail
Scenario: validate gmail link
Given I open google page "https://google.co.in"
When I click on Gmail
Then I validate Gmail Page
When I close the browser


@Image
Scenario: validate Image link
Given I open google page "https://google.co.in"
When I click on Images
Then I validate Image Page
When I close the browser


@Advertising
Scenario: validate advertising link
Given I open google page "https://google.co.in"
When I click on adver
Then I validate adv Page
When I close the browser