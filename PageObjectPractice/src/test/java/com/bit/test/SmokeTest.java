package com.bit.test;

import org.junit.Test;

import com.bit.help.BabyShoes;
import com.bit.help.HomePage;

public class SmokeTest extends BaseTest {
	
	HomePage hp;
	BabyShoes bshoes;
	
	@Test
	
	public void something() {
		
		hp = new HomePage(dr);
		
		hp.verifyHomePageTittle();
		hp.verifyHomePageUrl();
		hp.verifyHomePageLogoDisplay();
		bshoes = hp.clickBabyShoes().get();
	}
	
	
	
	
}
