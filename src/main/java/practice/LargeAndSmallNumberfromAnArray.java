package practice;

public class LargeAndSmallNumberfromAnArray {
public static void main(String[] args) {
	
		int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};
		int largenum=numbers[0];
		int smallnumber=numbers[0];
for(int i=1;i<numbers.length;i++) {
	if(largenum<numbers[i]) {
		largenum=numbers[i];
		
	}
	if(smallnumber>numbers[i]) {
		smallnumber=numbers[i];	
	}
}
System.out.println("largenum: "+largenum);
System.out.println("smallnumber: "+smallnumber);
	}
}

