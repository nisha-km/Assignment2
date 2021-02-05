package assignment2;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		int a[]= {2,5,8,9};
		int b[]= {15,3,7,12};
		int first=a.length;
		int second=b.length;
		int[] result=new int[first+second];
		System.arraycopy(a, 0, result, 0, first);
		System.arraycopy(b, 0, result, first, second);
		
		System.out.println(Arrays.toString(result));
		

	}

}
