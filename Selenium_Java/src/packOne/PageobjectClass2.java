package packOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageobjectClass2 {
	@FindBy(id="email") WebElement id;
	@FindBy (id="pass") WebElement pwd;
	@FindBy (xpath="//input[@id='u_0_b']") WebElement login;
	
	
	
	
	
	

}
