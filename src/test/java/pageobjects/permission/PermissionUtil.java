package pageobjects.permission;
import org.openqa.selenium.WebDriver;




public class PermissionUtil {
	PermissionPage permission;
	public  PermissionUtil(WebDriver driver)
	{
		permission=new PermissionPage(driver);
	}
	
	//Add location permission for add or edit only
	public void locationPermission()

	{	
		permission.getEditAdmin().click();
		permission.getAddLocationPerm().click();
		permission.getEditLocationPerm().click();
		permission.getSubmitBtn().submit();
		
	}
	
	
	
	
	

}
