package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


import java.time.Duration;

public class Base {

    public static WebDriver driver;
    public Header header;

    public String baseUrl = "https://strypes.eu/";
    public String homePageUrl = baseUrl;
    public String aboutPageUrl = baseUrl + "about-strypes/";
    public String ourBrandsPageUrl = baseUrl + "our-brands/";
    public String ourPromisesPageUrl = baseUrl + "promises/";
    public String ourLeadershipPageUrl = baseUrl + "our-leadership/";

    String browser = "ChRoMe";

    public void setup () {
        switch (browser.toLowerCase()) {
            case "chrome" -> driver = new ChromeDriver();
            case "firefox" -> driver = new FirefoxDriver();
            case "safari" -> driver = new SafariDriver();
            case "edge" -> driver = new EdgeDriver();
            default -> driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        header = new Header(driver);
    }

    public void tearDown () {
        if (driver != null) driver.quit();
    }

}