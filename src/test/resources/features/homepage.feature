@Homepage
Feature: Homepage tests

  @Test @Regression
  Scenario Outline: User can see <elementor> section
    Given John is already on the page
    Then he can see the <elementor> section
    Examples:
      | elementor         |
      | top               |
      | who are we        |
      | our services      |
      | software solution |
      | nearsurance       |
      | statistics        |
      | partners          |
      | whats new         |
      | learn more        |
      | certifications    |