package Array;

public class ContainsASpecificValue {
	public static boolean contains(int a[],int item) {
		for(int i : a) {
			if(item == i) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
          int a[] = {998,2000,9000,100,300,400};
          
          System.out.println(contains(a,2015));
          System.out.println(contains(a,2000));
	}

}
