package intro1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		// performing mouse and keyboard actions with actions class
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions actions = new Actions(driver);
		WebElement Foo = driver.findElement(By.cssSelector("#nav-link-accountList"));
		actions.moveToElement(Foo).build().perform();
	
		
		//Switchich from parent to child tab
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> IT = windows.iterator();
		String ParentID = IT.next();
		String ChildID = IT.next();
		System.out.println(driver.switchTo().window(ParentID).getTitle());
		
		// Switch to frame
		driver.switchTo().frame("id OR name");
		
		
		// uploading a document
		Robot RB = new Robot();
		StringSelection SS = new StringSelection("path of file you wish to upload");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);
		RB.keyPress(KeyEvent.VK_CONTROL);
		RB.keyPress(KeyEvent.VK_V);
		RB.keyRelease(KeyEvent.VK_CONTROL);
		RB.keyRelease(KeyEvent.VK_V);
		RB.keyPress(KeyEvent.VK_ENTER);
		RB.keyRelease(KeyEvent.VK_ENTER);
		
	

	}

}
