package Array;

public class AverageValueOfAnArray {

	public static void main(String[] args) {
		int a[] = {1,2,2,3,4,56,66,45,44,45,58,58,88,89,90};
		int length = a.length;
				int sum = 0;
		for(int i:a) {
			sum=sum+i;
			
		}
		double average = sum/length;
		System.out.println(average);
	}

}
