@JIRA-111
Feature: Login

  Scenario Outline: We will Test Login Scenarios with wrong username formats
    Given User is at Login Page
    When User enters username as "<Username>"
    Then User gets a Validation Message for username

    Examples:
      | Username |
      |a         |
      |a@bcg     |
      |@bc       |
      |ab.com    |

  @JIRA-123 @JIRA-456
  Scenario Outline: We will Test Login Scenarios with blank password
    Given User is at Login Page
    When User enters username as "<Username>"
    And User enters blank password
    Then User gets a Validation Message for password

    Examples:
      |Username          |
      |test@chainsys.com |
      |test@             |

  @JIRA-123
  Scenario Outline: We will Test Login Scenarios with incorrect username and password
    Given User is at Login Page
    When User enters username as "<Username>"
    And User enters password as "<Password>"
    Then User should get a Toast notification

    Examples:
      |Username     |Password
      |test@chainsys.com |psswrd3
      |test10@chainsys.com |psswrd

  @JIRA-456
  Scenario Outline: We will Test Login Scenarios with correct username and password
    Given User is at Login Page
    When User enters username as "<Username>"
    And User enters password as "<Password>"
    Then User should be redirected to page with title "<Title>"

    Examples:
      |Username     |Password        |Title
      |anirudho@auberginesolutions.com |Gmail@2022    |Title
