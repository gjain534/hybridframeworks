package UtilsLayer;

import java.util.Set;

import BaseLayer.BaseClass;

public class HandleWindowsMethods extends BaseClass {

	public static String handleTwowindows(String parent, Set<String> allwindow) {
		for (String a : allwindow) {
			if (!(a.equals(parent))) {
				driver.switchTo().window(a);
				return driver.getWindowHandle();
			}
		}
		return null;
	}
	public static String handleThreewindows(String parent,String secondwindow, Set<String> allwindow) {
		for (String a : allwindow) {
			if (!(a.equals(parent))&&(!(a.equals(secondwindow)))) {
				driver.switchTo().window(a);
				return driver.getWindowHandle();
			}
		}
		return null;
	}
	public static String handleFourwindows(String parent,String secondwindow,String thirdwindow, Set<String> allwindow) {
		for (String a : allwindow) {
			if (!(a.equals(parent))&&(!(a.equals(secondwindow)))&&(!(a.equals(thirdwindow)))) {
				driver.switchTo().window(a);
				return driver.getWindowHandle();
			}
		}
		return null;
	}
	
}
