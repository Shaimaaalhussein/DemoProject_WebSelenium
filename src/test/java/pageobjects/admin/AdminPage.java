package pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.BasePage;

/**
 * 
 * Responsible of find all Admin page elements and can be access only through
 * the [AdminUtil]
 * 
 * @author shaimaa
 * 
 */
class AdminPage extends BasePage {


	public AdminPage(WebDriver driver) {
		super(driver);
	}

	// get Account tab
	public WebElement accountsTab() {
		return driver.findElement(By
				.xpath("/html/body/div[3]/nav/div[2]/ul/li[5]/a"));
	}

	// get Admin tab
	public WebElement adminTab() {
		return driver.findElement(By
				.xpath("/html/body/div[3]/nav/div[2]/ul/li[5]/ul/li[1]/a"));
	}

	// get Add new Admin
	public WebElement addAdmin() {
		return driver.findElement(By
				.xpath("/html/body/div[3]/div/div[2]/form/button"));
	}

	// get Admin first name
	public WebElement adminFirstName(){

		return driver.findElement(By.name("fname"));
	}

	// get Admin last name
	public WebElement adminLastName(){
       return driver.findElement(By.name("lname"));
	}

	// get Admin email
	public WebElement adminEmail(){

		return driver.findElement(By.name("email"));
	}

	// get Admin Password
	public WebElement adminPassword(){

		return driver.findElement(By.name("password"));
	}

	// get Admin Mobile
	public WebElement adminMobile(){

		return driver.findElement(By.name("mobile"));
	}

	// get Admin CountryDropdown
	public WebElement adminContryDropdown(){

		return driver
				.findElement(By
						.xpath("/html/body/div[3]/div/form/div[1]/div/div[2]/div/div[6]/div/div"));
	}

	// get Admin CountrySearch
	public WebElement adminContrySearch(){

		return driver.findElement(By.xpath("/html/body/div[6]/div/input"));
	}

	// get Admin Address
	public WebElement adminAdrress(){

		return driver.findElement(By.name("address1"));
	}

	// get Admin SubmitButton
	public WebElement adminSubmitBtn(){

		return driver.findElement(By
				.xpath("/html/body/div[3]/div/form/div[1]/div/div[3]/button"));
	}

}
