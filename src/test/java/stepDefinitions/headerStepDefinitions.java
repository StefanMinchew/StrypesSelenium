package stepDefinitions;

import cucumberHelper.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import pages.*;

import java.util.List;

public class headerStepDefinitions {

    TestContext testContext;
    Homepage homePage;
    Header header;
    About about;
    OurBrands ourBrands;
    OurPromises ourPromises;
    OurLeadership ourLeadership;
    DevOps devOps;
    DigitalTransformation digitalTransformation;
    MobilityAndTransformation mobilityAndTransformation;
    RemoteDiagnosticsMonitoringAndPredictiveMaintenance remoteDiagnosticsMonitoringAndPredictiveMaintenance;
    SDaaS sDaaS;
    SoftwareIntegrationAndFLaaS softwareIntegrationAndFLaaS;
    SmartApplications smartApplications;
    ModularityServices modularityServices;
    ITInfrastructure itInfrastructure;
    Consultancy consultancy;
    ApplicationModernization applicationModernization;
    ApplicationManagement applicationManagement;
    ApplicationDevelopment applicationDevelopment;
    Services services;
    Customers customers;
    Nearsurance nearsurance;
    Resources resources;
    Blog blog;
    WhitePapers whitePapers;
    SuccessStories successStories;
    Careers careers;
    AboutICTGroup aboutICTGroup;
    Contact contact;
    SearchResult searchResult;

    public headerStepDefinitions(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomepage();
        header = testContext.getPageObjectManager().getHeader();
        about = testContext.getPageObjectManager().getAbout();
        ourBrands = testContext.getPageObjectManager().getOurBrands();
        ourPromises = testContext.getPageObjectManager().getOurPromises();
        ourLeadership = testContext.getPageObjectManager().getOurLeadership();
        devOps = testContext.getPageObjectManager().getDevOps();
        digitalTransformation = testContext.getPageObjectManager().getDigitalTransformation();
        mobilityAndTransformation = testContext.getPageObjectManager().getMobilityAndTransformation();
        remoteDiagnosticsMonitoringAndPredictiveMaintenance = testContext.getPageObjectManager().getRemoteDiagnosticsMonitoringAndPredictiveMaintenance();
        sDaaS = testContext.getPageObjectManager().getsDaaS();
        softwareIntegrationAndFLaaS = testContext.getPageObjectManager().getSoftwareIntegrationAndFLaaS();
        smartApplications = testContext.getPageObjectManager().getSmartApplications();
        modularityServices = testContext.getPageObjectManager().getModularityServices();
        itInfrastructure = testContext.getPageObjectManager().getItInfrastructure();
        consultancy = testContext.getPageObjectManager().getConsultancy();
        applicationModernization = testContext.getPageObjectManager().getApplicationModernization();
        applicationManagement = testContext.getPageObjectManager().getApplicationManagement();
        applicationDevelopment = testContext.getPageObjectManager().getApplicationDevelopment();
        services = testContext.getPageObjectManager().getServices();
        customers = testContext.getPageObjectManager().getCustomers();
        nearsurance = testContext.getPageObjectManager().getNearsurance();
        resources = testContext.getPageObjectManager().getResources();
        blog = testContext.getPageObjectManager().getBlog();
        whitePapers = testContext.getPageObjectManager().getWhitePapers();
        successStories = testContext.getPageObjectManager().getSuccessStories();
        careers = testContext.getPageObjectManager().getCareers();
        aboutICTGroup = testContext.getPageObjectManager().getAboutICTGroup();
        contact = testContext.getPageObjectManager().getContact();
        searchResult = testContext.getPageObjectManager().getSearchResult();
    }

