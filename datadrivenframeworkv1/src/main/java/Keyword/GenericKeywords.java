package Keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.safari.SafariDriver;

// This class can contain generic keywords that can be used across different test cases
// For example, methods for opening a browser, navigating to a URL, etc.


public class GenericKeywords {
    public WebDriver driver=null; //creating public instance of Webdriver

    public void openBrowser(String browserName) {
        
        if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/anshul/java_selenium/SeleniumDemoProject/drivers/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized", "--disable-infobars");
			options.addArguments("--disable-extensions");
			
			options.addArguments("--incognito");
			options.addArguments("--disable-notifications");
			options.addArguments("ignore-certificate-errors");
			
			driver = new ChromeDriver(options);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/anshul/java_selenium/SeleniumDemoProject/drivers/geckodriver");
			FirefoxOptions options  = new FirefoxOptions();
			
			ProfilesIni profiles = new ProfilesIni();
			FirefoxProfile ffprofile = profiles.getProfile("TestUser");
			
			ffprofile.setPreference("dom.webnotifications.enabled", false);
			ffprofile.setAcceptUntrustedCertificates(true);
			ffprofile.setAssumeUntrustedCertificateIssuer(false);
			
			options.setProfile(ffprofile);
			driver = new FirefoxDriver(options);
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/anshul/java_selenium/SeleniumDemoProject/drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			System.setProperty("webdriver.chrome.driver",
					"/Users/anshul/java_selenium/SeleniumDemoProject/drivers/chromedriver");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
    }
    public void navigateTo(String url) {
        // Code to navigate to the specified URL
    }
    public void click(String element) {
        // Code to click on the specified element
    }
    public void enterText(String element, String text) {
        // Code to enter text into the specified element
    }
    public void verifyElementPresent(String element) {
        // Code to verify that the specified element is present on the page
    }
     public void waitForElement(String element) {
        // Code to wait for the specified element to be present
    }
    public void select() {
        // Code to wait for the page to load completely
    }
    public void getText() {
        // Code to wait for the page to load completely
    }
    public void refreshPage() {
        // Code to refresh the current page
    }
    public void takeScreenshot(String fileName) {
        // Code to take a screenshot and save it with the specified file name
    }
    public void log(String message) {
        // Code to log messages for debugging or reporting purposes
    }
    public void acceptAlert() {
        // Code to accept an alert dialog
    }
    public void dismissAlert() {
        // Code to dismiss an alert dialog
    }
    public void closeBrowser() {
        // Code to close the browser
    }
   


}
