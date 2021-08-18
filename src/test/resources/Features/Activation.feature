Feature: Activating the application

  Scenario: User able to login using correct pincode
    Given user is on the login page
    When user enters pincode
    And clicks on login button
    Then user is navigated to home page
		And user taps on Go to setting 
		Then taps on Wakoopa QA1 in Device Setting
		Then taps the toggle to permit usage