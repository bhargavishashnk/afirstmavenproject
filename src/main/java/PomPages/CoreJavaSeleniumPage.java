package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaSeleniumPage 

{
	@FindBy(xpath=" //a[text()=' Core Java For Selenium Trainin']")
	private WebElement Cjscourse;
	
	public CoreJavaSeleniumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Cjsselect()
	{
		Cjscourse.click();
	}

}
