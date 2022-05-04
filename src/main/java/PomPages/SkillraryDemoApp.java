package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp 
{
  @FindBy(id="course")
  private WebElement coursetb;
  
  @FindBy(xpath="(//a[text()='Selenium Training'])[1]")
  private WebElement seleniumtraining;
  
  @FindBy(name="addresstype")
  private WebElement addressad;
  

public SkillraryDemoApp(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
  
  public WebElement getCoursetb() {
	return coursetb;
}

public void seleniumtrainingbtn()
  {
	  seleniumtraining.click();
  }

public WebElement getAddressad() {
	return addressad;
}

}
