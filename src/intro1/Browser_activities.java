package intro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Browser_activities {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\bglag\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']")).click();
		
		
		/*driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.navigate().to("https://nairaland.com");
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		driver.manage().window().minimize();
		driver.close();*/
		
		
		
		
		
	}

}
