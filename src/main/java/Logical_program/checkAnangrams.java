package Logical_program;

import java.util.Arrays;

public class checkAnangrams {
public static void main(String[] args) {
	
	
	System.err.println(areAnaramsByArrays("Java","Vaja"));
}

public static boolean areAnaramsByArrays(String s1, String s2) {
	//step 1 convert string to chararray
	char[] arrs1= s1.toLowerCase().toCharArray();
	char[] arrs2 = s2.toLowerCase().toCharArray();
	Arrays.sort(arrs1);
	Arrays.sort(arrs2);
	
	return Arrays.equals(arrs1,arrs2 );
	
}
}
