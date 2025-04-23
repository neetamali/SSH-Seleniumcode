package Logical_program;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class String_equals {

	//What will be the output of below?
	
		public static void main(String[] args) 
		{
		    String s = "ram";
		    String s1 = new String("ram");
		    String s2 = s1;
		    String s3 = "ram";
		    
		    System.out.println(s.equals(s1));
		    System.out.println(s.equals(s2));
		    
		    System.out.println(s==s1);
		    System.out.println(s==s2);
		    System.out.println(s==s3);
		}
		
		    
		
		

	

}
