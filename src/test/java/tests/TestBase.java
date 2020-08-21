package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import configuration.DriverProperty;
import configuration.WebsiteUrls;

public abstract class TestBase {
	protected WebDriver driver = null;

	@BeforeTest
	void setup() throws InterruptedException {
		System.out.println("TestBase.setup()");
		DriverProperty driverProperty = new DriverProperty();
		System.setProperty(driverProperty.BROWSER_DRIVER,
			   driverProperty.DRIVER_LOCATION);
		websiteLaunch();
	}

	private void websiteLaunch() throws InterruptedException {
		driver = new ChromeDriver();
		WebsiteUrls websiteURL = new WebsiteUrls();
		String URL = websiteURL.BROWSER_DRIVER;
		//Browser resolution
		int browserResolutionX=1024;
		int browserResolutionY=768;
		driver.manage().window().setSize(new Dimension(browserResolutionX, browserResolutionY));
		driver.navigate().to(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
