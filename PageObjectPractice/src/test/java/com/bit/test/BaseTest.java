package com.bit.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseTest {
	
	public  WebDriver dr;
	
	@Before
	
	 public void openBrowser() throws IOException {
		
		FileInputStream fl = new FileInputStream("abc.propertoes");
		Properties p = new Properties ();
		
		p.load(fl);
		
		//to read any key value from the properties file
		String b = p.getProperty("browser");
		
		//String b = System.getProperty("browser");
		System.setProperty("webdriver.gecko.driver", "/Users/mac/Downloads/chromedriver/");
		
		if(b.equals("firefox")) {
			System.out.println("firefox.....");
			System.setProperty("webdriver.firefox.driver", "/Users/mac/Downloads/chromedriver/");
			dr = new FirefoxDriver();
		}
		else if(b.equals("chrome")) {
			System.out.println("chrome......");
			System.setProperty("webdriver.chorme.driver", "/Users/mac/Downloads/chromedriver/");
			dr = new ChromeDriver();
			
		}
		else if (b.equals("safari")) {
			System.out.println("safari.....");
			System.setProperty("webdriver.safari.driver", "/Users/mac/Downloads/chromedriver/");
			dr = new SafariDriver();
		}
		
		else if (b.equals("InternetExplorer")) {
			System.out.println("internetexplorer.....");
			System.setProperty("webdriver.internetexplorer.driver", "/Users/mac/Downloads/chromedriver/");
			dr = new InternetExplorerDriver();
			
		}
		else {
			
			System.out.println("Chrome from else Statement");
			System.setProperty("webdriver.chorme.driver", "/Users/mac/Downloads/chromedriver/");
			dr = new ChromeDriver();
			
		}
		
		dr.get(p.getProperty("site"));	
   }
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		
	}

}
