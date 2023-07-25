package pages;

import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    private WebDriver driver;
    private PageObjectManager pageObjectManager = new PageObjectManager(driver);

    public Homepage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-id='db4b26e']")
    protected WebElement elementorTopSectionLocator;

    @FindBy(css = "[data-id='4d8c7b6']")
    protected WebElement certificationsSectionLocator;

    @FindBy(css = "[data-id='913488e']")
    protected WebElement learnMoreSectionLocator;

    @FindBy(css = "[data-id='d55c3c4']")
    protected WebElement whatIsNewSectionLocator;

    @FindBy(css = "[data-id='362d62b8']")
    protected WebElement partnersSectionLocator;

    @FindBy(css = "[data-id='8519a1a']")
    protected WebElement statisticsSectionLocator;

    @FindBy(css = "[data-id='2a0b1a6']")
    protected WebElement nearsuranceSectionLocator;

    @FindBy(css = "[data-id='83e6f43']")
    protected WebElement softwareSolutionsSectionLocator;

    @FindBy(css = "[data-id='33324c7']")
    protected WebElement ourServicesSectionLocator;

    @FindBy(css = "[data-id='d3973af']")
    protected WebElement whoAreWeSectionLocator;

    @FindBy(css = ".elementor-slide-button")
    protected WebElement topSectionLearnMoreButtonLocator;

    @FindBy(css = "[data-id='9eedb11'] .elementor-button-text")
    protected WebElement whoAreWeLearnMoreButtonLocator;

    @FindBy(css = ".elementor-button-wrapper > a[href=\"/services/\"]")
    protected WebElement ourServicesLearnMoreButtonLocator;

    @FindBy(css = ".elementor-button-wrapper > a[href=\"https://strypes.eu/nearsurance/\"]")
    protected WebElement nearsuranceLearnMoreButtonLocator;

    @FindBy(css = ".elementor-button-wrapper > a[href=\"/blog/\"]")
    protected WebElement whatIsNewLearnMoreButtonLocator;

    @FindBy(css = ".cta_button")
    protected WebElement getInTouchButtonLocator;

    public boolean elementorTopSectionIsDisplayed() {
        return elementorTopSectionLocator.isDisplayed();
    }

    public boolean whoAreWeSectionIsDisplayed() {
        return whoAreWeSectionLocator.isDisplayed();
    }

    public boolean ourServicesSectionIsDisplayed() {
        return ourServicesSectionLocator.isDisplayed();
    }

    public boolean softwareSolutionsSectionIsDisplayed() {
        return softwareSolutionsSectionLocator.isDisplayed();
    }

    public boolean nearsuranceSectionIsDisplayed() {
        return nearsuranceSectionLocator.isDisplayed();
    }

    public boolean statisticsSectionIsDisplayed() {
        return statisticsSectionLocator.isDisplayed();
    }

    public boolean partnersSectionIsDisplayed() {
        return partnersSectionLocator.isDisplayed();
    }

    public boolean whatIsNewSectionIsDisplayed() {
        return whatIsNewSectionLocator.isDisplayed();
    }

    public boolean learnMoreSectionIsDisplayed() {
        return learnMoreSectionLocator.isDisplayed();
    }

    public boolean certificationsIsDisplayed() {
        return certificationsSectionLocator.isDisplayed();
    }

    public boolean isHomePageDisplayed(String content) {
        if (content.equals("hero section")) {
            return this.elementorTopSectionIsDisplayed();
        } else if (content.equals("who are we")) {
            return this.whoAreWeSectionIsDisplayed();
        } else if (content.equals("our services")) {
            return this.ourServicesSectionIsDisplayed();
        } else if (content.equals("software solution")) {
            return this.softwareSolutionsSectionIsDisplayed();
        } else if (content.equals("nearsurance")) {
            return this.nearsuranceSectionIsDisplayed();
        } else if (content.equals("statistics")) {
            return this.statisticsSectionIsDisplayed();
        } else if (content.equals("partners")) {
            return this.partnersSectionIsDisplayed();
        } else if (content.equals("whats new")) {
            return this.whatIsNewSectionIsDisplayed();
        } else if (content.equals("learn more")) {
            return this.learnMoreSectionIsDisplayed();
        } else if (content.equals("certifications")) {
            return this.certificationsIsDisplayed();
        } else {
            return false;
        }
    }

    public void navigateToHomepage() {
        driver.get(pageObjectManager.getHomePageUrl());
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void clickOnTheTopSectionLearnMoreButton() {
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(topSectionLearnMoreButtonLocator).click().perform();
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
