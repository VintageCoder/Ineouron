package Assignment;

public class Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if( (j<=n/2-i && i<=n/2) || (j<=i-n/2 && i>=n/2)
						|| i==0 || i==n-1
						) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			}
	}

}
