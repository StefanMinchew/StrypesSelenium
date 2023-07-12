package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {

    WebDriver driver;

    public Contact(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".hs-button.large.primary")
    WebElement sendButtonLocator;

    public Boolean getBackGroundTextLocator() {
        return sendButtonLocator.isDisplayed();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
