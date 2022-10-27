package intro1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class play4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flyairpeace.com");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Close']")));
		
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		JavascriptExecutor Js =(JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,200)");
		
		
		driver.findElement(By.xpath("(//select[@id='currency_dropdown'])[1]")).click();
		List<WebElement> currency = driver.findElements(By.tagName("option"));
		for(int i=0;i<currency.size();i++) {
			if(currency.get(i).getText().contains("US Dollar")) {
				currency.get(i).click();
				break;
			}
		}
		
		
		driver.switchTo().frame("reservation_form");
		
		driver.findElement(By.xpath("//select[@id='Origin']")).click();
		List<WebElement> From = driver.findElements(By.tagName("option"));
		for(int i=0;i<From.size();i++) {
			if(From.get(i).getText().contains("Kano (KAN)")) {
				From.get(i).click();
				break;
			}
		}
		
		
		driver.findElement(By.xpath("//select[@id='Destination']")).click();
		List<WebElement> To = driver.findElements(By.tagName("option"));
		for(int i=0;i<To.size();i++) {
			if(To.get(i).getText().contains("Lagos (LOS)")) {
				To.get(i).click();
				break;
			}
		}
	
	
		driver.findElement(By.xpath("//input[@id='departuredate']")).click();
		
		while(!driver.findElement(By.cssSelector("span[class='ui-datepicker-month']")).getText().contains("December")) 
		{
			driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-circle-triangle-e')]")).click();
		}
		
		
		List<WebElement> date = driver.findElements(By.tagName("td"));
		for(int i=0;i<date.size();i++) {
			if(date.get(i).getText().contains("9")) {
				date.get(i).click();
				break;
			}
		}
		
		
		driver.findElement(By.xpath("//input[@id='returndate']")).click();
		List<WebElement> date1 = driver.findElements(By.tagName("td"));
		for(int i=0;i<date1.size();i++) {
			if(date1.get(i).getText().contains("24")) {
				date1.get(i).click();
				break;
			}
		}
		
		
		driver.quit();
		
	}

}
