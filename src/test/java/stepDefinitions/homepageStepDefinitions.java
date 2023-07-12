package stepDefinitions;

import cucumberHelper.TestContext;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.*;

public class homepageStepDefinitions {

    TestContext testContext;
    Homepage homePage;
    Services services;
    About about;
    Nearsurance nearsurance;
    Blog blog;
    Contact contact;

    public homepageStepDefinitions(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomepage();
        services = testContext.getPageObjectManager().getServices();
        about = testContext.getPageObjectManager().getAbout();
        nearsurance = testContext.getPageObjectManager().getNearsurance();
        blog = testContext.getPageObjectManager().getBlog();
        contact = testContext.getPageObjectManager().getContact();
    }

    @Given("John is already on the page")
    public void john_is_already_on_the_page() {
        homePage.navigateToHomepage();
    }


    @When("he clicks on the top section learn more button")
    public void he_clicks_on_the_top_section_learn_more_button() {
        homePage.clickOnTheTopSectionLearnMoreButton();
    }

    @When("he clicks on the who are we learn more button")
    public void he_clicks_on_the_who_are_we_learn_more_button() {
        homePage.clickOnTheWhoAreWeLearnMoreButton();
    }

    @When("he clicks on the our services learn more button")
    public void he_clicks_on_the_our_services_learn_more_button() {
        homePage.clickOnTheOurServicesLearnMoreButton();
    }

    @When("he clicks on the nearsurance learn more button")
    public void he_clicks_on_the_nearsurance_learn_more_button() {
        homePage.clickOnTheNearsuranceLearnMoreButton();
    }

    @When("he clicks on the what is new learn more button")
    public void he_clicks_on_the_what_is_new_learn_more_button() {
        homePage.clickOnTheWhatIsNewLearnMoreButton();
    }

    @When("he clicks on the get in touch button")
    public void he_clicks_on_the_get_in_touch_button() {
        homePage.clickOnTheGetInTouchButton();
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

    @Then("he is redirected to the services page")
    public void he_is_redirected_to_the_services_page() {
        String getUrl = services.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getServicesPageUrl(), getUrl);
    }

    @Then("he is redirected to the about page")
    public void he_is_redirected_to_the_about_page() {
        String getUrl = about.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getAboutPageUrl(), getUrl);
    }

    @Then("he is redirected to the nearsurance page")
    public void he_is_redirected_to_the_nearsurance_page() {
        String getUrl = nearsurance.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getNearsurancePageUrl(), getUrl);
    }

    @Then("he is redirected to the blog page")
    public void he_is_redirected_to_the_blog_page() {
        String getUrl = blog.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getBlogPageUrl(), getUrl);
    }

    @Then("he is redirected to the contact page")
    public void he_is_redirected_to_the_contact_page() {
        String getUrl = contact.getCurrentUrl();
        Assertions.assertTrue(getUrl.contains(testContext.getPageObjectManager().getContactPageUrl()));
    }

}
