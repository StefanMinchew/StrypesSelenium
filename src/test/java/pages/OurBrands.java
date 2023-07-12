package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurBrands {

    WebDriver driver;

    public OurBrands(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".elementor-element.elementor-element-740a5a56.elementor-widget.elementor-widget-heading.header-span > .elementor-widget-container")
    WebElement backgroundTextLocator;

    public Boolean getBackGroundTextLocator() {
        return backgroundTextLocator.isDisplayed();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}