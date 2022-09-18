package intro1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDownWithOutSelectTag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://babbangona.zohorecruit.com/candidateportal?register=true");
		
		driver.findElement(By.xpath("(//lyte-icon[@class='dropdown'])[1]")).click();
		List <WebElement> Respect = driver.findElements(By.xpath("//lyte-drop-item[contains(@class,'picklist_values')]"));
		
		for(int i=0;i<Respect.size();i++) 
		{
			if(Respect.get(i).getText().contains("Mrs.")) 
			{
				Respect.get(i).click();
				break;
			}
		}
		
		
	}

}
