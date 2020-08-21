package tests;


import java.io.ByteArrayInputStream;

import io.qameta.allure.Allure;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import actions.TabWindowHandleUtil;
import pageobjects.admin.AdminUtil;
import pageobjects.location.LocationUtil;
import pageobjects.loginlogout.LoginLogoutUtil;
import pageobjects.permission.PermissionUtil;
import testdata.Admin;

public class LocationPagePermissionTest extends TestBase {

	// Define Pages utilities
	LoginLogoutUtil loginLogout;
	TabWindowHandleUtil windowHandle;
	AdminUtil addNewAdmin;
	PermissionUtil locationPerm;
	LocationUtil location;
	

	Admin admin = Admin.buildNewAdmin();

	@BeforeClass
	
	void initUtlities() {
		System.out.println("LoginDefaultAdmin.initUtlities()");
		//Initialize utilites
		loginLogout = new LoginLogoutUtil(driver);
		windowHandle = new TabWindowHandleUtil(driver);
		addNewAdmin = new AdminUtil(driver);
		locationPerm = new PermissionUtil(driver);
		location = new LocationUtil(driver);
		
		naviagteToLocationPage();
		Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
	}

	private void naviagteToLocationPage() {
		// get login window
		loginLogout.loginWindow();
		// get opened tab window
		windowHandle.getOtherTabWindow();

		// Login as default admin
		Admin rootAdmin = Admin.buildRootAdmin();
		loginLogout.login(rootAdmin.email, rootAdmin.password);

		addNewAdmin.addNewAdminWindow();
		addNewAdmin.newAdminFillData(admin);
		locationPerm.locationPermission();
		loginLogout.logout();
		System.out.println("other testcase");
		loginLogout.login(admin.email, admin.password);
	}

	// Tests
	
	@Test(description ="Check New Admin has permission to add location")
	@Step("Press add location then fill location data")
	@Severity(SeverityLevel.NORMAL)
	public void testWhenAddLocationThenPassSucessfully() {
		System.out
				.println("LocationPagePermissionTest.testWhenAddLocationThenPassSucessfully()");
		
		// add location
		location.openLocationPage();
		location.addLocation();
		// x=6 add
		System.out.println("lebanon");
		location.locationFillData(6,"lebanon", "Beirut, Lebanon",
				"35.5017761", "33.8937919");
		Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		
		Assert.assertEquals(location.getCountry(),"Beirut, Lebanon" );

	}

	// Tests
	//here Example of passing input data through dataProvider
	@Test(dataProvider="locationData",description ="Check New Admin has permission to edit location")
	
	@Step("Press edit location then fill location data")
	@Severity(SeverityLevel.NORMAL)
	public void testWhenEditLocationThenPassSuccessfully(String countryParm,String locationParm,String longParm,String latParm) {
		System.out
				.println("LocationPagePermissionTest.testWhenEditLocationThenPassSuccessfully()");
		System.out.println(countryParm);

		// edit location
		location.editLocation();
		// x=7 edit
		location.locationFillData(7,countryParm,
				locationParm, longParm,latParm);
		Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		Assert.assertEquals(location.getCountry(),
				locationParm);
		

	}

	// Tests
	@Test(description ="Check New Admin has no permission to delete location")
	@Step("Delete location recently added")
	@Severity(SeverityLevel.CRITICAL)
	public void testWhenAdminWithNoDeletePermissionThenDeleteActionHidden()
			 {
		System.out
				.println("LocationPagePermissionTest.testWhenAdminWithNoDeletePermissionThenDeleteActionHidden()");
		Allure.addAttachment("Any text", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		Assert.assertEquals(location.getDeleteBtn().isDisplayed(), false);
		//take screenshot and log it in report
		
		

	}
	//Data driven using data porvider
	@DataProvider(name="locationData")
	public Object[][] getData()
	{
	   Object [][] myData = {{"United Arab Emirates","Dubai - United Arab Emirates","55.2707828","25.2048493"},
			   {"Turkey","Turkey","35.243322","38.963745"}};
	                         
	   return myData;
	}

}
