package stepDefinitions;

import cucumberHelper.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.*;

import java.util.List;

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

    @Then("he can see the homepage displayed")
    public void he_can_see_the_homepage_displayed(DataTable dataTable) {
        List<List<String>> contentList = dataTable.asLists();
        for (List<String> content : contentList) {
            String contentString = content.get(0);
            Assertions.assertTrue(homePage.isHomePageDisplayed(contentString));
        }
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
