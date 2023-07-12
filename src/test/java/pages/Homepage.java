package pages;

import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {


    WebDriver driver;
    PageObjectManager pageObjectManager = new PageObjectManager(driver);

    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-id='db4b26e']")
    WebElement elementorTopSectionLocator;

    @FindBy(css = "[data-id='4d8c7b6'] .elementor-widget-container")
    WebElement certificationsSectionLocator;

    @FindBy(css = "[data-id='913488e'] .elementor-column-gap-default")
    WebElement learnMoreSectionLocator;

    @FindBy(css = "[data-id='d55c3c4']")
    WebElement whatIsNewSectionLocator;

    @FindBy(css = "[data-id='362d62b8'] .elementor-element-populated")
    WebElement partnersSectionLocator;

    @FindBy(css = "[data-id='8519a1a']")
    WebElement statisticsSectionLocator;

    @FindBy(css = "[data-id='2a0b1a6']")
    WebElement nearsuranceSectionLocator;

    @FindBy(css = "[data-id='83e6f43'] > div:nth-of-type(1)")
    WebElement softwareSolutionsSectionLocator;

    @FindBy(css = "[data-id='33324c7']")
    WebElement ourServicesSectionLocator;

    @FindBy(css = "[data-id='d3973af']")
    WebElement whoAreWeSectionLocator;

    @FindBy(css = "[data-swiper-slide-index='0']:nth-of-type(7) .elementor-slide-button")
    WebElement topSectionLearnMoreButtonLocator;

    @FindBy(css = "[data-id='9eedb11'] .elementor-button-text")
    WebElement whoAreWeLearnMoreButtonLocator;

    @FindBy(css = "[data-id='f8420fb'] [role]")
    WebElement ourServicesLearnMoreButtonLocator;

    @FindBy(css = "[data-id='0ee61bb'] [role]")
    WebElement nearsuranceLearnMoreButtonLocator;

    @FindBy(css = "[data-id='eb94daa'] [role]")
    WebElement whatIsNewLearnMoreButtonLocator;

    @FindBy(css = "[cta_dest_link]")
    WebElement getInTouchButtonLocator;

    public Boolean elementorTopSectionIsDisplayed() {
        return elementorTopSectionLocator.isDisplayed();
    }

    public Boolean whoAreWeSectionLocatorIsDisplayed() {
        return whoAreWeSectionLocator.isDisplayed();
    }

    public Boolean ourServicesSectionLocatorIsDisplayed() {
        return ourServicesSectionLocator.isDisplayed();
    }

    public Boolean softwareSolutionsSectionLocatorIsDisplayed() {
        return softwareSolutionsSectionLocator.isDisplayed();
    }

    public Boolean nearsuranceSectionLocatorIsDisplayed() {
        return nearsuranceSectionLocator.isDisplayed();
    }

    public Boolean statisticsSectionLocatorIsDisplayed() {
        return statisticsSectionLocator.isDisplayed();
    }

    public Boolean partnersSectionLocatorIsDisplayed() {
        return partnersSectionLocator.isDisplayed();
    }

    public Boolean whatIsNewSectionLocatorIsDisplayed() {
        return whatIsNewSectionLocator.isDisplayed();
    }

    public Boolean learnMoreSectionLocatorIsDisplayed() {
        return learnMoreSectionLocator.isDisplayed();
    }

    public Boolean certificationsSectionIsDisplayed() {
        return certificationsSectionLocator.isDisplayed();
    }

    public void navigateToHomepage() {
        driver.get(pageObjectManager.getHomePageUrl());
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void clickOnTheTopSectionLearnMoreButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(topSectionLearnMoreButtonLocator).click().perform();
    }

    public void clickOnTheWhoAreWeLearnMoreButton() {
        whoAreWeLearnMoreButtonLocator.click();
    }

    public void clickOnTheOurServicesLearnMoreButton() {
        ourServicesLearnMoreButtonLocator.click();
    }

    public void clickOnTheNearsuranceLearnMoreButton() {
        nearsuranceLearnMoreButtonLocator.click();
    }

    public void clickOnTheWhatIsNewLearnMoreButton() {
        whatIsNewLearnMoreButtonLocator.click();
    }

    public void clickOnTheGetInTouchButton() {
        getInTouchButtonLocator.click();
    }

}
