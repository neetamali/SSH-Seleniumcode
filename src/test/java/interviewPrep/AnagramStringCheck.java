package interviewPrep;

import java.util.Arrays;

public class AnagramStringCheck {
	public static void main(String[] args) {
		String s1= "Stop";
		String s2 = "Tops";
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("strings are anagram");
		}else System.out.println("strings are not anagram");
	}

}
