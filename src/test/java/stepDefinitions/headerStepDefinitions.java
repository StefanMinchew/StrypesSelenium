package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.Base;

public class headerStepDefinitions extends Base {

    @Before
    public void setup() {
        super.setup();
    }

    @After
    public void tearDown() {
        super.tearDown();
    }

    @Given("John is on the home page")
    public void john_is_on_the_home_page() {
        driver.get(homePageUrl);
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(homePageUrl, currentUrl);
        System.out.println(currentUrl);
        System.out.println(homePageUrl);
    }

    @When("he clicks on the about button")
    public void he_clicks_on_the_about_button() {
        header.clickOnTheAboutButton();
        header.clickOnTheAboutButton();
    }

    @When("he hovers over the about button")
    public void he_hovers_over_the_about_button() {
        header.hoverOverTheAboutButton();
    }

    @When("he selects the our brands option")
    public void he_selects_the_our_brands_option() {
        header.clickOnOurBrandsOption();
    }
    @When("he selects the our promises option")
    public void he_selects_the_our_promises_option() {
        header.clickOnOurPromisesOption();
    }
    @When("he selects the our leadership option")
    public void he_selects_the_our_leadership_option() {
        header.clickOnOurLeadershipOption();
    }
    @Then("he sees logo")
    public void he_sees_logo() {
        Assertions.assertTrue(header.logoIsDisplayed());
    }

    @Then("he sees about")
    public void he_sees_about() {
        Assertions.assertTrue(header.aboutIsDisplayed());
    }

    @Then("he sees services")
    public void he_sees_services() {
        Assertions.assertTrue(header.servicesIsDisplayed());
    }

    @Then("he sees customers")
    public void he_sees_customers() {
        Assertions.assertTrue(header.customersIsDisplayed());
    }

    @Then("he sees nearsurance")
    public void he_sees_nearsurance() {
        Assertions.assertTrue(header.nearsurranceIsDisplayed());
    }

    @Then("he sees resources")
    public void he_sees_resources() {
        Assertions.assertTrue(header.resourcesIsDisplayed());
    }

    @Then("he sees careers")
    public void he_sees_careers() {
        Assertions.assertTrue(header.careerIsDisplayed());
    }

    @Then("he sees ictgroup")
    public void he_sees_ictgroup() {
        Assertions.assertTrue(header.ictGroupIsDisplayed());
    }

    @Then("he sees contact")
    public void he_sees_contact() {
        Assertions.assertTrue(header.contactIsDisplayed());
    }

    @Then("he sees search")
    public void he_sees_search() {
        Assertions.assertTrue(header.searchIsDisplayed());
    }


    @Then("he should be redirected to the about page")
    public void he_should_be_redirected_to_the_about_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(aboutPageUrl.toLowerCase(), currentUrl.toLowerCase());
    }


    @Then("he should see our brands displayed")
    public void he_should_see_our_brands_displayed() {
        Assertions.assertTrue(header.ourBrandsIsDisplayed());

    }

    @Then("he should see our promises displayed")
    public void he_should_see_our_promises_displayed() {
        Assertions.assertTrue(header.ourPromisesIsDisplayed());
    }

    @Then("he should see our leadership displayed")
    public void he_should_see_our_leadership_displayed() {
        Assertions.assertTrue(header.ourLeadershipIsDisplayed());
    }


    @Then("he is redirected to the our brands page")
    public void he_is_redirected_to_the_our_brands_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(ourBrandsPageUrl.toLowerCase(), currentUrl.toLowerCase());
    }


    @Then("he is redirected to the our promises page")
    public void he_is_redirected_to_the_our_promises_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(ourPromisesPageUrl.toLowerCase(), currentUrl.toLowerCase());
    }


    @Then("he is redirected to the our leadership page")
    public void he_is_redirected_to_the_our_leadership_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(ourLeadershipPageUrl.toLowerCase(), currentUrl.toLowerCase());
    }


}
