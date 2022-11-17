package Assignment_4;

public class Panagram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Abcdefghijklmnopqrstuvwxyz";
		str=str.toLowerCase();
		boolean flag=true;
		int [] ch= new int[256];
		for(int i=0;i<str.length();i++) {
			ch[str.charAt(i)]+=1;
			
		}
		
		for(int i=97;i<=122;i++) {
			if(ch[i]==0) {
				flag=false;
				break;
			}
		}
		if(flag) System.out.println("Panagram");
		else System.out.println("Not Panagram");

	}

}
