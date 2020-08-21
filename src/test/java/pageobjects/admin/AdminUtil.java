package pageobjects.admin;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import testdata.Admin;

public class AdminUtil {
	AdminPage newAdmin;

	public AdminUtil(WebDriver driver) {
		newAdmin = new AdminPage(driver);
	}

	// Open add new admin window
	public void addNewAdminWindow() {
		newAdmin.accountsTab().click();
		newAdmin.adminTab().click();
		newAdmin.addAdmin().click();

	}

	public void newAdminFillData(Admin admin) {
		newAdmin.adminFirstName().sendKeys(admin.fName);
		newAdmin.adminLastName().sendKeys(admin.lName);
		newAdmin.adminEmail().sendKeys(admin.email);
		newAdmin.adminPassword().sendKeys(admin.password);
		newAdmin.adminMobile().sendKeys(admin.mobile);
		newAdmin.adminContryDropdown().click();
		newAdmin.adminContrySearch().sendKeys(admin.country);
		newAdmin.adminContrySearch().sendKeys(Keys.ENTER);
		newAdmin.adminAdrress().sendKeys(admin.address);
		newAdmin.adminSubmitBtn().submit();
	}

}
