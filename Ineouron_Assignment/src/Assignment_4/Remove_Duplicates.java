package Assignment_4;

public class Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Momon";
		String str=input.toLowerCase();
		int [] alp= new int[256];
		String result="";
		for (int i=0;i<str.length();i++) {
			if (alp[str.charAt(i)]==0) {
				result+=input.charAt(i);
				alp[str.charAt(i)]+=1;
			}
		}
		System.out.println(result);
	}

}
