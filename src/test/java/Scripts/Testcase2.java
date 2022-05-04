package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import PomPages.SkillraryDemoApp;
import PomPages.SkillraryLoginPage;
import PomPages.Testingpage;
import genericlib.BaseClass;

public class Testcase2 extends BaseClass
{
   @Test
   public void tc2() throws IOException
   {
	   SkillraryLoginPage s=new SkillraryLoginPage(driver);
	   s.gearsButton();
	   s.skillrarydemoapplication();
	   
	   SkillraryDemoApp sd =new SkillraryDemoApp(driver);
	   driverUtilities.switchingTabs(driver);
	   driverUtilities.dropdown(sd.getAddressad(), pdata.getPropertyfiledata("dropdowndata"));
	   
	   Testingpage t=new Testingpage(driver);
	   driverUtilities.draganddrop(driver, t.getSeleniumtraining(), t.getCart());
	   Point loc = t.getCart().getLocation();
	   int x=loc.getX();
	   int y=loc.getY();
	   
	   driverUtilities.scrollBar(driver, x, y); 
	   
   }
	
}
