package Assignment_4;

public class Anagram_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="A gentleman";
		String str2="Elegant man";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		int [] ch= new int[256];
		for(int i=0;i<str1.length();i++) {
			ch[str1.charAt(i)]+=1;
		}
		for(int i=0;i<str2.length();i++) {
			ch[str1.charAt(i)]-=1;
		}
		boolean flag =true;
		for(int i=0;i<256;i++) {
			if(ch[i]!=0) {
				flag = false;
				break;
			}
		}
		if(flag) System.out.println("Anagram");
		else System.out.println("Not Anagram");
	}

}
