package mavenFirstproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logintest 
{
	
	@Test
	
	public void login(){
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();// browser open
		driver.get("file:///C:/Program%20Files/Selelium%20Software/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();;
		
		 driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("123456");
	        driver.findElement(By.xpath("//button")).click();
	       Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	       driver.close();
	}

}
