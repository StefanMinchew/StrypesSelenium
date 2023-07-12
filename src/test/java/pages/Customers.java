package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customers {

    WebDriver driver;

    public Customers(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-id='2c5fb46f'] .elementor-widget-container")
    WebElement backgroundTextLocator;

    public Boolean getBackGroundTextLocator() {
        return backgroundTextLocator.isDisplayed();
    }


    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
