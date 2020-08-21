package pageobjects.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.BasePage;

/**
 * 
 * Responsible of find all location page elements and can be access only through
 * the [LocationUtil]
 * 
 * @author shaimaa
 * 
 */

class LocationPage extends BasePage {

	public LocationPage(WebDriver driver) {
		super(driver);
	}

	// get add locations tab
	public WebElement getLocationsTab() {

		return driver.findElement(By
				.xpath("/html/body/div[3]/nav/div[2]/ul/li[4]/a"));
	}

	// get add location tab
	public WebElement getLocationTab() {
		return driver.findElement(By
				.xpath("/html/body/div[3]/nav/div[2]/ul/li[4]/ul/li/a"));
	}

	// get add location button
	public WebElement getAddLocationBtn(){
       return driver.findElement(By
				.xpath("/html/body/div[3]/div/div[2]/div[2]/a"));
	}

	// get edit location button
	public WebElement getEditLocationBtn(){
		return driver
				.findElement(By
						.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr/td[8]/span/a[1]/i"));
	}

	// get CountryDropDown
	public WebElement getCountryDropDown(){
		return driver
				.findElement(By
						.xpath("/html/body/div[3]/div/form/div/div[1]/div/div/div[1]/div/div/a/span[1]"));
	}

	// get CountrySearch
	public WebElement getCountrySearch(int x){
		return driver.findElement(By.xpath("/html/body/div[" + x
				+ "]/div/input"));
	}

	// get location
	public WebElement getLocation(){
		return driver.findElement(By.id("location"));
	}

	// get long
	public WebElement getLong(){
		return driver.findElement(By.id("long"));
	}

	// get lat
	public WebElement getLat(){
		return driver.findElement(By.id("lat"));
	}

	// get submit
	public WebElement getSubmit(){
		return driver.findElement(By
				.xpath("/html/body/div[3]/div/form/div/div[2]/button"));
	}
	
	public WebElement countryList() {
			return driver
					.findElement(By
							.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr/td[3]"));
		}
	public WebElement deleteButton() {
		return driver.findElement(By.id("deleteAll"));
	}
}
