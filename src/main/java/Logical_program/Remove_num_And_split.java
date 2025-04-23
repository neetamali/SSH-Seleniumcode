package Logical_program;

public class Remove_num_And_split {

	public static void main(String[] args) {

		String s1="java string split method by javatpoint";
		
//		String s2 = s1.replaceAll("[^a-zA-Z]", "");
//		System.out.println(s2);
//		
		String ref = " "; //1 way
		
		String[] words = s1.split(ref);
		String[] words1 = s1.split("\\s"); //2 way
		//System.out.println(s3);
		
		for(Object o: words)
		{
			System.out.println(o);
		}

	}

}
