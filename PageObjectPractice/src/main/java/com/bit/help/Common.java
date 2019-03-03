package com.bit.help;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
	
	//public WebDriver dr;
	//public Common (WebDriver dr) {
		
		//this.dr = dr;
		
	//}
	

	
	public void myWait(long mi) throws InterruptedException {
		Thread.sleep(mi);
	}
    
    public void myClick(WebDriver dr, By by) {
		dr.findElement(by).click();
	}
    
    public void myType(WebDriver dr, By by, String textToType) {
		dr.findElement(by).sendKeys(textToType);
	}
    
    public void verifyPageTitle(WebDriver dr, String expectedTitle) {
		boolean b = dr.getTitle().equals(expectedTitle);
		System.out.println("page title match ! " + b);
	}
    
    public void verifyPageURL(WebDriver dr, String expectedURL) {
		boolean b = dr.getCurrentUrl().equals(expectedURL);
		System.out.println("page URL match ! " + b);

	}
    
    public void verifyElementDisplay(WebElement elmdis) {
		boolean b = elmdis.isDisplayed();
		System.out.println("Element Displayed ! " + b);
	}

    public void elementDisplay(WebDriver dr , By locator) {
		dr.findElement(locator).isDisplayed();
		System.out.println("Is element displayed:" + dr.findElement(locator).isDisplayed());
	}

}
