package intro1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bglag\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("blablabla");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.className("checkmark")).click();
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.id("username")).clear();
		Thread.sleep(500);
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("btn")).click();
		System.out.println(driver.findElement(By.xpath("//a[normalize-space()='ProtoCommerce']")).getText());
		driver.findElement(By.cssSelector("a[href='/angularpractice']")).click();
		driver.findElement(By.xpath("(//a[normalize-space()='Shop'])[1]")).click();
		Thread.sleep(500);
		driver.close();
	
		
		//Building css selector methods
		// 1. tagname.classname
		// 2. tagname#id
		// 3. tagname[attribute='value']
		// 4. tagname[attribute='value']:nth-child(index number of attribute) - for multiple lines with same attribute.
		
		//xpath format
		// 1. //tag[@attribue ='attribute value'] 
		// 2. ////tag[@attribue ='attribute value'][index number of attribute] - for multiple lines with same attribute.
		// 3. //tagname
		// 4. //tagname[text()='name of button']  - when you what to identify a button with it's name
		// 5. Real xpath begins with // and goes straight to the child of the html
		// 6. Absolute xpath begins with one / and starts traversing from the root where the child html is in
		
		// implicit wait 5 sec timeout (check driver. after the browser invoking)
	}

}
