package intro1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Play1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://applitools.com/cypress-vs-playwright-rematch-webinar/?utm_"
				+ "source=3rd-party&utm_medium=advertising&utm_" + "content=webinar&utm_term=220908-sanjay-selectors-"
				+ "hub&utm_campaign=220908-cypress-vs-playwright-rematch-webinar");
		driver.findElement(By.id("Email")).sendKeys("emmanuelene4@gmail.com");
		driver.findElement(By.id("FirstName")).sendKeys("Emmanuel");
		driver.findElement(By.id("LastName")).sendKeys("Ene");
		
		WebElement StaticDropdown = driver.findElement(By.xpath("//select[@id='Person_Role__c']"));
		Select SC1 = new Select(StaticDropdown);
		SC1.selectByIndex(3);
		driver.findElement(By.id("Company")).sendKeys("O1 Tech");
		WebElement StaticDropdown2 = driver.findElement(By.xpath("//select[@id='Test_Framework__c']"));
		Select SC2 = new Select(StaticDropdown2);
		SC2.selectByIndex(2);
		WebElement StaticDropdown3 = driver.findElement(By.xpath("//select[@id='Self_Report_Country__c']"));
		Select SC3 = new Select(StaticDropdown3);
		SC3.selectByValue("Nigeria");
		
		driver.findElement(By.xpath("//input[@id='Opt_In_Compliance__c']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//span/button[text()='REGISTER NOW'])")).sendKeys(Keys.ENTER);
		driver.close();
	

		
		
		
	}

}
