package pageobjects.loginlogout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.BasePage;

/**
 * 
 * Responsible of find all login - logout page elements and can be access only
 * through the [loginLogoutUtil]
 * 
 * @author shaimaa
 * 
 */
class LoginLogoutPage extends BasePage {

	

	public LoginLogoutPage(WebDriver driver) {
		super(driver);
	}

	// get login page
	public WebElement getLoginWindow() {
		return driver
				.findElement(By
						.xpath("/html/body/div[3]/main/section[2]/div/div/div[3]/div/div/div[2]/div[2]/div/div[1]/div/a"));
	}

	// get email field
	public WebElement getEmailField() {
		return driver.findElement(By.name("email"));
	}

	// get password field
	public WebElement getPasswordField() {
		return driver.findElement(By.name("password"));
	}

	// get login button
	public WebElement getLoginBtn() {
		return driver.findElement(By.xpath("/html/body/div[2]/form[1]/button"));
	}

	// get logout
	public WebElement getLogout() {
		return driver.findElement(By
				.xpath("/html/body/div[3]/div/nav/div/div[2]/ul[2]/li[2]/a"));
	}
}
