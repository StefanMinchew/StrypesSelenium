package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@alt='Strypes logo']")
    protected WebElement logoButtonLocator;

    @FindBy(css = ".menu-item-1250")
    protected WebElement aboutButtonLocator;

    @FindBy(css = ".menu-item-45")
    protected WebElement servicesButtonLocator;

    @FindBy(css = ".menu-item-52")
    protected WebElement customersButtonLocator;

    @FindBy(css = ".menu-item-749")
    protected WebElement nearsuranceButtonLocator;

    @FindBy(css = ".menu-item-2634")
    protected WebElement resourcesButtonLocator;

    @FindBy(css = ".menu-item-79")
    protected WebElement careersButtonLocator;

    @FindBy(css = ".menu-item-60")
    protected WebElement ictGroupButtonLocator;

    @FindBy(css = ".menu-item-62")
    protected WebElement contactButtonLocator;

    @FindBy(css = ".elementor-search-form")
    protected WebElement searchButtonLocator;

    @FindBy(css = ".menu-item-66")
    protected WebElement ourBrandsFromAboutSubmenuLocator;

    @FindBy(css = ".menu-item-807")
    protected WebElement ourPromisesFromAboutSubmenuLocator;

    @FindBy(css = ".menu-item-1731")
    protected WebElement ourLeadershipFromAboutSubmenuLocator;

    @FindBy(css = ".menu-item-2248")
    protected WebElement devOpsFromServicesSubmenuLocator;

    @FindBy(css = ".menu-item-797")
    protected WebElement digitalTransformationFromServicesSubmenuLocator;

    @FindBy(css = ".menu-item-799")
    protected WebElement mobilityAndTransportationFromServicesSubmenuLocator;

    @FindBy(css = ".menu-item-1863")
    protected WebElement remoteDiagnosticsMonitoringAndPredictiveMaintenanceFromServicesSubmenuLocator;

    @FindBy(css = ".menu-item-2481")
    protected WebElement SDaaSFromServicesSubmenuLocator;

    @FindBy(css = ".menu-item-2487")
    protected WebElement softwareIntegrationAndFLaaSFromServicesSubmenuLocator;

    @FindBy(css = ".menu-item-2508")
    protected WebElement smartApplicationsFromServicesSubmenuLocator;

    @FindBy(linkText = "Modularity Services")
    protected WebElement modularityServicesFromServicesSubmenuLocator;

    @FindBy(css = ".menu-item-2074")
    protected WebElement itInfrastructureFromDevOpsServicesSubmenuLocator;

    @FindBy(css = ".menu-item-2493")
    protected WebElement consultancyFromDigitalTransformationServicesSubmenuLocator;

    @FindBy(css = ".menu-item-2477")
    protected WebElement applicationModernizationFromSmartApplicationsServicesSubmenuLocator;

    @FindBy(css = ".menu-item-2478")
    protected WebElement applicationManagementFromSmartApplicationsServicesSubmenuLocator;

    @FindBy(css = ".menu-item-2479")
    protected WebElement applicationDevelopmentFromSmartApplicationsServicesSubmenuLocator;

    @FindBy(css = ".menu-item-2522")
    protected WebElement blogFromResourcesSubmenuLocator;
    @FindBy(css = ".menu-item-2625")
    protected WebElement whitepapersFromResourcesSubmenuLocator;
    @FindBy(css = ".menu-item-2626")
    protected WebElement successStoriesFromResourcesSubmenuLocator;

    @FindBy(css = ".elementor-search-form__input")
    protected WebElement searchInputFieldLocator;

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

    public boolean isNavigationLinksDisplayed(String links) {
        if (links.equals("logo")) {
            return this.logoIsDisplayed();
        } else if (links.equals("about")) {
            return this.aboutIsDisplayed();
        } else if (links.equals("services")) {
            return this.servicesIsDisplayed();
        } else if (links.equals("customers")) {
            return this.customersIsDisplayed();
        } else if (links.equals("nearsurance")) {
            return this.nearsurranceIsDisplayed();
        } else if (links.equals("resources")) {
            return this.resourcesIsDisplayed();
        } else if (links.equals("careers")) {
            return this.careerIsDisplayed();
        } else if (links.equals("ictgroup")) {
            return this.ictGroupIsDisplayed();
        } else if (links.equals("contact")) {
            return this.contactIsDisplayed();
        } else if (links.equals("search")) {
            return this.searchIsDisplayed();
        } else {
            return false;
        }
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

    public boolean isAboutSubmenuContentDisplayed(String content) {
        if (content.equals("our brands")) {
            return this.ourBrandsIsDisplayed();
        } else if (content.equals("our promises")) {
            return this.ourPromisesIsDisplayed();
        } else if (content.equals("our leadership")) {
            return this.ourLeadershipIsDisplayed();
        } else {
            return false;
        }
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

    public boolean isServicesContentDisplayed(String content) {
        if (content.equals("Devops")) {
            return this.devOpsIsDisplayed();
        } else if (content.equals("Digital transformation")) {
            return this.digitalTransformationIsDisplayed();
        } else if (content.equals("Mobility and Transportation")) {
            return this.mobilityAndTransportationIsDisplayed();
        } else if (content.equals("Remote Diagnostics, Monitoring and Predictive Maintenance")) {
            return this.remoteDiagnosticsMonitoringAndPredictiveMaintenanceIsDisplayed();
        } else if (content.equals("SDaaS")) {
            return this.SDaaSIsDisplayed();
        } else if (content.equals("Software Integration and FLaaS")) {
            return this.softwareIntegrationAndFLaaSIsDisplayed();
        } else if (content.equals("Smart applications")) {
            return this.smartApplicationsIsDisplayed();
        } else if (content.equals("Modularity Services")) {
            return this.modularityServicesIsDisplayed();
        } else {
            return false;
        }
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

    public boolean itInfrastructureIsDisplayed() {
        return itInfrastructureFromDevOpsServicesSubmenuLocator.isDisplayed();
    }

    public void clickOnTheITInfrastructureOption() {
        itInfrastructureFromDevOpsServicesSubmenuLocator.click();
    }

    public boolean consultancyIsDisplayed() {
        return consultancyFromDigitalTransformationServicesSubmenuLocator.isDisplayed();
    }

    public boolean applicationModernizationIsDisplayed() {
        return applicationModernizationFromSmartApplicationsServicesSubmenuLocator.isDisplayed();
    }

    public boolean applicationManagementIsDisplayed() {
        return applicationManagementFromSmartApplicationsServicesSubmenuLocator.isDisplayed();
    }

    public boolean applicationDevelopmentIsDisplayed() {
        return applicationDevelopmentFromSmartApplicationsServicesSubmenuLocator.isDisplayed();
    }

    public boolean isSmartApplicationSubmenuContentDisplayed(String content) {
        if (content.equals("Application modernization")) {
            return this.applicationModernizationIsDisplayed();
        } else if (content.equals("Application management")) {
            return this.applicationManagementIsDisplayed();
        } else if (content.equals("Application development")) {
            return this.applicationDevelopmentIsDisplayed();
        } else {
            return false;
        }
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

    public boolean blogIsDisplayed() {
        return blogFromResourcesSubmenuLocator.isDisplayed();
    }

    public boolean whitepapersIsDisplayed() {
        return whitepapersFromResourcesSubmenuLocator.isDisplayed();
    }

    public boolean successStoriesIsDisplayed() {
        return successStoriesFromResourcesSubmenuLocator.isDisplayed();
    }

    public boolean isResourcesSubmenuContentDisplayed(String content) {
        if (content.equals("Blog")) {
            return this.blogIsDisplayed();
        } else if (content.equals("Whitepapers")) {
            return this.whitepapersIsDisplayed();
        } else if (content.equals("Success Stories")) {
            return this.successStoriesIsDisplayed();
        } else {
            return false;
        }
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
        try {
            searchInputFieldLocator.sendKeys(input, Keys.ENTER);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
