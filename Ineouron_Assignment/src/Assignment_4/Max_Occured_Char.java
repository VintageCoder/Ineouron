package Assignment_4;

public class Max_Occured_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello Java";
		str=str.toLowerCase();
		int [] ch= new int[256];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				ch[str.charAt(i)]+=1;
			}
		}
		int mx=0;
		for(int i=0;i<256;i++) {
			if(ch[i]>mx) {
				mx=ch[i];
			}
		}
		System.out.println("Max Rapeating Character's : ");
		for(int i=0;i<256;i++) {
			if(ch[i]==mx)
			System.out.println((char)i);
		}
			
			

	}

}
