package intro1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAndAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bglag\\Desktop\\selenium hood\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//Alerts Accept and Reject
		
		driver.findElement(By.xpath("(//input[@id='alertbtn'])[1]")).click();   //Accept
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();   //Reject
		driver.switchTo().alert().dismiss();
		
		
		
		//Scrolling
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		//Go to the page and type on the console "window.scrollBy(x,y cordinate and see if it scrolls to your desired location)
		Js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		//Lets scroll to a specific table
		//Go to console and use document.queryselector('css of the whole table you are targeting').scrollBy or SrollTop etc
		Js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		driver.close();
		
	}

}
