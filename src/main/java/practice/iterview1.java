package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iterview1 {
	
public static void main(String[] args) {
	String name= "neeta pramod Kshirsagar";
String[] eachword = name.split(" ");
String finalRevWord="";
for(String s : eachword) {
	String rev="";
	for(int i=s.length()-1; i>=0;i--) {
		rev=rev+s.charAt(i);
		
	}
	finalRevWord=finalRevWord+rev+" ";
}

	System.out.println(finalRevWord);
}
}
