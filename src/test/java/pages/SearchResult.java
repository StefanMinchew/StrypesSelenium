package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResult {

    private WebDriver driver;

    @FindBy(css = ".elementor-heading-title")
    protected WebElement searchResultsMessageLocator;

    public SearchResult(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String searchMessageText() {
        return searchResultsMessageLocator.getText();
    }
}