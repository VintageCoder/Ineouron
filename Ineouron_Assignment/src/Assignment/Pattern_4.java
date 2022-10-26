package Assignment;

public class Pattern_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<n;j++) {
				if( i>(n/2)-1 && (j<= n/2-(n-i) ||j>= n/2+(n-i))
						|| i==n-1
						|| i==n
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
