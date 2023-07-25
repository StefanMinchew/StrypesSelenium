package pages;

import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Careers {

    private WebDriver driver;
    private PageObjectManager pageObjectManager = new PageObjectManager(driver);

    public Careers(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToCareersPage() {
        driver.get(pageObjectManager.getCareersPageUrl());
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
