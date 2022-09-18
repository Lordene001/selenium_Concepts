package intro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// If you have sets or blocks of code you want to reuse in this class or any other class , you can
//create a method and create an object of the class where that method is and use it.
// You don't create method in the executable block
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bglag\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		MethodsDemo d = new MethodsDemo();
		d.getdata();
		
		String myname = d.getdata1();
		System.out.println(myname);
		
		storedata1();
		
	
		
	
		
		//Invoke Iv = new Invoke();
		//Iv.calldriver();
		
		
		
		
		
	}
// (void - method return nothing, if it returns String it will be String, int - integer.
// generally the returned data type.)
// If you change it from public to private, it cannot be accessed by any other class.
	public void getdata()
	{
		System.out.println("Hello World");
	}
	
	public String getdata1()
	{
		System.out.println("What's my name");
		return "Master Jesse";
	}
	
	public static void storedata1()
	//If you add static to the public void, you can call the method without an object
	{
		System.out.println("Hi Selenese");
	}
	

	
	
}
