Feature: User should be login using correct credentials

  @wip
  Scenario: Positive login scenario
    Given user is on the login page of web table app
    When user enters username "Test"
    And user enters password "Testers"
    And user clicks on login button
    Then user should see url contains orders


