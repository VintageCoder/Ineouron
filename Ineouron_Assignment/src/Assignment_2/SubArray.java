package Assignment_2;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {12,3,5,6,7,8,9,7};
		int arr2[]= {5,6,17,8,9,7};
		boolean flag=true;
		int m=arr1.length;
		int n=arr2.length;
		int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (arr2[i] == arr1[j])
                    break; 	
            if (j == m)
                flag= false;
        }
 
        if(flag) {
        	System.out.println("Yes");
        }else {
        	System.out.println("No");
        }
	}

}
