import java.awt.Desktop.Action;
import java.security.Key;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String search = "images mobile";
		driver.findElement(By.className("gLFyf")).sendKeys(search);
		Thread.sleep(1000);
		List<WebElement> listsearchopt = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		for(WebElement ele :listsearchopt ) {
			if(ele.getText().equals(search)) {
				ele.click();
				break;
			}
		}
		
		//driver.findElement(By.id("platop0_pvrjZ5_4Mc-N4-EPj-v_6A8_32")).click();
	}
}
