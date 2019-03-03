package com.bit.help;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public class HomePage {
	
	
     public	 WebDriver dr;
 
     public HomePage(WebDriver dr) {
	 
	 this.dr = dr;
	 
	 
 }
 
     Common c = new Common();
 
     public void verifyHomePageTittle() {
	 
	 c.verifyPageTitle(dr, "Chat Id Communication Stub");
	 }
 
     public void verifyHomePageUrl() {
	 
	 c.verifyPageURL(dr,"https://www.target.com/");
 }
 
     public void verifyHomePageLogoDisplay() {
	 
	c.verifyElementDisplay(dr.findElement(By.xpath("//*[@id=\"home\"]"))); 
	 
 }
 
     public void typeInSearchBox () {
	 
	 c.myType(dr,By.xpath("//*[@id=\"search\"]"), "shoes");
 }
 
    public BabyShoes clickBabyShoes() {
	 
	 c.myClick(dr,By.xpath("//*[@id=\"mainContainer\"]/div[2]/div/div/ul/li[5]/a/div[2]"));
	 
	 return new BabyShoes (dr);
 }
 
 
 
}
