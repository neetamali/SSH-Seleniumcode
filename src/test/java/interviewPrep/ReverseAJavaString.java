package interviewPrep;

public class ReverseAJavaString {
	public static void main(String[] args) {
		String name = "Neeta";
		char[] ch = name.toCharArray();
		String revname = "";
		for(int i=ch.length-1;i>=0;i--) {
			revname=revname+ch[i];
		}
		System.out.println(revname);
	}

}
