package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header extends Base {

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
    WebElement ourBrandsFromAboutDropdownLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-807'] .elementor-sub-item")
    WebElement ourPromisesFromAboutDropdownLocator;

    @FindBy(css = "[class] #header_pop:nth-of-type(1) .elementor-nav-menu--layout-horizontal [class='menu-item menu-item-type-post_type menu-item-object-page menu-item-1731'] .elementor-sub-item")
    WebElement ourLeadershipFromAboutDropdownLocator;

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
        return ourBrandsFromAboutDropdownLocator.isDisplayed();
    }

    public boolean ourPromisesIsDisplayed() {
        return ourPromisesFromAboutDropdownLocator.isDisplayed();
    }

    public boolean ourLeadershipIsDisplayed() {
        return ourLeadershipFromAboutDropdownLocator.isDisplayed();
    }


    public void clickOnTheAboutButton() {
        aboutButtonLocator.click();
    }

    public void hoverOverTheAboutButton() {
        aboutButtonLocator.click();
    }

    public void clickOnOurBrandsOption() {
        ourBrandsFromAboutDropdownLocator.click();
    }

    public void clickOnOurPromisesOption() {
       ourPromisesFromAboutDropdownLocator.click();
    }

    public void clickOnOurLeadershipOption() {
        ourLeadershipFromAboutDropdownLocator.click();
    }

    public void clockOnTheLogoButton() {
        logoButtonLocator.click();
    }
    public void clickOnTheServicesButton() {
        servicesButtonLocator.click();
    }

}