    @Given("John is on the home page")
    public void john_is_on_the_home_page() {
        homePage.navigateToHomepage();
        String currentUrl = homePage.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getHomePageUrl(), currentUrl);
    }

    @Given("John is already on the careers page")
    public void john_is_already_on_the_careers_page() {
        careers.navigateToCareersPage();
    }

    @When("he clicks on the about button")
    public void he_clicks_on_the_about_button() {
        header.clickOnTheAboutButton();
        header.clickOnTheAboutButton();
    }

    @Given("he has already hovered over the services button")
    public void he_has_already_hovered_over_the_services_button() {
        header.hoverOverTheServicesButton();
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

    @When("he presses enter after he has typed something in the search input field")
    public void he_presses_enter_after_he_has_typed_something_in_the_search_input_field() {
        header.enterSearchInput(testContext.getPageObjectManager().getSearchInput());
    }

    @When("he clicks on the logo button")
    public void he_clicks_on_the_logo_button() {
        header.clickOnTheLogoButton();
    }

    @Then("he sees the navigation links")
    public void he_sees_the_navigation_links(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists();
        for (List<String> links : data) {
            String linkString = links.get(0);
            Assertions.assertTrue(header.isNavigationLinksDisplayed(linkString));
        }
    }

    @Then("he should be redirected to the about page")
    public void he_should_be_redirected_to_the_about_page() {
        String currentUrl = about.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getAboutPageUrl(), currentUrl.toLowerCase());
    }

    @Then("he should see the about submenu content displayed")
    public void he_should_see_the_about_submenu_content_displayed(DataTable dataTable) {
        List<List<String>> contentList = dataTable.asLists();
        for (List<String> content : contentList) {
            String contentString = content.get(0);
            Assertions.assertTrue(header.isAboutSubmenuContentDisplayed(contentString));
        }
    }

    @Then("he is redirected to the our brands page")
    public void he_is_redirected_to_the_our_brands_page() {
        String currentUrl = ourBrands.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getOurBrandsPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }


    @Then("he is redirected to the our promises page")
    public void he_is_redirected_to_the_our_promises_page() {
        String currentUrl = ourPromises.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getOurPromisesPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }


    @Then("he is redirected to the our leadership page")
    public void he_is_redirected_to_the_our_leadership_page() {
        String currentUrl = ourLeadership.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getOurLeadershipPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should see the services submenu content displayed")
    public void he_should_see_the_services_submenu_content_displayed(DataTable dataTable) {
        List<List<String>> contentList = dataTable.asLists();
        for (List<String> content : contentList) {
            String contentString = content.get(0);
            Assertions.assertTrue(header.isServicesContentDisplayed(contentString));
        }
    }

    @Then("he is redirected to the Devops page")
    public void he_is_redirected_to_the_devops_page() {
        String currentUrl = devOps.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getDevOpsPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he is redirected to the Digital transformation page")
    public void he_is_redirected_to_the_digital_transformation_page() {
        String currentUrl = digitalTransformation.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getDigitalTransformationPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he is redirected to the Mobility and Transportation page")
    public void he_is_redirected_to_the_mobility_and_transportation_page() {
        String currentUrl = mobilityAndTransformation.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getMobilityAndTransporationPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he is redirected to the Remote Diagnostics, Monitoring and Predictive Maintenance page")
    public void he_is_redirected_to_the_remote_diagnostics_monitoring_and_predictive_maintenance_page() {
        String currentUrl = remoteDiagnosticsMonitoringAndPredictiveMaintenance.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getRemoteDiagnosticsMonitoringAndPredictiveMaintenancePageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he is redirected to the SDaaS page")
    public void he_is_redirected_to_the_s_daa_s_page() {
        String currentUrl = sDaaS.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getSdaasPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he is redirected to the Software Integration and FLaaS page")
    public void he_is_redirected_to_the_software_integration_and_f_laa_s_page() {
        String currentUrl = softwareIntegrationAndFLaaS.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getSoftwareIntegrationAndFlaasPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he is redirected to the Smart applications page")
    public void he_is_redirected_to_the_smart_applications_page() {
        String currentUrl = smartApplications.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getSmartApplicationsPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he is redirected to the Modularity Services page")
    public void he_is_redirected_to_the_modularity_services_page() {
        String currentUrl = modularityServices.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getModularityServicesPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should see the IT Infrastructure submenu")
    public void he_should_see_the_it_infrastructure_submenu() {
        Assertions.assertTrue(header.itInfrastructureIsDisplayed());
    }

    @Then("he is redirected to the IT Infrastructure page")
    public void he_is_redirected_to_the_it_infrastructure_page() {
        String currentUrl = itInfrastructure.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getItInfrastructurePageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should see the Consultancy submenu")
    public void he_should_see_the_consultancy_submenu() {
        Assertions.assertTrue(header.consultancyIsDisplayed());
    }

    @Then("he is redirected to the Consultancy page")
    public void he_is_redirected_to_the_consultancy_page() {
        String currentUrl = consultancy.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getConsultancyPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should see the smart application submenu content displayed")
    public void he_should_see_the_smart_application_submenu_content_displayed(DataTable dataTable) {
        List<List<String>> contentList = dataTable.asLists();
        for (List<String> content : contentList) {
            String contentString = content.get(0);
            Assertions.assertTrue(header.isSmartApplicationSubmenuContentDisplayed(contentString));
        }
    }

    @Then("he is redirected to the Application modernization page")
    public void he_is_redirected_to_the_application_modernization_page() {
        String currentUrl = applicationModernization.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getApplicationModernizationPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he is redirected to the Application management page")
    public void he_is_redirected_to_the_application_management_page() {
        String currentUrl = applicationManagement.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getApplicationManagementPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he is redirected to the Application development page")
    public void he_is_redirected_to_the_application_development_page() {
        String currentUrl = applicationDevelopment.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getApplicationDevelopmentPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should be redirected to the services page")
    public void he_should_be_redirected_to_the_services_page() {
        String currentUrl = services.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getServicesPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should be redirected to the customers page")
    public void he_should_be_redirected_to_the_customers_page() {
        String currentUrl = customers.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getCustomersPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should be redirected to the nearsurance page")
    public void he_should_be_redirected_to_the_nearsurance_page() {
        String currentUrl = nearsurance.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getNearsurancePageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should be redirected to the resources page")
    public void he_should_be_redirected_to_the_resources_page() {
        String currentUrl = resources.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getResourcesPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should see the resources submenu content displayed")
    public void he_should_see_the_resources_submenu_content_displayed(DataTable dataTable) {
        List<List<String>> contentList = dataTable.asLists();
        for (List<String> content : contentList) {
            String contentString = content.get(0);
            Assertions.assertTrue(header.isResourcesSubmenuContentDisplayed(contentString));
        }
    }

    @Then("he is redirected to the Blog page")
    public void he_is_redirected_to_the_blog_page() {
        String currentUrl = blog.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getBlogPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he is redirected to the Whitepapers page")
    public void he_is_redirected_to_the_whitepapers_page() {
        String currentUrl = whitePapers.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getWhitepapersPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he is redirected to the Success Stories page")
    public void he_is_redirected_to_the_success_stories_page() {
        String currentUrl = successStories.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getSuccessStoriesPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should be redirected to the careers page")
    public void he_should_be_redirected_to_the_careers_page() {
        String currentUrl = careers.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getCareersPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should be redirected to the about ICT Group page")
    public void he_should_be_redirected_to_the_about_ict_group_page() {
        String currentUrl = aboutICTGroup.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getAboutICTGroupPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should be redirected to the contact page")
    public void he_should_be_redirected_to_the_contact_page() {
        String currentUrl = contact.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getContactPageUrl().toLowerCase(), currentUrl.toLowerCase());
    }

    @Then("he should be redirected to the search page with the something results")
    public void he_should_be_redirected_to_the_search_page_with_the_results() {
        String currentUrl = searchResult.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getSearchResultPageUrl().toLowerCase(), currentUrl.toLowerCase());
        Assertions.assertTrue(searchResult.searchMessageText().contains(testContext.getPageObjectManager().getSearchInput()));
    }

    @Then("he should be redirected to the home page")
    public void he_should_be_redirected_to_the_home_page() {
        String currentUrl = homePage.getCurrentUrl();
        Assertions.assertEquals(testContext.getPageObjectManager().getHomePageUrl(), currentUrl);
    }

}
