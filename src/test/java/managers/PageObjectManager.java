package managers;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageObjectManager {

    private WebDriver driver;

    public PageObjectManager (WebDriver driver) {
        this.driver = driver;
    }

    private Homepage homepage;
    private Header header;
    private About about;
    private OurBrands ourBrands;
    private OurPromises ourPromises;
    private OurLeadership ourLeadership;
    private DevOps devOps;
    private DigitalTransformation digitalTransformation;
    private MobilityAndTransformation mobilityAndTransformation;
    private RemoteDiagnosticsMonitoringAndPredictiveMaintenance remoteDiagnosticsMonitoringAndPredictiveMaintenance;
    private SDaaS sDaaS;
    private SoftwareIntegrationAndFLaaS softwareIntegrationAndFLaaS;
    private SmartApplications smartApplications;
    private ModularityServices modularityServices;
    private ITInfrastructure itInfrastructure;
    private Consultancy consultancy;
    private ApplicationModernization applicationModernization;
    private ApplicationManagement applicationManagement;
    private ApplicationDevelopment applicationDevelopment;
    private Services services;
    private Customers customers;
    private Nearsurance nearsurance;
    private Resources resources;
    private Blog blog;
    private WhitePapers whitePapers;
    private SuccessStories successStories;
    private Careers careers;
    private AboutICTGroup aboutICTGroup;
    private Contact contact;
    private SearchResult searchResult;


    private String searchInput = "Strypes";

    private String baseUrl = FileReaderManager.getInstance().getConfigReader().getApplicationUrl();

    private String searchResultPageUrl = baseUrl + "?s=" + searchInput;
    private String homePageUrl = baseUrl;
    private String aboutPageUrl = baseUrl + "about-strypes/";
    private String ourBrandsPageUrl = baseUrl + "our-brands/";
    private String ourPromisesPageUrl = baseUrl + "promises/";
    private String ourLeadershipPageUrl = baseUrl + "our-leadership/";
    private String devOpsPageUrl = baseUrl + "devops/";
    private String digitalTransformationPageUrl = baseUrl + "digital-transformation/";
    private String mobilityAndTransporationPageUrl = baseUrl + "mobility-and-transportation/";
    private String remoteDiagnosticsMonitoringAndPredictiveMaintenancePageUrl = baseUrl + "remote-diagnostics-monitoring-predictive-maintenance/";
    private String sdaasPageUrl = baseUrl + "sdaas/";
    private String softwareIntegrationAndFlaasPageUrl = baseUrl + "software-integration-and-flaas-federated-learning-as-a-service/";
    private String smartApplicationsPageUrl = baseUrl + "smart-applications-the-intelligent-approach/";
    private String modularityServicesPageUrl = baseUrl + "modularity-services/";
    private String itInfrastructurePageUrl = devOpsPageUrl + "it-infrastructure-management/";
    private String consultancyPageUrl = baseUrl + "consultancy/";
    private String applicationModernizationPageUrl = baseUrl + "smart-applications-the-intelligent-approach/application-modernization-staying-on-trend-ahead-of-time/";
    private String applicationManagementPageUrl = baseUrl + "smart-applications-the-intelligent-approach/application-management-maintaining-advantage-always/";
    private String applicationDevelopmentPageUrl = baseUrl + "smart-applications-the-intelligent-approach/application-development-our-core-competency/";
    private String servicesPageUrl = baseUrl + "services/";
    private String customersPageUrl = baseUrl + "customers/";
    private String nearsurancePageUrl = baseUrl + "nearsurance/";
    private String resourcesPageUrl = baseUrl + "resources/";
    private String blogPageUrl = baseUrl + "blog/";
    private String whitepapersPageUrl = baseUrl + "whitepapers/";
    private String successStoriesPageUrl = baseUrl + "success-stories/";
    private String careersPageUrl = baseUrl + "careers/";
    private String contactPageUrl = baseUrl + "contact/";
    private String aboutICTGroupPageUrl = baseUrl + "about-ict-group/";

    public String getSearchInput() {
        return searchInput;
    }

    public String getSearchResultPageUrl() {
        return searchResultPageUrl;
    }

    public String getHomePageUrl() {
        return homePageUrl;
    }

    public String getAboutPageUrl() {
        return aboutPageUrl;
    }

    public String getOurBrandsPageUrl() {
        return ourBrandsPageUrl;
    }

    public String getOurPromisesPageUrl() {
        return ourPromisesPageUrl;
    }

    public String getOurLeadershipPageUrl() {
        return ourLeadershipPageUrl;
    }

    public String getDevOpsPageUrl() {
        return devOpsPageUrl;
    }

    public String getDigitalTransformationPageUrl() {
        return digitalTransformationPageUrl;
    }

    public String getMobilityAndTransporationPageUrl() {
        return mobilityAndTransporationPageUrl;
    }

    public String getRemoteDiagnosticsMonitoringAndPredictiveMaintenancePageUrl() {
        return remoteDiagnosticsMonitoringAndPredictiveMaintenancePageUrl;
    }

    public String getSdaasPageUrl() {
        return sdaasPageUrl;
    }

    public String getSoftwareIntegrationAndFlaasPageUrl() {
        return softwareIntegrationAndFlaasPageUrl;
    }

    public String getSmartApplicationsPageUrl() {
        return smartApplicationsPageUrl;
    }

    public String getModularityServicesPageUrl() {
        return modularityServicesPageUrl;
    }

    public String getItInfrastructurePageUrl() {
        return itInfrastructurePageUrl;
    }

    public String getConsultancyPageUrl() {
        return consultancyPageUrl;
    }

    public String getApplicationModernizationPageUrl() {
        return applicationModernizationPageUrl;
    }

    public String getApplicationManagementPageUrl() {
        return applicationManagementPageUrl;
    }

    public String getApplicationDevelopmentPageUrl() {
        return applicationDevelopmentPageUrl;
    }

    public String getServicesPageUrl() {
        return servicesPageUrl;
    }

    public String getCustomersPageUrl() {
        return customersPageUrl;
    }

    public String getNearsurancePageUrl() {
        return nearsurancePageUrl;
    }

    public String getResourcesPageUrl() {
        return resourcesPageUrl;
    }

    public String getBlogPageUrl() {
        return blogPageUrl;
    }

    public String getWhitepapersPageUrl() {
        return whitepapersPageUrl;
    }

    public String getSuccessStoriesPageUrl() {
        return successStoriesPageUrl;
    }

    public String getCareersPageUrl() {
        return careersPageUrl;
    }

    public String getContactPageUrl() {
        return contactPageUrl;
    }

    public String getAboutICTGroupPageUrl() {
        return aboutICTGroupPageUrl;
    }

    public Homepage getHomepage() {
        return (homepage == null) ? homepage = new Homepage(driver) : homepage;
    }

    public Header getHeader() {
        return (header == null) ? header = new Header(driver) : header;
    }

    public About getAbout() {
        return (about == null) ? about = new About(driver) : about;
    }

    public OurBrands getOurBrands() {
        return (ourBrands == null) ? ourBrands = new OurBrands(driver) : ourBrands;
    }

    public OurPromises getOurPromises() {
        return (ourPromises == null) ? ourPromises = new OurPromises(driver) : ourPromises;
    }

    public OurLeadership getOurLeadership() {
        return (ourLeadership == null) ? ourLeadership = new OurLeadership(driver) : ourLeadership;
    }

    public DevOps getDevOps() {
        return (devOps == null) ? devOps = new DevOps(driver) : devOps;
    }

    public DigitalTransformation getDigitalTransformation() {
        return (digitalTransformation == null) ? digitalTransformation = new DigitalTransformation(driver) : digitalTransformation;
    }

    public MobilityAndTransformation getMobilityAndTransformation() {
        return (mobilityAndTransformation == null) ? mobilityAndTransformation = new MobilityAndTransformation(driver) : mobilityAndTransformation;
    }

    public RemoteDiagnosticsMonitoringAndPredictiveMaintenance getRemoteDiagnosticsMonitoringAndPredictiveMaintenance() {
        return (remoteDiagnosticsMonitoringAndPredictiveMaintenance == null) ? remoteDiagnosticsMonitoringAndPredictiveMaintenance = new RemoteDiagnosticsMonitoringAndPredictiveMaintenance(driver) : remoteDiagnosticsMonitoringAndPredictiveMaintenance;
    }

    public SDaaS getsDaaS() {
        return (sDaaS == null) ? sDaaS = new SDaaS(driver) : sDaaS;
    }

    public SoftwareIntegrationAndFLaaS getSoftwareIntegrationAndFLaaS() {
        return (softwareIntegrationAndFLaaS == null) ? softwareIntegrationAndFLaaS = new SoftwareIntegrationAndFLaaS(driver) : softwareIntegrationAndFLaaS;
    }

    public SmartApplications getSmartApplications() {
        return (smartApplications == null) ? smartApplications = new SmartApplications(driver) : smartApplications;
    }

    public ModularityServices getModularityServices() {
        return (modularityServices == null) ? modularityServices = new ModularityServices(driver) : modularityServices;
    }

    public ITInfrastructure getItInfrastructure() {
        return (itInfrastructure == null) ? itInfrastructure = new ITInfrastructure(driver) : itInfrastructure;
    }

    public Consultancy getConsultancy() {
        return (consultancy == null) ? consultancy = new Consultancy(driver) : consultancy;
    }

    public ApplicationModernization getApplicationModernization() {
        return (applicationModernization == null) ? applicationModernization = new ApplicationModernization(driver) : applicationModernization;
    }

    public ApplicationManagement getApplicationManagement() {
        return (applicationManagement == null) ? applicationManagement = new ApplicationManagement(driver) : applicationManagement;
    }

    public ApplicationDevelopment getApplicationDevelopment() {
        return (applicationDevelopment == null) ? applicationDevelopment = new ApplicationDevelopment(driver) : applicationDevelopment;
    }

    public Services getServices() {
        return (services == null) ? services = new Services(driver) : services;
    }

    public Customers getCustomers() {
        return (customers == null) ? customers = new Customers(driver) : customers;
    }

    public Nearsurance getNearsurance() {
        return (nearsurance == null) ? nearsurance = new Nearsurance(driver) : nearsurance;
    }

    public Resources getResources() {
        return (resources == null) ? resources = new Resources(driver) : resources;
    }

    public Blog getBlog() {
        return (blog == null) ? blog = new Blog(driver) : blog;
    }

    public WhitePapers getWhitePapers() {
        return (whitePapers == null) ? whitePapers = new WhitePapers(driver) : whitePapers;
    }

    public SuccessStories getSuccessStories() {
        return (successStories == null) ? successStories = new SuccessStories(driver) : successStories;
    }

    public Careers getCareers() {
        return (careers == null) ? careers = new Careers(driver) : careers;
    }

    public AboutICTGroup getAboutICTGroup() {
        return (aboutICTGroup == null) ? aboutICTGroup = new AboutICTGroup(driver) : aboutICTGroup;
    }

    public Contact getContact() {
        return (contact == null) ? contact = new Contact(driver) : contact;
    }

    public SearchResult getSearchResult() {
        return (searchResult == null) ? searchResult = new SearchResult(driver) : searchResult;
    }

}
