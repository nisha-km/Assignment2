package assignment2;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = new int[] {11,14,2,5,4,6,8,10};  
		System.out.println("Array elements after sorting:");  
		int tmp = 0;  
		for (int i = 0; i < arr.length; i++)   
		{  
			for (int j = i + 1; j < arr.length; j++)   
			{  

				if (arr[i] > arr[j])   
				{  
					tmp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = tmp;  
				}  
			}  
			 
			System.out.print(arr[i]+" ");  
		}  
	}  
}  




