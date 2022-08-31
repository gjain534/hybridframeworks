package TestLayer;



import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

@Test(dependsOnGroups={"LoginPage"},groups={"HomePage"})
public class HomePageTest extends BaseClass {
	public HomePage homepage;
	@Test(priority=1)
	public void validateHomePageLogo() {
		homepage=new HomePage();
		Assert.assertTrue(homepage.checkHomePageLogo());
		System.out.println("Logo Available");
	}
	@Test(priority=2)
	public void validateTitleHompePage() {
		System.out.println("Title Available");
		Assert.assertEquals(homepage.getTitleHome(),"OrangeHRM");
	}
	@Test(priority=3)
	public void valiadateUrlHomePage() {
		System.out.println("Url Available");
		Assert.assertEquals(homepage.getCurrentUrlHome().contains("hrm"),true);
	}

	

}
