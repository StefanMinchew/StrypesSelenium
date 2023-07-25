@Homepage
Feature: Homepage tests

  @Test @Regression @UI
  Scenario: User can see the homepage correctly displayed
    Given John is on the home page
    Then he can see the homepage displayed
      | hero section      |
      | who are we        |
      | our services      |
      | software solution |
      | nearsurance       |
      | statistics        |
      | partners          |
      | whats new         |
      | learn more        |
      | certifications    |

  @Test @Regression @Functionality @Button
  Scenario Outline:  User is redirected to the <page> page after clicking on the <button> button
    Given John is already on the page
    When he clicks on the <button> button
    Then he is redirected to the <page> page
    Examples:
      | button                  | page        |
      | top section learn more  | services    |
      | who are we learn more   | about       |
      | our services learn more | services    |
      | nearsurance learn more  | nearsurance |
      | what is new learn more  | blog        |
      | get in touch            | contact     |