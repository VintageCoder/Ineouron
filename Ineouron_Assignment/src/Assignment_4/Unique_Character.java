package Assignment_4;

public class Unique_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "Hello";

		 str=str.toLowerCase();
		boolean flag=true;
		 for (int i = 0; i < str.length(); i++) {
	            for (int j = i + 1; j < str.length(); j++) {
	                if (str.charAt(i) == str.charAt(j)) {
	                 flag=false;
		 			break;
	                }
	            }
		 }
		 if(flag) System.out.println("All Unique");
		else System.out.println("Not Unique");
	}

}
