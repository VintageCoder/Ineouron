package Assignment_4;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Moom";
		str=str.toLowerCase();
		boolean flag=true;
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i)==str.charAt(str.length()-i-1))) {
				flag = false;
				break;
			}
		}
		if(flag) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");

	}

}
