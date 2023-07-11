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

    @When("he hovers over the services button")
    public void he_hovers_over_the_services_button() {
        header.hoverOverTheServicesButton();
    }

    @Then("he sees logo")
    public void he_sees_logo() {
        Assertions.assertTrue(header.logoIsDisplayed());
    }

    @When("he selects the Devops option")
    public void he_selects_the_devops_option() {
        header.clickOnTheDevOpsOption();
        header.clickOnTheDevOpsOption();
    }

    @When("he selects the Digital transformation option")
    public void he_selects_the_digital_transformation_option() {
        header.clickOnTheDigitalTransformationOption();
        header.clickOnTheDigitalTransformationOption();
    }

    @When("he selects the Mobility and Transportation option")
    public void he_selects_the_mobility_and_transportation_option() {
        header.clickOnTheMobilityAndTransportationOption();
    }

    @When("he selects the Remote Diagnostics, Monitoring and Predictive Maintenance option")
    public void he_selects_the_remote_diagnostics_monitoring_and_predictive_maintenance_option() {
        header.clickOnTheRemoteDiagnosticsMonitoringAndPredictiveMaintenanceOption();
    }

    @When("he selects the SDaaS option")
    public void he_selects_the_s_daa_s_option() {
        header.clickOnTheSDaaSOption();
    }

    @When("he selects the Software Integration and FLaaS option")
    public void he_selects_the_software_integration_and_f_laa_s_option() {
        header.clickOnTheSoftwareIntegrationAndFLaaSOption();
    }

    @When("he selects the Smart applications option")
    public void he_selects_the_smart_applications_option() {
        header.clickOnTheSmartApplicationsOption();
        header.clickOnTheSmartApplicationsOption();
    }

    @When("he selects the Modularity Services option")
    public void he_selects_the_modularity_services_option() {
        header.clickOnTheModularityServices();
    }

    @When("he hovers over the DevOps button")
    public void he_hovers_over_the_dev_ops_button() {
        header.hoverOverTheDevOpsOption();
    }

    @When("he selects the IT Infrastructure option")
    public void he_selects_the_it_infrastructure_option() {
        header.clickOnTheITInfrastructureOption();
    }

    @When("he hovers over the Digital Transformation button")
    public void he_hovers_over_the_digital_transformation_button() {
        header.hoverOverTheDigitalTransformationOption();
    }

    @When("he selects the Consultancy option")
    public void he_selects_the_consultancy_option() {
        header.clickOnTheConsultancyOption();
    }

    @When("he hovers over the Smart application button")
    public void he_hovers_over_the_smart_application_button() {
        header.hoverOverTheSmartApplicationsOption();
    }

    @When("he selects the Application modernization option")
    public void he_selects_the_application_modernization_option() {
        header.clickOnTheApplicationModernizationOption();
    }

    @When("he selects the Application management option")
    public void he_selects_the_application_management_option() {
        header.clickOnTheApplicationManagementOption();
    }

    @When("he selects the Application development option")
    public void he_selects_the_application_development_option() {
        header.clickOnTheApplicationDevelopmentOption();
    }

    @When("he clicks on the services button")
    public void he_clicks_on_the_services_button() {
        header.clickOnTheServicesButton();
        header.clickOnTheServicesButton();
    }

    @When("he clicks on the customers button")
    public void he_clicks_on_the_customers_button() {
        header.clickOnTheCustomersButton();
    }

    @When("he clicks on the nearsurance button")
    public void he_clicks_on_the_nearsurance_button() {
        header.clickOnTheNearsuranceButton();
    }

    @When("he clicks on the resources button")
    public void he_clicks_on_the_resources_button() {
        header.clickOnTheResourcesButton();
        header.clickOnTheResourcesButton();
    }


    @When("he hovers over the resources button")
    public void he_hovers_over_the_resources_button() {
        header.hoversOverTheResourcesButton();
    }

    @When("he selects the Blog option")
    public void he_selects_the_blog_option() {
        header.clickOnTheBlogOption();
    }

    @When("he selects the Whitepapers option")
    public void he_selects_the_whitepapers_option() {
        header.clickOnTheWhitepaperOption();
    }

    @When("he selects the Success Stories option")
    public void he_selects_the_success_stories_option() {
        header.clickOnTheSuccessStoriesOption();
    }

    @When("he clicks on the careers button")
    public void he_clicks_on_the_careers_button() {
        header.clickOnTheCareersButton();
    }

    @When("he clicks on the about ICT Group button")
    public void he_clicks_on_the_about_ict_group_button() {
        header.clickOnTheAboutICTGroupButton();
    }

    @When("he clicks on the contact button")
    public void he_clicks_on_the_contact_button() {
        header.clickOnTheContactButton();
    }

    @When("he clicks on the search button")
    public void he_clicks_on_the_search_button() {
        header.clickOnTheSearchButton();
    }

    @When("he types something in the search input field")
    public void he_types_in_the_search_input_field() {
        header.enterSearchInput(searchInput);
    }

    @When("presses enter")
    public void presses_enter() {
        header.searchInputPressEnter();
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
        Assertions.assertTrue(about.getBackGroundTextLocator());
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
        Assertions.assertTrue(ourBrands.getBackGroundTextLocator());
    }


    @Then("he is redirected to the our promises page")
    public void he_is_redirected_to_the_our_promises_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(ourPromisesPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(ourPromises.getBackGroundTextLocator());
    }


    @Then("he is redirected to the our leadership page")
    public void he_is_redirected_to_the_our_leadership_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(ourLeadershipPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(ourLeadership.getBackGroundTextLocator());
    }


    @Then("he should see Devops displayed")
    public void he_should_see_devops_displayed() {
        Assertions.assertTrue(header.devOpsIsDisplayed());
    }

    @Then("he should see Digital transformation displayed")
    public void he_should_see_digital_transformation_displayed() {
        Assertions.assertTrue(header.digitalTransformationIsDisplayed());
    }

    @Then("he should see Mobility and Transportation displayed")
    public void he_should_see_mobility_and_transportation_displayed() {
        Assertions.assertTrue(header.mobilityAndTransportationIsDisplayed());
    }

    @Then("he should see Remote Diagnostics, Monitoring and Predictive Maintenance displayed")
    public void he_should_see_remote_diagnostics_monitoring_and_predictive_maintenance_displayed() {
        Assertions.assertTrue(header.remoteDiagnosticsMonitoringAndPredictiveMaintenanceIsDisplayed());
    }

    @Then("he should see SDaaS displayed")
    public void he_should_see_sdaas_displayed() {
        Assertions.assertTrue(header.SDaaSIsDisplayed());
    }

    @Then("he should see Software Integration and FLaaS displayed")
    public void he_should_see_software_integration_and_flaas_displayed() {
        Assertions.assertTrue(header.softwareIntegrationAndFLaaSIsDisplayed());
    }

    @Then("he should see Smart applications displayed")
    public void he_should_see_smart_applications_displayed() {
        Assertions.assertTrue(header.smartApplicationsIsDisplayed());
    }

    @Then("he should see Modularity Services displayed")
    public void he_should_see_modularity_services_displayed() {
        Assertions.assertTrue(header.modularityServicesIsDisplayed());
    }


    @Then("he is redirected to the Devops page")
    public void he_is_redirected_to_the_devops_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(devOpsPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(devOps.getBackGroundTextLocator());
    }


    @Then("he is redirected to the Digital transformation page")
    public void he_is_redirected_to_the_digital_transformation_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(digitalTransformationPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(digitalTransformation.getBackGroundTextLocator());
    }


    @Then("he is redirected to the Mobility and Transportation page")
    public void he_is_redirected_to_the_mobility_and_transportation_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(mobilityAndTransporationPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(mobilityAndTransformation.getBackGroundTextLocator());
    }


    @Then("he is redirected to the Remote Diagnostics, Monitoring and Predictive Maintenance page")
    public void he_is_redirected_to_the_remote_diagnostics_monitoring_and_predictive_maintenance_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(remoteDiagnosticsMonitoringAndPredictiveMaintenancePageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(remoteDiagnosticsMonitoringAndPredictiveMaintenance.getBackGroundTextLocator());
    }


    @Then("he is redirected to the SDaaS page")
    public void he_is_redirected_to_the_s_daa_s_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(sdaasPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(sDaaS.getBackGroundTextLocator());
    }


    @Then("he is redirected to the Software Integration and FLaaS page")
    public void he_is_redirected_to_the_software_integration_and_f_laa_s_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(softwareIntegrationAndFlaasPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(softwareIntegrationAndFLaaS.getBackGroundTextLocator());
    }


    @Then("he is redirected to the Smart applications page")
    public void he_is_redirected_to_the_smart_applications_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(smartApplicationsPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(smartApplications.getBackGroundTextLocator());
    }


    @Then("he is redirected to the Modularity Services page")
    public void he_is_redirected_to_the_modularity_services_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(modularityServicesPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(modularityServices.getBackGroundTextLocator());
    }


    @Then("he should see the IT Infrastructure submenu")
    public void he_should_see_the_it_infrastructure_submenu() {
        Assertions.assertTrue(header.itInfrastructureIsDisplayed());
    }

    @Then("he is redirected to the IT Infrastructure page")
    public void he_is_redirected_to_the_it_infrastructure_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(itInfrastructurePageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(itInfrastructure.getBackGroundTextLocator());
    }

    @Then("he should see the Consultancy submenu")
    public void he_should_see_the_consultancy_submenu() {
        Assertions.assertTrue(header.consultancyIsDisplayed());
    }

    @Then("he is redirected to the Consultancy page")
    public void he_is_redirected_to_the_consultancy_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(consultancyPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(consultancy.getBackGroundTextLocator());
    }

    @Then("he should see Application modernization displayed")
    public void he_should_see_application_modernization_displayed() {
        Assertions.assertTrue(header.applicationModernizationIsDisplayed());
    }

    @Then("he should see Application management displayed")
    public void he_should_see_application_management_displayed() {
        Assertions.assertTrue(header.applicationManagementIsDisplayed());
    }

    @Then("he should see Application development displayed")
    public void he_should_see_application_development_displayed() {
        Assertions.assertTrue(header.applicationDevelopmentIsDisplayed());
    }

    @Then("he is redirected to the Application modernization page")
    public void he_is_redirected_to_the_application_modernization_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(applicationModernizationPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(applicationModernization.getBackGroundTextLocator());
    }


    @Then("he is redirected to the Application management page")
    public void he_is_redirected_to_the_application_management_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(applicationManagementPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(applicationManagement.getBackGroundTextLocator());
    }


    @Then("he is redirected to the Application development page")
    public void he_is_redirected_to_the_application_development_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(applicationDevelopmentPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(applicationDevelopment.getBackGroundTextLocator());
    }

    @Then("he should be redirected to the services page")
    public void he_should_be_redirected_to_the_services_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(servicesPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(services.getBackGroundTextLocator());
    }

    @Then("he should be redirected to the customers page")
    public void he_should_be_redirected_to_the_customers_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(customersPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(customers.getBackGroundTextLocator());
    }

    @Then("he should be redirected to the nearsurance page")
    public void he_should_be_redirected_to_the_nearsurance_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(nearsurancePageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(nearsurance.getBackGroundTextLocator());
    }

    @Then("he should be redirected to the resources page")
    public void he_should_be_redirected_to_the_resources_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(resourcesPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(resources.getBackGroundTextLocator());
    }

    @Then("he should see Blog displayed")
    public void he_should_see_blog_displayed() {
        Assertions.assertTrue(header.blogIsDisplayed());
    }

    @Then("he should see Whitepapers displayed")
    public void he_should_see_whitepapers_displayed() {
        Assertions.assertTrue(header.whitepapersIsDisplayed());
    }

    @Then("he should see Success Stories displayed")
    public void he_should_see_success_stories_displayed() {
        Assertions.assertTrue(header.successStoriesIsDisplayed());
    }

    @Then("he is redirected to the Blog page")
    public void he_is_redirected_to_the_blog_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(blogPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(blog.getBackGroundTextLocator());
    }

    @Then("he is redirected to the Whitepapers page")
    public void he_is_redirected_to_the_whitepapers_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(whitepapersPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(whitePapers.getBackGroundTextLocator());
    }

    @Then("he is redirected to the Success Stories page")
    public void he_is_redirected_to_the_success_stories_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(successStoriesPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(successStories.getBackGroundTextLocator());
    }

    @Then("he should be redirected to the careers page")
    public void he_should_be_redirected_to_the_careers_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(careersPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(careers.getBackGroundTextLocator());
    }

    @Then("he should be redirected to the about ICT Group page")
    public void he_should_be_redirected_to_the_about_ict_group_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(aboutICTGroupPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(aboutICTGroup.getBackGroundTextLocator());
    }

    @Then("he should be redirected to the contact page")
    public void he_should_be_redirected_to_the_contact_page() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(contactPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(contact.getBackGroundTextLocator());
    }

    @Then("he should be redirected to the search page with the something results")
    public void he_should_be_redirected_to_the_search_page_with_the_results() {
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertEquals(searchResultPageUrl.toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(header.searchMessageText().contains(searchInput));
    }

}
