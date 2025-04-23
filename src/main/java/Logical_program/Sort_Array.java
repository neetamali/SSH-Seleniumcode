package Logical_program;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sort_Array {
	
	public static void main(String[] args) {

		int[] array =new int[] {6,3,6,8,2,4,5,8,2,0,9,3,6,8,4,7,9,1,4,6,8,5,4,3,1,8,0};
		int temp =0;
		
		
		System.out.println("original array");
		for(int i=0; i<array.length; i++)
		{
			
			System.out.println(array[i]+"");
		}
		
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i]>array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
							
				}
			}
		}

		
		System.out.println("sorted array in asc order");
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]+"");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
