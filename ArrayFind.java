package assignment2;

public class ArrayFind {

	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
		for(int i = 0; i < arr.length; i++) {  
			for(int j = i + 1; j < arr.length; j++) {  
				if(arr[i] == arr[j])  {
					System.out.println("the search element of index value is"+(i));  
					
				}  else if(arr[i]!=arr[j]) {
					System.out.println("The search element is not found : -1");
					
				}

			}
		}  
	}  
}