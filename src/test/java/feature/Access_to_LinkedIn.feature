Feature: Access to LinkedIn using Google chrome browser
  Scenario: Verify the user is able to access LinkedIn using google chrome
    Given A chrome browser
    When I try to access LinkedIn website
    Then I see Welcome to your professional community
