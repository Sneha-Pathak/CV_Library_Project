Feature: Job Search Test
  As a user I want to search job into CV Library Website

  Scenario Outline: User should able to search jobs successfully
    Given I am on homepage
    When I enter job title "<JobTitle>"
    And I enter location"<Location>"
    And I select distance "<Distance>"
    And I click on Find Jobs button
    Then Verify I should be navigate to jobs "<Jobs>" successfully

    Examples:
      | JobTitle          | Location | Distance | Jobs                              |
      | Software Tester   | London   | 25       | Software Tester jobs in London    |
      | Automation Tester | HA03DJ   | 15       | Automation Tester jobs in HA0 3DJ |

#      | Manual Tester     | City of London | 500      |
#      | Test Analyst      | HA03DJ         | 75       |
