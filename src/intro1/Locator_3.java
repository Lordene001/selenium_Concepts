package intro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bglag\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://34.89.153.60/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[7]")).click();
		
		//Sibling - child to parent traverse (it basically has to do with the tags)
		// 1. traversing from parent to child
		        //header/div/button[1]
		// 2. parent to child to sibling
				//header/div/button[1]/following-sibling::button[1]
		// 3. Traversing from child to parent
		        //header/div/button[1]/parent::div
		// 4. Traversing from child to parent to grandparent
                //header/div/button[1]/parent::div/parent::header
		
		
		
	}

}
