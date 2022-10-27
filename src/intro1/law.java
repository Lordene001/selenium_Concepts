package intro1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class law {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://spiceclub.spicejet.com/signup");
		
		
		//Using select class for the title
		WebElement Title = driver.findElement(By.cssSelector("select[class='form-control form-select ']"));
		Select select = new Select(Title);
		//select.selectByIndex(0);
		//select.selectByValue("Ms");
		select.selectByVisibleText("Mr");
		
		
		//First And Middle Name
		driver.findElement(By.cssSelector("#first_name")).sendKeys("Mark Song");
		
		//Last Name
		driver.findElement(By.cssSelector("#last_name")).sendKeys("Lord");
		
		//Country
		driver.findElement(By.cssSelector("select[class='form-control form-select']")).click();
		List<WebElement> Country = driver.findElements(By.tagName("option"));
		
		for(int i=0;i<Country.size();i++) {
			if(Country.get(i).getText().contains("Haiti")) {
				Country.get(i).click();
				break;
			}
		}
		
		
		//Phone number
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='+91 01234 56789']")).sendKeys("1");
		Robot RB = new Robot();
		RB.keyPress(KeyEvent.VK_CONTROL);
		RB.keyPress(KeyEvent.VK_A);
		RB.keyRelease(KeyEvent.VK_CONTROL);
		RB.keyRelease(KeyEvent.VK_A);
		RB.keyPress(KeyEvent.VK_DELETE);
		RB.keyRelease(KeyEvent.VK_DELETE);
		driver.findElement(By.xpath("//input[@placeholder='+91 01234 56789']")).sendKeys("+234 8162435897");
		
		
		//Date of birth
		//Month
		driver.findElement(By.cssSelector("#dobDate")).sendKeys(" ");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".react-datepicker__month-select")).click();
		List<WebElement> Month = driver.findElements(By.tagName("option"));
		for(int i=0;i<Month.size();i++) {
			if(Month.get(i).getText().contains("August")) {
				Month.get(i).click();
				break;
			}
		}
		
		
		//Year
		driver.findElement(By.cssSelector(".react-datepicker__year-select")).click();
		List<WebElement> Year = driver.findElements(By.tagName("option"));
		for(int i=0;i<Year.size();i++) {
			if(Year.get(i).getText().contains("1996")) {
				Year.get(i).click();
				break;
			}
		}
		
		
		//Day
		List<WebElement> day = driver.findElements(By.cssSelector(".react-datepicker__day"));
		
		for(int i=0;i<day.size();i++) {
			if(day.get(i).getText().contains("21")) {
				day.get(i).click();
				break;
			}
		}
		
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0,500)");
		
		//Email
		driver.findElement(By.cssSelector("#email_id")).sendKeys("law@gmail.com");
		
		//Password
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#new-password")).sendKeys("Abc1234@password");
		
		
		//Confirm Password
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#c-password")).sendKeys("Abc1234@password");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#new-password")).sendKeys("Abc1234@password");
		
		
		//Terms
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#defaultCheck1")).click();
		
		//Submit
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		
		
		
		
		/*
		 driver.findElement(By.cssSelector("select[class='form-control form-select ']")).click();
		 List<WebElement> Title = driver.findElements(By.tagName("option"));
		
		for(int i=0;i<Title.size();i++) {
			if(Title.get(i).getText().contains("Mrs")) {
				Title.get(i).click();
				break;
			}
		}
		*/

		
	}

}
