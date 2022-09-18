package intro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bglag\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    //Drop down with tag as "select". selenium has a class to manage drop down with select tag. create the object of the class
		//WebElement staticDropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		//Select dropdown = new Select(staticDropdown);
		//dropdown.selectByIndex(3);
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		//Thread.sleep(500);
		//dropdown.selectByVisibleText("AED");
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		//dropdown.selectByValue("INR");
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		//driver.close();
	    //Static dropdown to select multiple adults with for loop or while loop
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).getText());
		
		
		//For loop - (initializing; comparison; condition)
		/*for(int i=1;i<4;i++)
		{
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText());
		*/
		
		//While loop - (initializing; comparison; condition)
		int p =1;
		while(p<4)
		{
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			p++;
		}
		System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText());
		Thread.sleep(5000);
		//Using for loop to reduce the adults from 4 to 2
		for(int i=4;i>2;i--)
		{
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-minus-one-cta']")).click();
		}
		System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).getText());
		
		
		
		
		
		
	//Dynamic drop down
		/*driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[6]/div[1]/div[1]")).click();
		*/
		
		
		
		
		
		

	}
	
}
