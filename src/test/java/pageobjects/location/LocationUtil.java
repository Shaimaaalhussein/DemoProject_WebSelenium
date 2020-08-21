package pageobjects.location;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LocationUtil {
	LocationPage location;
	public  LocationUtil(WebDriver driver){
		location=new LocationPage(driver);
	}
	
	public void openLocationPage()
	{
		location.getLocationsTab().click();
		location.getLocationTab().click();
	}
	public void addLocation()
	{
		location.getAddLocationBtn().click();
	}
	public void editLocation()
	{
		location.getEditLocationBtn().click();
	}
	public void locationFillData(int x,String Country,String locationC,String Long,String Lat)
	{
		location.getCountryDropDown().click();
		if (x==7)
		{
			
			location.getLocation().clear();
			location.getLong().clear();
			location.getLat().clear();
		}
		location.getCountrySearch(x).sendKeys(Country);
		location.getCountrySearch(x).sendKeys(Keys.ENTER);
		location.getLocation().sendKeys(locationC);
		location.getLong().sendKeys(Long);
		location.getLat().sendKeys(Lat);
		location.getSubmit().click();
	}
	
	
	// Assert Country Value after add or edit location
			public String getCountry() {
				return location.countryList().getText();
				
			}

			public WebElement getDeleteBtn() {
				return location.deleteButton();
				
			}

	
	
	

}
