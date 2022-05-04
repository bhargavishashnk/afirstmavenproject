package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	 private WebElement searchfield;
	 
	@FindBy(xpath="//input[@value='go']")
	 private WebElement searchbtn;

	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gearsButton()
	{
		gearbtn.click();
	}
    
	public void skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}
	
	public void skillrarysearch(String courseName) {

		searchfield.sendKeys(courseName);
	 }
	 
	 public void searchclick()
	 {
		 searchbtn.click();
	 }

}
