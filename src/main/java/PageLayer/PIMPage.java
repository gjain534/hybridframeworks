package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.HandleDropDown;

public class PIMPage extends BaseClass {
	@FindBy(xpath="//b[text()='PIM']")
	WebElement pimlink;
	
	@FindBy(id="btnAdd")
	WebElement Addbutton;
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="middleName")
	WebElement middlename;
	
	@FindBy(id="lastName")
	WebElement lastname;
	
	@FindBy(id="employeeId")
	WebElement employeeid;
	
	@FindBy(id="btnSave")
	WebElement Savebutton;
	
	@FindBy(id="personal_txtOtherID")
	WebElement otherid;
	
	@FindBy(id="personal_txtLicenNo")
	WebElement licenseno;
	
//	@FindBy(id="personal_txtNICNo")
//	WebElement ssnNo;
//	
//	@FindBy(id="personal_txtSINNo")
//	WebElement sinNo;
	
	@FindBy(id="personal_optGender_1")
	WebElement gender;
	
	@FindBy(id="personal_txtEmpNickName")
	WebElement nickName;
	
	@FindBy(id="personal_txtMilitarySer")
	WebElement military;
	
	@FindBy(id="personal_chkSmokeFlag")
	WebElement Smoker;
	
	@FindBy(id="personal_txtLicExpDate")
	WebElement licenseExp;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	WebElement selectyear;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	WebElement selectmonth;
	
	@FindBy(xpath="//a[text()='18']")
	WebElement selectdate;
	
	@FindBy(id="personal_DOB")
	WebElement dob;
	
	@FindBy(xpath="//select[@name='personal[cmbMarital]']")
	WebElement maritalstatus;
	
	@FindBy(xpath="//select[@name='personal[cmbNation]']")
	WebElement nationality;
	
	
	public PIMPage() {
PageFactory.initElements(driver,this);
}
	public void clickonpimlink() {
		pimlink.click();
	}
	public String checkPIMPage() {
		return driver.getCurrentUrl();
	}
	public void pimfunctions(String fname,String mname,String lname) {
		Addbutton.click();
		firstname.sendKeys(fname);
		middlename.sendKeys(mname);
		lastname.sendKeys(lname);
		String empid=employeeid.getAttribute("value");
		System.out.println(empid);
		Savebutton.click();
	}
	public void pimfunctions2(String otherId,String LicenseNo,String SSNno,String SINno,String Nickname,String Military) {
		Savebutton.click(); //editbutton click
		otherid.sendKeys(otherId);
		licenseno.sendKeys(LicenseNo);
//		ssnNo.sendKeys(SSNno);
//		sinNo.sendKeys(SINno);
		gender.click();
		nickName.sendKeys(Nickname);
		military.sendKeys(Military);
		Smoker.click();
		}
	public void dropdownonpimpage2() {
		licenseExp.click();
		HandleDropDown.selectByVisibleText(selectyear, "2037");
		HandleDropDown.selectByIndex(selectmonth, 9);
		selectdate.click();
		dob.click();
		HandleDropDown.selectByVisibleText(selectyear, "1993");
		HandleDropDown.selectByIndex(selectmonth, 5);
		selectdate.click();
		HandleDropDown.selectByVisibleText(maritalstatus, "Single");
		HandleDropDown.selectByValue(nationality, "82");
		//Savebutton.click();
	}
	
	
}
	
