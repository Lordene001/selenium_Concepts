package intro1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bglag\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		String username = "rahulshettyacademy";
		String pw ="learning";
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(pw);
		driver.findElement(By.className("checkmark")).click();
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//a[normalize-space()='ProtoCommerce']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//a[normalize-space()='ProtoCommerce']")).getText(), "ProtoCommerce");
		Assert.assertEquals(driver.findElement(By.cssSelector("h1[class='my-4']")).getText(), "Shop Name");
		driver.findElement(By.xpath("//app-card[4]//div[1]//div[2]//button[1]")).click();
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("#exampleInputEmail1")).clear();
		driver.findElement(By.cssSelector("#exampleInputEmail1")).sendKeys("3");
		driver.findElement(By.cssSelector("button[class='btn btn-danger']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[normalize-space()='Shop']")).click();
		driver.findElement(By.xpath("//app-card[4]//div[1]//div[2]//button[1]")).click();
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		driver.findElement(By.cssSelector("#exampleInputEmail1")).clear();
		driver.findElement(By.cssSelector("#exampleInputEmail1")).sendKeys("3");
		//System.out.println(driver.findElement(By.cssSelector("span[class='text-success'] strong")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("span[class='text-success'] strong")).getText(), "In Stock");
		driver.findElement(By.cssSelector("button[class='btn btn-default']")).click();
		driver.findElement(By.xpath("//app-card[4]//div[1]//div[2]//button[1]")).click();
		driver.findElement(By.cssSelector("body > app-root:nth-child(1) > app-shop:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > app-card-list:nth-child(2) > app-card:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(1)")).click();
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("(//strong[contains(text(),'In Stock')])[2]")).getText(), "In Stock");
		driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Nigeria");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("label[for='checkbox2']")).click();
		driver.findElement(By.cssSelector("input[value='Purchase']")).click();
		Thread.sleep(500);
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText(), driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		driver.close();
		
		
		
		
		
		
		
		
		//Adding a class to extract text from a web page and split the the text into smaller unit to get a single or multiple text.
		
	}
	public String getPassword(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.className("checkmark")).click();
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
		String PasswordText = driver.findElement(By.xpath("//a[normalize-space()='ProtoCommerce Home']")).getText();
		String[] PasswordArray = PasswordText.split(" ");
		String password = PasswordArray[0];
		return password;
		
		
		
	}

}
