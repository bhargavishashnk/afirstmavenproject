package Scripts;


import org.testng.annotations.Test;

import PomPages.AddtoCart;
import PomPages.SkillraryDemoApp;
import PomPages.SkillraryLoginPage;
import genericlib.BaseClass;

public class Testcase extends BaseClass

{
	@Test
	public void tc1()
	{

		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillrarydemoapplication();
		
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driverUtilities.switchingTabs(driver);
		driverUtilities.mouseHove(driver, sd.getCoursetb());
		sd.seleniumtrainingbtn();
		
		AddtoCart a =new AddtoCart(driver);
		driverUtilities.doubleclick(driver, a.getAdd());
		a.addtocart();
	}
	

}
