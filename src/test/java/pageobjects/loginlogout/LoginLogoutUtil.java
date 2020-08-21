package pageobjects.loginlogout;

import org.openqa.selenium.WebDriver;

public class LoginLogoutUtil {
	LoginLogoutPage loginPage;

	public LoginLogoutUtil(WebDriver driver) {
		loginPage = new LoginLogoutPage(driver);
	}

	public void loginWindow() {
		loginPage.getLoginWindow().click();
	}

	public void login(String UN, String PW) {
		loginPage.getEmailField().sendKeys(UN);
		loginPage.getPasswordField().sendKeys(PW);
		loginPage.getLoginBtn().click();
	}

	public void logout() {
		loginPage.getLogout().click();
	}

}
