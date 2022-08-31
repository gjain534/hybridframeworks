package UtilsLayer;

import org.openqa.selenium.Alert;

import BaseLayer.BaseClass;

public class AlertPopMethods extends BaseClass {
	public static Alert alt;

	public static void clickOkbutton() {
		driver.switchTo().alert().accept();
	}

	public static void clickCancelbutton() {
		driver.switchTo().alert().dismiss();
	}

	public static void sendTextinAlertBox(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public static void getAlertText() {
		driver.switchTo().alert().getText();
	}

}