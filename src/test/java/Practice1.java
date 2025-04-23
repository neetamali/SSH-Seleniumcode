import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice1 {
public static void main(String[] args) {
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.hyrtutorials.com/");
	driver.manage().window().maximize();
	WebElement sele_pract = driver.findElement(By.xpath("//div[@id='LinkList210']/ul/li[]"));
	Actions act= new Actions(driver);
	act.moveToElement(sele_pract).perform();
	driver.findElement(By.linkText("XPath Practice")).click();
	
	driver.close();
	
}
}
