@Regression
Feature: Schedule time
    @Smoke @qa1
    Scenario: teacher sets new time
      Given user navigates to bookIt application
      When user logs in
      When user click on hunt
      And user sets the time and date
      And user clicks on search
      When user navigates to free spot page
      And user books time
      When user clicks on confirm button
      Then confirmation message is displayed

    @Smoke @qa1
    Scenario: user cancels the booking
      Given user navigates to bookIt application
      When user logs in
      When user goes into my schedule
      And user clicks on the schedule listed on the calendar
      When user clicks on cancel conference
      Then user verifies that booking is canceled