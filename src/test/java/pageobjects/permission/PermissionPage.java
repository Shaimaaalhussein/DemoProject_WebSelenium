package pageobjects.permission;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageobjects.BasePage;

/**
 * 
 * Responsible of find all Permission page elements and can be access only
 * through the [permissionUtil]
 * 
 * @author shaimaa
 * 
 */

public class PermissionPage extends BasePage {

	public PermissionPage(WebDriver driver){
		super(driver);
	}

	// get edit admin pageA
	public WebElement getEditAdmin(){
		return driver
				.findElement(By
						.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr/td[8]/span/a[1]/i"));
	}

	// get add location permission
	public WebElement getAddLocationPerm(){
     return driver
				.findElement(By
						.xpath("/html/body/div[3]/div/form/div[2]/div/div[2]/div[3]/div[1]/div/div[2]/ul/li[6]/label/input"));
	}

	// get Edit location permission
	public WebElement getEditLocationPerm(){
		return driver
				.findElement(By
						.xpath("/html/body/div[3]/div/form/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/ul/li[6]/label/input"));
	}

	// get Submit
	public WebElement getSubmitBtn(){

		return driver.findElement(By
				.xpath("/html/body/div[3]/div/form/div[1]/div/div[3]/button"));
	}

}
