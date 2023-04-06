Feature: Notifications

  Scenario Outline: We will Test if counters are working properly for Title and Body
    Given User is at Notifications Page
    And counter values are set to default
    When User enters title as "<Title>"
    Then title count is accurate
    When User enters body as "<Body>"
    Then Body count is accurate

    Examples:
      | Title | Body |
      | a         | This |
      |The title is     | This body is |
      |QA Test Notification       | QA Test Notification|

  Scenario: We will Test if Send button is disabled when screen loads
    Given User is at Notifications Page
    When Title is blank
    And Body Is blank
    Then Send Button is disabled


  Scenario: We will Test if Send button is disabled when Title is Blank
    Given User is at Notifications Page
    When Title is blank
    And Body Is not blank
    Then Send Button is disabled


  Scenario: We will Test if Send button is disabled when Body is Blank
    Given User is at Notifications Page
    When Title is not blank
    And Body Is blank
    Then Send Button is disabled


  Scenario: We will Test if Send button is disabled when Confirmation field is Blank
    Given User is at Notifications Page
    When Title is not blank
    And Body Is blank
    Then Send Button is disabled


  Scenario: We will Test if Send button is enabled when Confirmation field is filled
    Given User is at Notifications Page
    When Title is not blank
    And Body Is not blank
    Then Send Button is disabled
    When Confirmation field is updated
    Then Send Button is enabled


  Scenario: We will Test if Toast message appears when Notification sent
    Given User is at Notifications Page
    When Title is not blank
    And Body Is not blank
    And Confirmation field is updated
    And Send Button is clicked
    Then Toast Message appears

