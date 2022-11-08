package Assignment_2;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] arr = new int [] {1,1,2,5,6,7,8,9,9};   
          
	        System.out.println("Duplicate : ");  
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	  

	}

}
