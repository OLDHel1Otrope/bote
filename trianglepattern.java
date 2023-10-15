package package1;

public class A {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n+1;i++) {
			for(int x=n-i;x>0;x--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=1;k<2*i;k++) {
				if(i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i>0) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
