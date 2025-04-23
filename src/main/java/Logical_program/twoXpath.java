
package Logical_program;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twoXpath {
	
	//Q. How to combine two x-path??
	// by using | i.e. bitwise OR operator

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "J:\\SW testing\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://getintopc.com/");
		
		List<WebElement> ref = driver.findElements(By.xpath("//a[text()='Software Categories'] | //a[text()='Operating Systems']"));
		System.out.println(ref.size());
		Object[] ref1 = ref.toArray(); 
		for(Object w: ref1)
		{
			System.out.println(((WebElement) w).getText());
		}
		
		//OR
		
		for(int i=0; i<=ref.size()-1;i++)
		{
			System.out.println(ref.get(i).getText());
		}
		
		//how to get all elements present on webPage
//		List<WebElement> allElements = driver.findElements(By.id("page-ext"));
//		
//		for(int i=0; i<=allElements.size()-1; i++)
//		{
//			System.out.println(allElements.get(i).getText());
//		}
		

		

	}

}
