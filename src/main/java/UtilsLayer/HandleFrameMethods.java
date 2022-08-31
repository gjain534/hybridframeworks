package UtilsLayer;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleFrameMethods extends BaseClass {

	public static void switchtoFrameByIndex(int value) {
		driver.switchTo().frame(value);
	}
	public static void switchtoFrameByName(String value) {
		driver.switchTo().frame(value);
	}
	public static void switchtoFrameByWebElemet(WebElement wb) {
		driver.switchTo().frame(wb);
	}
	public static void switchtoTopFrame() {
		driver.switchTo().defaultContent();
	}
	public static void switchtoParentFrame() {
		driver.switchTo().parentFrame();
	}
}
