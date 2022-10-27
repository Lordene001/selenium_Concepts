package intro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class selenium_intro {

	public static void main(String[] args) throws InterruptedException {
		
		//chromedriver.exe->chrome browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\bglag\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Edgedriver.exe -> Edge browser
		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//driver.get("https://nairaland.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		
		//From Locator 2 class extracted from the method
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.className("checkmark")).click();
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
		// splitting a grabbed text.
		String PasswordText = driver.findElement(By.xpath("//a[normalize-space()='ProtoCommerce Home']")).getText();
		String[] PasswordArray = PasswordText.split("C");
		String password = PasswordArray[0];
		System.out.println(password + " is the required password.");
		Assert.assertEquals(password, "Proto");
		driver.close();
		
	
	
		
		
	}

}
