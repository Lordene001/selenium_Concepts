package intro1;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class play2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> Values = driver.findElements(By.xpath("//td[4]"));
		int sum = 0;
		for(int i=0;i<Values.size();i++) 
		{
			if(Values.get(i).getText().contains("Social Media"))
			{
				System.out.println("Nice Try");
				break;
			}
			else 
			{
				sum = sum + Integer.parseInt(Values.get(i).getText());
				
			}
			
		}
		String[] New = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":");
		int Total = Integer.parseInt(New[1].trim());
		
		Assert.assertEquals(sum, Total);
		driver.close();
		
		/*
		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://vbiz-dev.vfdbank.com/onboarding/register-details");
		driver.findElement(By.xpath("//span[normalize-space()='I have a registered company")).click();
		driver.findElement(By.xpath("//label[normalize-space()='BVN']")).sendKeys("12344");
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Ajmer')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Bagdogra')][1]")).click();
		List<WebElement> date = driver.findElements(By.cssSelector(".css-76zvg2 "));
		
		for(int i=0;i<date.size();i++) 
		{
			if(date.get(i).getText().contains("23")) 
			{
				date.get(i).click();
			}
		}*/
	}

}
