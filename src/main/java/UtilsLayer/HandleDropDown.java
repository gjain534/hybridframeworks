package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {
	public static Select sel;

	public static void selectByVisibleText(WebElement wb, String value) {
		new Select(wb).selectByVisibleText(value);
	}

	public static void selectByIndex(WebElement wb, int value) {
		new Select(wb).selectByIndex(value);
	}

	public static void selectByValue(WebElement wb, String value) {
		new Select(wb).selectByValue(value);
	}

	public static String printSelectValue(WebElement wb) {
		return new Select(wb).getFirstSelectedOption().getText();
	}

	public static void printAllDropDown(WebElement wb) {
		for (WebElement abc : new Select(wb).getOptions()) {
			System.out.println(abc.getText());
			}
				}

public static boolean printspecificvalueinDP(WebElement wb, String value) {
		for (WebElement abc : new Select(wb).getOptions()) {
			if (abc.getText().equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}

	public static int printDropDownSize(WebElement wb) {
		return new Select(wb).getOptions().size();
	}
}
