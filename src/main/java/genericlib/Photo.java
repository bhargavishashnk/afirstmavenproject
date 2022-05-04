package genericlib;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo 
{
	public void getPhoto(WebDriver driver, String name) throws IOException
	{
		          Date d =new Date(0);
		          String currentDate=d.toString().replaceAll(":", "-");
		          
				//steps:1 typecasting
				TakesScreenshot ts=(TakesScreenshot) driver;
				
				//steps:2 access the method and store in RAM
				File src = ts.getScreenshotAs(OutputType.FILE);
				
				//Steps:3 specify the location
				File dest=new File(AutoConstant.photoPath+currentDate+name+".png");
				
				//Steps:4 copy paste from Ram to dest location
				FileUtils.copyFile(src, dest);
				
			
				
	}

}
