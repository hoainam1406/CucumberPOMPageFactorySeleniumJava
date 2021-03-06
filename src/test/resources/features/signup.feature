Feature: This is test scenario

  @TC-S01
  Scenario Outline: @TC-S01 - Verify the system navigate to SignUp page successfully
    Given I want to open Login page
    When I click on Sign Up Here hyperlink
    Then The system navigate to SignUp page with <URL>
    Examples:
      | URL                                  |
      | https://iresource.smartdev.vn/signup |


  @TC-S02
  Scenario:  @TC-S02 - Verify Internal Personal RadioBtn is selected in default
    Given I want to open Login page
    When I click on Sign Up Here hyperlink
    Then The Internal Personal RadioBtn is selected in default

  @TC-S03
  Scenario Outline: @TC-S03 - Verify sign up fail with FirstName blank
    Given I want to open Login page
    When I click on Sign Up Here hyperlink
    And I enter <LastName>, <Email>, <Password>, <ConfirmPassWord>
    And I click SignUp button
    Then The <alert> displays under FirstName field
    Examples:
      | LastName | Email             | Password    | ConfirmPassWord | alert     |
      | Phuong   | giang0875@qa.team | Giankjg123@ | Giang123@       | Required! |
      | Nam      | giang3175@qa.team | Gg123@gh    | Gg123@gh        | Required! |

  @TC-S04
  Scenario Outline: @TC-S04 - Verify sign up fail with Confirm Password don't match with Password
    Given I want to open Login page
    When I click on Sign Up Here hyperlink
    And I enter valid data into <FirstName>, <LastName>, <Email>
    But I enter <ConfirmPassword> don't match with <Password>
    And I click SignUp button
    Then The <alert> displays under Confirm Password field
    Examples:
      | FirstName | LastName | Email             | ConfirmPassword | Password  | alert                  |
      | Hoang     | Nguyen   | giang3235@qa.team | Giang1234@      | Giang5687 | Password doesn’t match |

  @TC-S05
  Scenario Outline: Verify System navigate to VerifyEmail page when clicking SignUp button with valid data
    Given I want to open Login page
    When I click on Sign Up Here hyperlink
    When I enter <FirstName>, <LastName>, <Email>, <ConfirmPassword>, <Password>
    And I click SignUp button
    And I wait 10 seconds
    Then System navigate to VerifyEmail page with new <URL>
    Examples:
      | FirstName | LastName | Email | ConfirmPassword | Password | URL |
      | Giang | Thanh Phuong | phuongthanhgiang+test2000@gmail.com | 123dfg* | 123dfg* | https://iresource.smartdev.vn/verify-email |