package Assignment;

public class INEURON_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<50;j++) {
				if( j==0 || j==2 || i==j-2 || j==n+1 || j==n+3 || (i==0 && j>n+3 && j<=n+6) 
						||(i==n-1 && j>n+3 && j<=n+6) ||(i==(n/2) && j>n+3 && j<=n+6)
						|| (j==n+8 ) || (j>n+8 && j<=n+11 && i==0) || (j>n+8 && j<=n+11 && i==n-1) || j==n+12
						||	(j==n+14 ) || (j>n+14 && j<=n+18 && i==n-1) || j==n+18
						|| j==n+20 || (j>20+n && j<20+n+3 && i==n/2)|| (j>20+n && j<20+n+3 && i==0) || (j==n+23 && i<=n/2) || (i>n/2 && i==j-23)
						|| (j==n+25 ) || (j>n+25 && j<=n+28 && i==0) || (j>n+25 && j<=n+28 && i==n-1) || j==n+29
						|| i==j-37 || j==n+32 || j==n+36
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
