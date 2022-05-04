package Scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import PomPages.CoreJavaSeleniumPage;
import PomPages.CourseOverviewPage;
import PomPages.SkillraryLoginPage;
import genericlib.BaseClass;


public class Testcase3 extends BaseClass 
{
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.skillrarysearch(pdata.getPropertyfiledata("course"));
		
		s.searchclick();
		
		CoreJavaSeleniumPage c=new CoreJavaSeleniumPage(driver);
		c.Cjsselect();
		
		CourseOverviewPage o=new CourseOverviewPage(driver);
		driverUtilities.switchFrames(driver);
		o.playbutton();
		Thread.sleep(10000);
		o.pausebutton();
		
		driverUtilities.switchBackFrames(driver);
		
		o.addwishlist();
	}

}
