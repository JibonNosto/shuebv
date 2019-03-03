package com.bit.help;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.LoadableComponent;

public class BabyShoes extends LoadableComponent<BabyShoes> {

	private WebDriver dr;

	
	public BabyShoes(WebDriver dr) {
	
	this.dr = dr;
	
   }
	 Common c = new Common();
    
	 
	 //Pgaefactory or page repository
     @FindBy(xpath="//div[@clas='CheckboxLabel-sc-1cw16wj-0 iRrvFA']")

      WebElement checkFreeOrderPickUpBox;


      @FindBy(how = How.ID, using="search")

      WebElement checkSearchBox;
      
     @FindBy (how = How.CSS, using = ".h-margin-b-tiny:nth-child(5) > .ItemLink-sc-1eyz3ng-0")
     
     WebElement checkBabyShoes;
     
     
      




      

     public void clickFreeCheckBox() {
	
	checkFreeOrderPickUpBox.click();
	}

     
     

    public void typeCheckSearchBox() {
	
	c.myType(dr, By.id("search"), "shoes");
	
	}
    
    public void clickBabyShoes() {
    	
    	checkBabyShoes.click();
    	
    }
     
    public void verifyHomePageTitle() {
	
	c.verifyPageTitle(dr, "Target : Expect More. Pay Less.");
	
}
    
    public void verifyPageUrl() {
    	
    	c.verifyPageURL(dr, "https://www.target.com/c/baby-shoes/-/N-59aio");
    	
    }
    
    public void verifyBabyShoePageTitle() {
    	
    	c.verifyPageTitle(dr, "Baby Shoes : Infant Shoes : Target");
    }
    
   
    
    

    @Override
     protected void load() {
	
	dr.get("https://www.target.com/s?searchTerm=shoes&tref=typeahead%7Cterm%7C0%7Cshoes%7C%7C%7C%7Chistory&category=0%7CAll%7Cmatchallpartial%7Call+categories");
	System.out.println("load is excuted");
}

    @Override
    protected void isLoaded() throws Error {
	
	dr.get("https://www.target.com/s?searchTerm=shoes&tref=typeahead%7Cterm%7C0%7Cshoes%7C%7C%7C%7Chistory&category=0%7CAll%7Cmatchallpartial%7Call+categories");
	System.out.println("isLoades is excuted");
}


}


