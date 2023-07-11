@header
Feature: Header functionality

  @Test @Smoke @Sanity @Regression
  Scenario Outline: <navigation> is displayed correctly
    Given John is on the home page
    Then he sees <navigation>
    Examples:
      | navigation  |
      | logo        |
      | about       |
      | services    |
      | customers   |
      | nearsurance |
      | resources   |
      | careers     |
      | ictgroup    |
      | contact     |
      | search      |


  @Test @Regression
  Scenario: About button in the navigation bar leads to the about page
    Given John is on the home page
    When he clicks on the about button
    Then he should be redirected to the about page

  @Test @Regression
  Scenario Outline: About dropdown displays <content>
    Given John is on the home page
    When he hovers over the about button
    Then he should see <content> displayed
    Examples:
      | content        |
      | our brands     |
      | our promises   |
      | our leadership |

  @Test @Regression
  Scenario Outline: About dropdown <options> redirect to the <options> page
    Given John is on the home page
    When he hovers over the about button
    And he selects the <options> option
    Then he is redirected to the <options> page
    Examples:
      | options        |
      | our brands     |
      | our promises   |
      | our leadership |