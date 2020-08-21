package actions;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class TabWindowHandleUtil {
	private WebDriver driver;

	public  TabWindowHandleUtil(WebDriver driver)
	{
          this.driver=driver;
	}
	
	public void getOtherTabWindow()
	{
	       ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
			
		    driver.switchTo().window(tabs2.get(1));
	}
	
	
	
}
