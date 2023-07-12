package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

    WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[class] #header_pop:nth-of-type(1) [class='attachment-large size-large wp-image-18 astra-logo-svg']")
    WebElement logoButtonLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-1250'] [aria-haspopup]")
    WebElement aboutButtonLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-45'] > [aria-haspopup]")
    WebElement servicesButtonLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-52'] .elementor-item")
    WebElement customersButtonLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-749'] .elementor-item")
    WebElement nearsuranceButtonLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-2634'] [aria-haspopup]")
    WebElement resourcesButtonLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='careers-menu menu-item menu-item-type-custom menu-item-object-custom menu-item-79'] .elementor-item")
    WebElement careersButtonLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-60'] .elementor-item")
    WebElement ictGroupButtonLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-62'] .elementor-item")
    WebElement contactButtonLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) [data-id='41303580'] .fa-search")
    WebElement searchButtonLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-66'] .elementor-sub-item")
    WebElement ourBrandsFromAboutSubmenuLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-807'] .elementor-sub-item")
    WebElement ourPromisesFromAboutSubmenuLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1731'] .elementor-sub-item")
    WebElement ourLeadershipFromAboutSubmenuLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-2248'] [aria-haspopup]")
    WebElement devOpsFromServicesSubmenuLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-797'] [aria-haspopup]")
    WebElement digitalTransformationFromServicesSubmenuLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-799'] .elementor-sub-item")
    WebElement mobilityAndTransportationFromServicesSubmenuLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1863'] .elementor-sub-item")
    WebElement remoteDiagnosticsMonitoringAndPredictiveMaintenanceFromServicesSubmenuLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-2481'] .elementor-sub-item")
    WebElement SDaaSFromServicesSubmenuLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-2487'] .elementor-sub-item")
    WebElement softwareIntegrationAndFLaaSFromServicesSubmenuLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-2508'] [aria-haspopup]")
    WebElement smartApplicationsFromServicesSubmenuLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1702'] .elementor-sub-item")
    WebElement modularityServicesFromServicesSubmenuLocator;

    @FindBy(xpath = "/html//section[@id='header_pop']/div/div/div/section[2]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']/li[3]/ul[@role='group']/li[1]/ul[@role='group']//a[@href='https://strypes.eu/devops/it-infrastructure-management/']")
    WebElement itInfrastructureFromDevOpsServicesSubmenuLocator;

    @FindBy(xpath = "/html//section[@id='header_pop']/div/div/div/section[2]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']/li[3]/ul[@role='group']/li[2]/ul[@role='group']//a[@href='https://strypes.eu/consultancy/']")
    WebElement consultancyFromDigitalTransformationServicesSubmenuLocator;

    @FindBy(xpath = "/html//section[@id='header_pop']/div/div/div/section[2]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']/li[3]/ul[@role='group']/li[7]/ul[@role='group']//a[@href='https://strypes.eu/smart-applications-the-intelligent-approach/application-modernization-staying-on-trend-ahead-of-time/']")
    WebElement applicationModernizationFromSmartApplicationsServicesSubmenuLocator;

    @FindBy(xpath = "/html//section[@id='header_pop']/div/div/div/section[2]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']/li[3]/ul[@role='group']/li[7]/ul[@role='group']//a[@href='https://strypes.eu/smart-applications-the-intelligent-approach/application-management-maintaining-advantage-always/']")
    WebElement applicationManagementFromSmartApplicationsServicesSubmenuLocator;

    @FindBy(xpath = "/html//section[@id='header_pop']/div/div/div/section[2]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']/li[3]/ul[@role='group']/li[7]/ul[@role='group']//a[@href='https://strypes.eu/smart-applications-the-intelligent-approach/application-development-our-core-competency/']")
    WebElement applicationDevelopmentFromSmartApplicationsServicesSubmenuLocator;

    @FindBy(xpath = "/html//section[@id='header_pop']/div/div/div/section[2]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']/li[6]/ul[@role='group']//a[@href='https://strypes.eu/blog/']")
    WebElement blogFromResourcesSubmenuLocator;
    @FindBy(xpath = "/html//section[@id='header_pop']/div/div/div/section[2]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']/li[6]/ul[@role='group']//a[@href='https://strypes.eu/whitepapers/']")
    WebElement whitepapersFromResourcesSubmenuLocator;
    @FindBy(xpath = "/html//section[@id='header_pop']/div/div/div/section[2]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']/li[6]/ul[@role='group']//a[@href='https://strypes.eu/success-stories/']")
    WebElement successStoriesFromResourcesSubmenuLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) [data-id='41303580'] [type]")
    WebElement searchInputFieldLocator;

    @FindBy(css = ".results-for .elementor-heading-title")
    WebElement searchResultsMessageLocator;

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean logoIsDisplayed() {
        return logoButtonLocator.isDisplayed();
    }

    public boolean aboutIsDisplayed() {
        return aboutButtonLocator.isDisplayed();
    }

    public boolean servicesIsDisplayed() {
        return servicesButtonLocator.isDisplayed();
    }

    public boolean customersIsDisplayed() {
        return customersButtonLocator.isDisplayed();
    }

    public boolean nearsurranceIsDisplayed() {
        return nearsuranceButtonLocator.isDisplayed();
    }

    public boolean resourcesIsDisplayed() {
        return resourcesButtonLocator.isDisplayed();
    }

    public boolean careerIsDisplayed() {
        return careersButtonLocator.isDisplayed();
    }

    public boolean ictGroupIsDisplayed() {
        return ictGroupButtonLocator.isDisplayed();
    }

    public boolean contactIsDisplayed() {
        return contactButtonLocator.isDisplayed();
    }

    public boolean searchIsDisplayed() {
        return searchButtonLocator.isDisplayed();
    }

    public boolean ourBrandsIsDisplayed() {
        return ourBrandsFromAboutSubmenuLocator.isDisplayed();
    }

    public boolean ourPromisesIsDisplayed() {
        return ourPromisesFromAboutSubmenuLocator.isDisplayed();
    }

    public boolean ourLeadershipIsDisplayed() {
        return ourLeadershipFromAboutSubmenuLocator.isDisplayed();
    }


    public void clickOnTheAboutButton() {
        aboutButtonLocator.click();
    }

    public void clickOnTheLogoButton() {
        logoButtonLocator.click();
    }

    public void hoverOverTheAboutButton() {
        aboutButtonLocator.click();
    }

    public void clickOnOurBrandsOption() {
        ourBrandsFromAboutSubmenuLocator.click();
    }

    public void clickOnOurPromisesOption() {
        ourPromisesFromAboutSubmenuLocator.click();
    }

    public void clickOnOurLeadershipOption() {
        ourLeadershipFromAboutSubmenuLocator.click();
    }

    public void clickOnTheServicesButton() {
        servicesButtonLocator.click();
    }

    public void hoverOverTheServicesButton() {
        servicesButtonLocator.click();
    }

    public boolean devOpsIsDisplayed() {
        return devOpsFromServicesSubmenuLocator.isDisplayed();
    }

    public boolean digitalTransformationIsDisplayed() {
        return digitalTransformationFromServicesSubmenuLocator.isDisplayed();
    }

    public boolean mobilityAndTransportationIsDisplayed() {
        return mobilityAndTransportationFromServicesSubmenuLocator.isDisplayed();
    }

    public boolean remoteDiagnosticsMonitoringAndPredictiveMaintenanceIsDisplayed() {
        return remoteDiagnosticsMonitoringAndPredictiveMaintenanceFromServicesSubmenuLocator.isDisplayed();
    }

    public boolean SDaaSIsDisplayed() {
        return SDaaSFromServicesSubmenuLocator.isDisplayed();
    }

    public boolean softwareIntegrationAndFLaaSIsDisplayed() {
        return softwareIntegrationAndFLaaSFromServicesSubmenuLocator.isDisplayed();
    }

    public boolean smartApplicationsIsDisplayed() {
        return smartApplicationsFromServicesSubmenuLocator.isDisplayed();
    }

    public boolean modularityServicesIsDisplayed() {
        return modularityServicesFromServicesSubmenuLocator.isDisplayed();
    }

    public void clickOnTheDevOpsOption() {
        devOpsFromServicesSubmenuLocator.click();
    }

    public void hoverOverTheDevOpsOption() {
        devOpsFromServicesSubmenuLocator.click();
    }

    public void clickOnTheDigitalTransformationOption() {
        digitalTransformationFromServicesSubmenuLocator.click();
    }

    public void hoverOverTheDigitalTransformationOption() {
        digitalTransformationFromServicesSubmenuLocator.click();
    }

    public void clickOnTheMobilityAndTransportationOption() {
        mobilityAndTransportationFromServicesSubmenuLocator.click();
    }

    public void clickOnTheRemoteDiagnosticsMonitoringAndPredictiveMaintenanceOption() {
        remoteDiagnosticsMonitoringAndPredictiveMaintenanceFromServicesSubmenuLocator.click();
    }

    public void clickOnTheSDaaSOption() {
        SDaaSFromServicesSubmenuLocator.click();
    }

    public void clickOnTheSoftwareIntegrationAndFLaaSOption() {
        softwareIntegrationAndFLaaSFromServicesSubmenuLocator.click();
    }

    public void clickOnTheSmartApplicationsOption() {
        smartApplicationsFromServicesSubmenuLocator.click();
    }

    public void hoverOverTheSmartApplicationsOption() {
        smartApplicationsFromServicesSubmenuLocator.click();
    }


    public void clickOnTheModularityServices() {
        modularityServicesFromServicesSubmenuLocator.click();
    }

    public Boolean itInfrastructureIsDisplayed() {
        return itInfrastructureFromDevOpsServicesSubmenuLocator.isDisplayed();
    }

    public void clickOnTheITInfrastructureOption() {
        itInfrastructureFromDevOpsServicesSubmenuLocator.click();
    }

    public Boolean consultancyIsDisplayed() {
        return consultancyFromDigitalTransformationServicesSubmenuLocator.isDisplayed();
    }

    public Boolean applicationModernizationIsDisplayed() {
        return applicationModernizationFromSmartApplicationsServicesSubmenuLocator.isDisplayed();
    }

    public Boolean applicationManagementIsDisplayed() {
        return applicationManagementFromSmartApplicationsServicesSubmenuLocator.isDisplayed();
    }

    public Boolean applicationDevelopmentIsDisplayed() {
        return applicationDevelopmentFromSmartApplicationsServicesSubmenuLocator.isDisplayed();
    }

    public void clickOnTheConsultancyOption() {
        consultancyFromDigitalTransformationServicesSubmenuLocator.click();
    }

    public void clickOnTheApplicationModernizationOption() {
        applicationModernizationFromSmartApplicationsServicesSubmenuLocator.click();
    }

    public void clickOnTheApplicationManagementOption() {
        applicationManagementFromSmartApplicationsServicesSubmenuLocator.click();
    }

    public void clickOnTheApplicationDevelopmentOption() {
        applicationDevelopmentFromSmartApplicationsServicesSubmenuLocator.click();
    }

    public void clickOnTheCustomersButton() {
        customersButtonLocator.click();
    }

    public void clickOnTheNearsuranceButton() {
        nearsuranceButtonLocator.click();
    }

    public void clickOnTheResourcesButton() {
        resourcesButtonLocator.click();
    }

    public void hoversOverTheResourcesButton() {
        resourcesButtonLocator.click();
    }

    public Boolean blogIsDisplayed() {
        return blogFromResourcesSubmenuLocator.isDisplayed();
    }

    public Boolean whitepapersIsDisplayed() {
        return whitepapersFromResourcesSubmenuLocator.isDisplayed();
    }

    public Boolean successStoriesIsDisplayed() {
        return successStoriesFromResourcesSubmenuLocator.isDisplayed();
    }

    public void clickOnTheBlogOption() {
        blogFromResourcesSubmenuLocator.click();
    }

    public void clickOnTheWhitepaperOption() {
        whitepapersFromResourcesSubmenuLocator.click();
    }

    public void clickOnTheSuccessStoriesOption() {
        successStoriesFromResourcesSubmenuLocator.click();
    }

    public void clickOnTheCareersButton() {
        careersButtonLocator.click();
    }

    public void clickOnTheAboutICTGroupButton() {
        ictGroupButtonLocator.click();
    }

    public void clickOnTheContactButton() {
        contactButtonLocator.click();
    }

    public void clickOnTheSearchButton() {
        searchButtonLocator.click();
    }

    public void enterSearchInput(String input) {
        searchInputFieldLocator.sendKeys(input);
    }

    public void searchInputPressEnter() {
        searchInputFieldLocator.sendKeys(Keys.ENTER);
    }

    public String searchMessageText() {
        return searchResultsMessageLocator.getText();
    }

}
