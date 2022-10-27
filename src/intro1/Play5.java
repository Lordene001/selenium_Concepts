package intro1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;

public class Play5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://altbank-admin-frontend-qa.sterlingapps.p.azurewebsites.net/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Oniije");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Johnmyles07#");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your mToken']")).sendKeys("1234");
		
		//TakeScreenShot
		//You will have to download and add the jar to your buildpath in cases were you can't import FileUtils
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\bglag\\screenshot\\screenshot1.png"));
		
	}

}
