package mavenFirstproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintest2 
{
	@Test
	public void login1(){
		 System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();// browser open
		driver.get("file:///C:/Program%20Files/Selelium%20Software/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
	
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
        driver.close();
	
	}
	}


