# Test the Qytera search function
Feature: Qytera Search

  # This step will run before each scenario
  Background: The browser will be launched
    Given Launch the browser

  # Test case 1
  @TestName:QTAF-1
  Scenario: Search for Cucumber in Qytera
    Then Enter "Cucumber" in the search text box
    And Select the first result