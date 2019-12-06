Feature: Test Login functionality of IB

  Scenario Outline: Test that the user is able to login successfully
    Given I am on login page
    When I enter "<username>" and "<password>"
    And click on continue button
    Then I should be landed on MIPage

    Examples:
      | username  | password   |
      |  |  |