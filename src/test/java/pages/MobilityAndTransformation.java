package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilityAndTransformation {

    WebDriver driver;

    public MobilityAndTransformation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-id='4c468d04'] .elementor-widget-container")
    WebElement backgroundTextLocator;

    public Boolean getBackGroundTextLocator() {
        return backgroundTextLocator.isDisplayed();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
