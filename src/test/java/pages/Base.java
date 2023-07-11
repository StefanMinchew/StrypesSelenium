package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


import java.time.Duration;

public class Base {

    public static WebDriver driver;
    public String searchInput = "Strypes";

    public Header header;
    public About about;
    public OurBrands ourBrands;
    public OurPromises ourPromises;
    public OurLeadership ourLeadership;
    public DevOps devOps;
    public DigitalTransformation digitalTransformation;
    public MobilityAndTransformation mobilityAndTransformation;
    public RemoteDiagnosticsMonitoringAndPredictiveMaintenance remoteDiagnosticsMonitoringAndPredictiveMaintenance;
    public SDaaS sDaaS;
    public SoftwareIntegrationAndFLaaS softwareIntegrationAndFLaaS;
    public SmartApplications smartApplications;
    public ModularityServices modularityServices;
    public ITInfrastructure itInfrastructure;
    public Consultancy consultancy;
    public ApplicationModernization applicationModernization;
    public ApplicationManagement applicationManagement;
    public ApplicationDevelopment applicationDevelopment;
    public Services services;
    public Customers customers;
    public Nearsurance nearsurance;
    public Resources resources;
    public Blog blog;
    public WhitePapers whitePapers;
    public SuccessStories successStories;
    public Careers careers;
    public AboutICTGroup aboutICTGroup;
    public Contact contact;

    public String baseUrl = "https://strypes.eu/";
    public String homePageUrl = baseUrl;
    public String aboutPageUrl = baseUrl + "about-strypes/";
    public String ourBrandsPageUrl = baseUrl + "our-brands/";
    public String ourPromisesPageUrl = baseUrl + "promises/";
    public String ourLeadershipPageUrl = baseUrl + "our-leadership/";

    public String devOpsPageUrl = baseUrl + "devops/";
    public String digitalTransformationPageUrl = baseUrl + "digital-transformation/";
    public String mobilityAndTransporationPageUrl = baseUrl + "mobility-and-transportation/";
    public String remoteDiagnosticsMonitoringAndPredictiveMaintenancePageUrl = baseUrl + "remote-diagnostics-monitoring-predictive-maintenance/";
    public String sdaasPageUrl = baseUrl + "sdaas/";
    public String softwareIntegrationAndFlaasPageUrl = baseUrl + "software-integration-and-flaas-federated-learning-as-a-service/";
    public String smartApplicationsPageUrl = baseUrl + "smart-applications-the-intelligent-approach/";
    public String modularityServicesPageUrl = baseUrl + "modularity-services/";
    public String itInfrastructurePageUrl = devOpsPageUrl + "it-infrastructure-management/";

    public String consultancyPageUrl = baseUrl + "consultancy/";
    public String applicationModernizationPageUrl = baseUrl + "smart-applications-the-intelligent-approach/application-modernization-staying-on-trend-ahead-of-time/";
    public String applicationManagementPageUrl = baseUrl + "smart-applications-the-intelligent-approach/application-management-maintaining-advantage-always/";
    public String applicationDevelopmentPageUrl = baseUrl + "smart-applications-the-intelligent-approach/application-development-our-core-competency/";
    public String servicesPageUrl = baseUrl + "services/";
    public String customersPageUrl = baseUrl + "customers/";
    public String nearsurancePageUrl = baseUrl + "nearsurance/";
    public String resourcesPageUrl = baseUrl + "resources/";
    public String blogPageUrl = baseUrl + "blog/";
    public String whitepapersPageUrl = baseUrl + "whitepapers/";
    public String successStoriesPageUrl = baseUrl + "success-stories/";
    public String careersPageUrl = baseUrl + "careers/";
    public String contactPageUrl = baseUrl + "contact/";
    public String aboutICTGroupPageUrl = baseUrl + "about-ict-group/";
    public String searchResultPageUrl = baseUrl + "?s=" + searchInput;

    String browser = "fIreFox";

    public void setup() {
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
        about = new About(driver);
        ourBrands = new OurBrands(driver);
        ourPromises = new OurPromises(driver);
        ourLeadership = new OurLeadership(driver);
        devOps = new DevOps(driver);
        digitalTransformation = new DigitalTransformation(driver);
        mobilityAndTransformation = new MobilityAndTransformation(driver);
        remoteDiagnosticsMonitoringAndPredictiveMaintenance = new RemoteDiagnosticsMonitoringAndPredictiveMaintenance(driver);
        sDaaS = new SDaaS(driver);
        softwareIntegrationAndFLaaS = new SoftwareIntegrationAndFLaaS(driver);
        smartApplications = new SmartApplications(driver);
        modularityServices = new ModularityServices(driver);
        itInfrastructure = new ITInfrastructure(driver);
        consultancy = new Consultancy(driver);
        applicationModernization = new ApplicationModernization(driver);
        applicationManagement = new ApplicationManagement(driver);
        applicationDevelopment = new ApplicationDevelopment(driver);
        services = new Services(driver);
        customers = new Customers(driver);
        nearsurance = new Nearsurance(driver);
        resources = new Resources(driver);
        blog = new Blog(driver);
        whitePapers = new WhitePapers(driver);
        successStories = new SuccessStories(driver);
        careers = new Careers(driver);
        aboutICTGroup = new AboutICTGroup(driver);
        contact = new Contact(driver);
    }

    public void tearDown() {
        if (driver != null) driver.quit();
    }

}