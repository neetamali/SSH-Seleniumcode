package interviewPrep;

public class FindFirst4andLast4Char {
	public static void main(String[] args) {
		String str = "My name is Neeta Pramod Kshirsagar";
		String firstchar = str.substring(0,4);
		System.out.println(firstchar);
		
		String lastchar = str.substring(str.length()-4, str.length());
		System.out.println(lastchar);
	}

}
