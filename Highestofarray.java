package guvi;

import java.util.Arrays;

public class Highestofarray {
public static void main(String[] args) {
	 int iArr[] = {2, 1, 9, 6, 4};
	   Arrays.sort(iArr);
	   System.out.println("The sorted int array is:");
	   for (int number : iArr) {
	   System.out.println("Number = " + number);
	   }
	   System.out.println("the lowest number in an array is"+iArr[0]);
	   System.out.println("the highest number in an array is"+iArr[iArr.length-1]);
}
}


