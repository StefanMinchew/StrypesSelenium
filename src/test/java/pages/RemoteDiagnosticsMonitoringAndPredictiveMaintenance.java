package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RemoteDiagnosticsMonitoringAndPredictiveMaintenance {

    private WebDriver driver;

    public RemoteDiagnosticsMonitoringAndPredictiveMaintenance(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

}
