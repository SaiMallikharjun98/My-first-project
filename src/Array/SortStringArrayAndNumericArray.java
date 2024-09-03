package Array;
import java.util.Arrays;

public class SortStringArrayAndNumericArray {

	public static void main(String[] args) {
		
		int[] arr = {11,12,13,14,1555,1322222,0};
		String[] arr1 = {"A","a","c","v","b","z"};
		
		System.out.println(Arrays.toString(arr));
		 Arrays.sort(arr);
		 System.out.println(Arrays.toString(arr));
	    System.out.println(Arrays.toString(arr1));
	    Arrays.sort(arr1);
	    System.out.println(Arrays.toString(arr1));
	}

}
