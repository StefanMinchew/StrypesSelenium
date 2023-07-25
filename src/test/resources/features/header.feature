@Header
Feature: Header tests

  Background:
    Given John is on the home page

  @Test @Regression @UI
  Scenario: Navigation is displayed correctly
    Then he sees the navigation links
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

  @Test @Regression @UI
  Scenario: About submenu displays its content
    When he hovers over the about button
    Then he should see the about submenu content displayed
      | our brands     |
      | our promises   |
      | our leadership |

  @Test @Regression @Functionality
  Scenario Outline: About submenu <options> redirect to the <options> page
    When he hovers over the about button
    And he selects the <options> option
    Then he is redirected to the <options> page
    Examples:
      | options        |
      | our brands     |
      | our promises   |
      | our leadership |

  @Test @Regression @Functionality @Button
  Scenario Outline: <button> button in the navigation bar leads to the <button> page
    When he clicks on the <button> button
    Then he should be redirected to the <button> page
    Examples:
      | button          |
      | about           |
      | services        |
      | customers       |
      | nearsurance     |
      | resources       |
      | careers         |
      | about ICT Group |
      | contact         |

  @Test @Regression @UI
  Scenario: Services submenu displays content
    When he hovers over the services button
    Then he should see the services submenu content displayed
      | Devops                                                    |
      | Digital transformation                                    |
      | Mobility and Transportation                               |
      | Remote Diagnostics, Monitoring and Predictive Maintenance |
      | SDaaS                                                     |
      | Software Integration and FLaaS                            |
      | Smart applications                                        |
      | Modularity Services                                       |

  @Test @Regression @Functionality
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

  @Test @Regression @UI
  Scenario: DevOps IT Infrastructure submenu is displayed
    When he hovers over the services button
    And he hovers over the DevOps button
    Then he should see the IT Infrastructure submenu

  @Test @Regression @Functionality
  Scenario:  DevOps IT Infrastructure submenu redirects to its page
    When he hovers over the services button
    And he hovers over the DevOps button
    And he selects the IT Infrastructure option
    Then he is redirected to the IT Infrastructure page

  @Test @Regression @UI
  Scenario: Digital transformation Consultancy submenu is displayed
    When he hovers over the services button
    And he hovers over the Digital Transformation button
    Then he should see the Consultancy submenu

  @Test @Regression @Functionality
  Scenario:  Digital transformation Consultancy submenu redirects to its page
    When he hovers over the services button
    And he hovers over the Digital Transformation button
    And he selects the Consultancy option
    Then he is redirected to the Consultancy page

  @Test @Regression @UI
  Scenario: Smart applications submenu displays its content
    And he has already hovered over the services button
    When he hovers over the Smart application button
    Then he should see the smart application submenu content displayed
      | Application modernization |
      | Application management    |
      | Application development   |

  @Test @Regression @Functionality
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

  @Test @Regression @UI
  Scenario: Resources submenu displays its content
    When he hovers over the resources button
    Then he should see the resources submenu content displayed
      | Blog            |
      | Whitepapers     |
      | Success Stories |

  @Test @Regression @Functionality
  Scenario Outline: Resources submenu <options> redirect to the <options> page
    When he hovers over the resources button
    And he selects the <options> option
    Then he is redirected to the <options> page
    Examples:
      | options         |
      | Blog            |
      | Whitepapers     |
      | Success Stories |

  @Test @Regression @Functionality
  Scenario: Searching for something in the search window redirects to the search page with the appropriate search results
    When he clicks on the search button
    And he presses enter after he has typed something in the search input field
    Then he should be redirected to the search page with the something results

  @Test @Regression @Functionality @Button
  Scenario: Header logo redirects to the home page
    Given John is already on the careers page
    When he clicks on the logo button
    Then he should be redirected to the home page