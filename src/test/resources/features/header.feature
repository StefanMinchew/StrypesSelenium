@Header
Feature: Header tests

  Background:
    Given John is on the home page

  @Test @Smoke @Sanity @Regression
  Scenario Outline: <navigation> is displayed correctly
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
    When he clicks on the about button
    Then he should be redirected to the about page

  @Test @Regression
  Scenario Outline: About submenu displays <content>
    When he hovers over the about button
    Then he should see <content> displayed
    Examples:
      | content        |
      | our brands     |
      | our promises   |
      | our leadership |

  @Test @Regression
  Scenario Outline: About submenu <options> redirect to the <options> page
    When he hovers over the about button
    And he selects the <options> option
    Then he is redirected to the <options> page
    Examples:
      | options        |
      | our brands     |
      | our promises   |
      | our leadership |

  @Test @Regression
  Scenario: Services button in the navigation bar leads to the services page
    When he clicks on the services button
    Then he should be redirected to the services page

  @Test @Regression
  Scenario: Customers button in the navigation bar leads to the custoemrs page
    When he clicks on the customers button
    Then he should be redirected to the customers page

  @Test @Regression
  Scenario: Nearsurance button in the navigation bar leads to the nearsurance page
    When he clicks on the nearsurance button
    Then he should be redirected to the nearsurance page

  @Test @Regression
  Scenario: Resources button in the navigation bar leads to the resources page
    When he clicks on the resources button
    Then he should be redirected to the resources page

  @Test @Regression
  Scenario: Careers button in the navigation bar leads to the careers page
    When he clicks on the careers button
    Then he should be redirected to the careers page

  @Test @Regression
  Scenario: About ICT Group button in the navigation bar leads to the about ICT Group page
    When he clicks on the about ICT Group button
    Then he should be redirected to the about ICT Group page

  @Test @Regression
  Scenario: Contact button in the navigation bar leads to the contact page
    When he clicks on the contact button
    Then he should be redirected to the contact page

  @Test @Regression
  Scenario Outline: Services submenu displays <content>
    When he hovers over the services button
    Then he should see <content> displayed
    Examples:
      | content                                                   |
      | Devops                                                    |
      | Digital transformation                                    |
      | Mobility and Transportation                               |
      | Remote Diagnostics, Monitoring and Predictive Maintenance |
      | SDaaS                                                     |
      | Software Integration and FLaaS                            |
      | Smart applications                                        |
      | Modularity Services                                       |

  @Test @Regression
  Scenario Outline: Services submenu <options> redirect to the <options> page
    When he hovers over the services button
    And he selects the <options> option
    Then he is redirected to the <options> page
    Examples:
      | options                                                   |
      | Devops                                                    |
      | Digital transformation                                    |
      | Mobility and Transportation                               |
      | Remote Diagnostics, Monitoring and Predictive Maintenance |
      | SDaaS                                                     |
      | Software Integration and FLaaS                            |
      | Smart applications                                        |
      | Modularity Services                                       |

  @Test @Regression
  Scenario: DevOps IT Infrastructure submenu is displayed
    When he hovers over the services button
    And he hovers over the DevOps button
    Then he should see the IT Infrastructure submenu

  @Test @Regression
  Scenario:  DevOps IT Infrastructure submenu redirects to its page
    When he hovers over the services button
    And he hovers over the DevOps button
    And he selects the IT Infrastructure option
    Then he is redirected to the IT Infrastructure page

  @Test @Regression
  Scenario: Digital transformation Consultancy submenu is displayed
    When he hovers over the services button
    And he hovers over the Digital Transformation button
    Then he should see the Consultancy submenu

  @Test @Regression
  Scenario:  Digital transformation Consultancy submenu redirects to its page
    When he hovers over the services button
    And he hovers over the Digital Transformation button
    And he selects the Consultancy option
    Then he is redirected to the Consultancy page

  @Test @Regression
  Scenario Outline: Smart applications submenu displays <content>
    When he hovers over the services button
    And he hovers over the Smart application button
    Then he should see <content> displayed
    Examples:
      | content                   |
      | Application modernization |
      | Application management    |
      | Application development   |

  @Test @Regression
  Scenario Outline: Smart applications submenu <options> redirect to the <options> page
    When he hovers over the services button
    And he hovers over the Smart application button
    And he selects the <options> option
    Then he is redirected to the <options> page
    Examples:
      | options                   |
      | Application modernization |
      | Application management    |
      | Application development   |

  @Test @Regression
  Scenario Outline: Resources submenu displays <content>
    When he hovers over the resources button
    Then he should see <content> displayed
    Examples:
      | content         |
      | Blog            |
      | Whitepapers     |
      | Success Stories |

  @Test @Regression
  Scenario Outline: Resources submenu <options> redirect to the <options> page
    When he hovers over the resources button
    And he selects the <options> option
    Then he is redirected to the <options> page
    Examples:
      | options         |
      | Blog            |
      | Whitepapers     |
      | Success Stories |

  @Test @Regression
  Scenario: Searching for something in the search window redirects to the search page with the appropriate search results
    When he clicks on the search button
    And he types something in the search input field
    And presses enter
    Then he should be redirected to the search page with the something results

  @Test @Regression
  Scenario: Header logo redirects to the home page
    Given John is already on the careers page
    When he clicks on the logo button
    Then he should be redirected to the home page