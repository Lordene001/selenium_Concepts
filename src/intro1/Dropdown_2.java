package intro1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bglag\\Desktop\\selenium hood\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.spicejet.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[name()='circle'])[3]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-tju18j r-5njf8e r-1otgn73']")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(3)")).click();
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(4)")).click();
		driver.findElement(By.cssSelector("div.css-1dbjc4n.r-akgwms.r-13awgt0.r-1pi2tsx.r-p1pxzi.r-sa2ff0.r-1udh08x div.css-1dbjc4n.r-1niwhzg.r-1jgb5lz.r-r0h9e2.r-13qz1uu div.css-1dbjc4n.r-14lw9ot:nth-child(1) div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6:nth-child(3) div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim:nth-child(2) div.css-1dbjc4n.r-19h5ruw.r-136ojw6:nth-child(4) div.css-1dbjc4n.r-1niwhzg.r-z2wwpe.r-17b9qp5.r-1g94qm0.r-h3f8nf.r-u8s1d.r-u3yave.r-8fdsdq:nth-child(2) div.css-1dbjc4n.r-14lw9ot.r-11u4nky.r-rs99b7.r-6koalj.r-eqz5dr.r-1pi2tsx.r-pm9dpa.r-1knelpx.r-13qz1uu:nth-child(2) div.css-1dbjc4n.r-1loqt21.r-u8s1d.r-11xbo3g.r-1v2oles.r-1otgn73.r-16zfatd.r-eafdt9.r-1i6wzkk.r-lrvibr.r-184en5c:nth-child(1) svg:nth-child(1) g:nth-child(1) > circle:nth-child(1)")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("div.css-1dbjc4n.r-akgwms.r-13awgt0.r-1pi2tsx.r-p1pxzi.r-sa2ff0.r-1udh08x div.css-1dbjc4n.r-1niwhzg.r-1jgb5lz.r-r0h9e2.r-13qz1uu div.css-1dbjc4n.r-14lw9ot:nth-child(1) div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6:nth-child(3) div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim:nth-child(2) div.css-1dbjc4n.r-19h5ruw.r-136ojw6:nth-child(4) div.css-1dbjc4n.r-1niwhzg.r-z2wwpe.r-17b9qp5.r-1g94qm0.r-h3f8nf.r-u8s1d.r-u3yave.r-8fdsdq:nth-child(2) div.css-1dbjc4n.r-14lw9ot.r-11u4nky.r-rs99b7.r-6koalj.r-eqz5dr.r-1pi2tsx.r-pm9dpa.r-1knelpx.r-13qz1uu:nth-child(2) div.css-1dbjc4n.r-1euycsn:nth-child(3) div.css-1dbjc4n.r-150rngu.r-18u37iz.r-16y2uox.r-1wbh5a2.r-lltvgl.r-buy8e9.r-1sncvnh:nth-child(2) div.css-1dbjc4n.r-18u37iz div.css-1dbjc4n.r-18u37iz:nth-child(3) div.css-1dbjc4n.r-1mdbw0j.r-ymttw5.r-b2dl2.r-mzjzbw.r-wk8lta.r-tvv088 div.css-1dbjc4n:nth-child(3) div.css-1dbjc4n.r-6koalj.r-18u37iz.r-d0pm55:nth-child(4) div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-1loqt21.r-eu3ka.r-1otgn73.r-1aockid:nth-child(7) > div.css-1dbjc4n.r-1awozwy.r-1pi2tsx.r-1777fci.r-13qz1uu")).click();
		driver.findElement(By.cssSelector("div.css-1dbjc4n.r-akgwms.r-13awgt0.r-1pi2tsx.r-p1pxzi.r-sa2ff0.r-1udh08x div.css-1dbjc4n.r-1niwhzg.r-1jgb5lz.r-r0h9e2.r-13qz1uu div.css-1dbjc4n.r-14lw9ot:nth-child(1) div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6:nth-child(3) div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim:nth-child(2) div.css-1dbjc4n.r-19h5ruw.r-136ojw6:nth-child(4) div.css-1dbjc4n.r-1niwhzg.r-z2wwpe.r-17b9qp5.r-1g94qm0.r-h3f8nf.r-u8s1d.r-u3yave.r-8fdsdq:nth-child(2) div.css-1dbjc4n.r-14lw9ot.r-11u4nky.r-rs99b7.r-6koalj.r-eqz5dr.r-1pi2tsx.r-pm9dpa.r-1knelpx.r-13qz1uu:nth-child(2) div.css-1dbjc4n.r-1euycsn:nth-child(3) div.css-1dbjc4n.r-150rngu.r-18u37iz.r-16y2uox.r-1wbh5a2.r-lltvgl.r-buy8e9.r-1sncvnh:nth-child(2) div.css-1dbjc4n.r-18u37iz div.css-1dbjc4n.r-18u37iz:nth-child(4) div.css-1dbjc4n.r-1mdbw0j.r-ymttw5.r-b2dl2.r-mzjzbw.r-wk8lta.r-tvv088 div.css-1dbjc4n:nth-child(3) div.css-1dbjc4n.r-6koalj.r-18u37iz.r-d0pm55:nth-child(4) div.css-1dbjc4n.r-1awozwy.r-14lw9ot.r-1loqt21.r-eu3ka.r-1otgn73.r-1aockid:nth-child(2) > div.css-1dbjc4n.r-1awozwy.r-1pi2tsx.r-1777fci.r-13qz1uu")).click();
		driver.findElement(By.cssSelector("div.css-1dbjc4n.r-akgwms.r-13awgt0.r-1pi2tsx.r-p1pxzi.r-sa2ff0.r-1udh08x div.css-1dbjc4n.r-1niwhzg.r-1jgb5lz.r-r0h9e2.r-13qz1uu div.css-1dbjc4n.r-14lw9ot:nth-child(1) div.css-1dbjc4n.r-14lw9ot.r-z2wwpe.r-vgw6uq.r-156q2ks.r-urutk0.r-8uuktl.r-136ojw6:nth-child(3) div.css-1dbjc4n.r-1pcd2l5.r-1uwte3a.r-m611by.r-bnwqim:nth-child(2) div.css-1dbjc4n.r-18u37iz.r-19h5ruw.r-184en5c:nth-child(5) div:nth-child(2) > div.css-1dbjc4n.r-14lw9ot.r-11u4nky.r-z2wwpe.r-1phboty.r-rs99b7.r-1loqt21.r-13awgt0.r-ymttw5.r-5njf8e.r-1otgn73")).click();
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[2]/div[2]/div[2]/div[1]/div[3]")).click();
		driver.findElement(By.xpath("//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.cssSelector("div[data-testid*='Adult-testID-plus-one-cta']")).click();
		
		//note the css and xpath used
		driver.findElement(By.cssSelector("div[data-testid*='Children-testID-plus-one-cta']")).click();
		driver.findElement(By.cssSelector("div[data-testid*='Infant-testID-plus-one-cta']")).click();
		driver.findElement(By.cssSelector("div[data-testid*='Adult-testID-minus-one-cta']")).click();
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).click();
		
		//To know if its selected or or not
		//
		System.out.println(driver.findElement(By.cssSelector("//div[contains(text(),'Family & Friends')]")).isSelected());
		driver.findElement(By.cssSelector("//div[contains(text(),'Family & Friends')]")).click();
		Thread.sleep(500);
		System.out.println(driver.findElement(By.cssSelector("//div[contains(text(),'Family & Friends')]")).isSelected());
		//driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();
		
		
		
		
		
		
		
		
		/*int p=1;
		while (p<3);
		{
			driver.findElement(By.cssSelector("div[data-testid*='Adult-testID-plus-one-cta']")).click();
			p++;
		}*/
		
			
		
		
		
	}

}
