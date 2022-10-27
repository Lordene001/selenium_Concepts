package intro1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringParsingTask {

	
	@Test
	public void ttp() {
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
	}
}
