package stepDefinitions;

import cucumberHelper.TestContext;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.Homepage;

public class homepageStepDefinitions {

    TestContext testContext;
    Homepage homePage;

    public homepageStepDefinitions(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomepage();
    }

    @Given("John is already on the page")
    public void john_is_already_on_the_page() {
        homePage.navigateToHomepage();
    }

    @Then("he can see the top section")
    public void he_can_see_the_top_section() {
        Assertions.assertTrue(homePage.elementorTopSectionIsDisplayed());
    }

    @Then("he can see the who are we section")
    public void he_can_see_the_who_are_we_section() {
        Assertions.assertTrue(homePage.whoAreWeSectionLocatorIsDisplayed());
    }

    @Then("he can see the our services section")
    public void he_can_see_the_our_services_section() {
        Assertions.assertTrue(homePage.ourServicesSectionLocatorIsDisplayed());
    }

    @Then("he can see the software solution section")
    public void he_can_see_the_software_solution_section() {
        Assertions.assertTrue(homePage.softwareSolutionsSectionLocatorIsDisplayed());
    }

    @Then("he can see the nearsurance section")
    public void he_can_see_the_nearsurance_section() {
        Assertions.assertTrue(homePage.nearsuranceSectionLocatorIsDisplayed());
    }

    @Then("he can see the statistics section")
    public void he_can_see_the_statistics_section() {
        Assertions.assertTrue(homePage.statisticsSectionLocatorIsDisplayed());
    }

    @Then("he can see the partners section")
    public void he_can_see_the_partners_section() {
        Assertions.assertTrue(homePage.partnersSectionLocatorIsDisplayed());
    }

    @Then("he can see the whats new section")
    public void he_can_see_the_whats_new_section() {
        Assertions.assertTrue(homePage.whatIsNewSectionLocatorIsDisplayed());
    }

    @Then("he can see the learn more section")
    public void he_can_see_the_learn_more_section() {
        Assertions.assertTrue(homePage.learnMoreSectionLocatorIsDisplayed());
    }

    @Then("he can see the certifications section")
    public void he_can_see_the_certifications_section() {
        Assertions.assertTrue(homePage.certificationsSectionIsDisplayed());
    }

}
