package UtilsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClassMethods extends BaseClass {

		public static void clickOnElement(WebElement wb) {
		new Actions(driver).click(wb).build().perform();
	}
	public static void rightClickonElement(WebElement wb) {
		new Actions(driver).contextClick(wb).build().perform();
	}
	public static void doubleClickOnElement(WebElement wb) {
		new Actions(driver).doubleClick(wb).build().perform();
	}
	public static void dragAndDropmethod(WebElement source, WebElement target) {
		new Actions(driver).dragAndDrop(source,target).build().perform();
	}
	public static void mouseOverOnElement(WebElement wb) {
		new Actions(driver).moveToElement(wb).build().perform();
	}
	public static void mouseOverOnElementandClick(WebElement wb,WebElement wb2) {
		new Actions(driver).moveToElement(wb).click(wb2).build().perform();
	}
	public static void clickAndHold(WebElement wb) {
		new Actions(driver).clickAndHold(wb).build().perform();
	}
	public static void releaseElement(WebElement wb) {
		new Actions(driver).release(wb).build().perform();
	}
	public static void enterValueinTextbox(WebElement wb,String value) {
		new Actions(driver).sendKeys(wb,value).build().perform();
	}
	public static void enterDatainUpperCase(WebElement wb,String value) {
		new Actions(driver).keyDown(Keys.SHIFT).sendKeys(wb,value).keyUp(Keys.SHIFT).build().perform();
	}
	public static void copyTextFromTextBox(WebElement wb) {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(wb, "a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	}
	public static void pasteTextInTextBox(WebElement wb) {
		new Actions(driver).keyDown(Keys.CONTROL).sendKeys(wb, "v").keyUp(Keys.CONTROL).build().perform();
	}




	
}
