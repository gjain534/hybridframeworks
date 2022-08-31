package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

@Test(groups={"LoginPage"})
public class LoginPageTest extends BaseClass {
	
@BeforeTest
public void setup() {
	BaseClass.initialization();
}
@Test()
public void validateLoginFunctions() {
	new LoginPage().loginFunctions("Admin","admin123");
	}
@AfterTest
public void tearDown() {
	//driver.quit();
}
}

