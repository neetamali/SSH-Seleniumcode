package Logical_program;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SendKeys_Alternative {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "J:\\SW testing\\Automation\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, opt);
		opt.merge(dc);
		
		ChromeDriver d=new ChromeDriver(opt);

		driver.get("https://www.google.co.in/");
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].value='yamaha h2r';", searchbox);
		Thread.sleep(2000);

	}

}
