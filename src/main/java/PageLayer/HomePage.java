package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//img[@alt='OrangeHRM']")
	WebElement logo;
	
	public HomePage() {
    	PageFactory.initElements(driver,this);
    }
    public boolean checkHomePageLogo() {
    	return logo.isDisplayed();
    }
	public String getCurrentUrlHome() {
		return driver.getCurrentUrl();
	}
public String getTitleHome() {
	return driver.getTitle();
}

}



