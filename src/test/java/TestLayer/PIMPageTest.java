package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.PIMPage;
@Test(dependsOnGroups={"HomePage"},groups={"PIMPage"})
public class PIMPageTest extends BaseClass {
	public PIMPage pim;
	@Test(priority=1)
	public void clickonpimlink() {
		pim =new PIMPage();
		pim.clickonpimlink();
	}
	@Test(priority=2)
	public void valiadateUrlPIMPage() {
		
		System.out.println("Url Available");
		Assert.assertEquals(pim.checkPIMPage().contains("pim"),true);
	}
	@Test(priority=3)
		public void validatepimfunctions() {
			pim.pimfunctions("gaurav","ravindra","jain");
		}
	@Test(priority=4)
	public void validatepimfunctions2() {
		pim.pimfunctions2("0345", "MH23BG2241","ASD1235698","6585","Tanmay","3-Year");
	}
	@Test(priority=5)
	public void validatedropdownpimpage2() {
		pim.dropdownonpimpage2();
	}
	
}
