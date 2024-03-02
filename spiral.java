
public class Spiral {

	public static void main(String[] args) {
		 int n=4;
		 int arr[][];
		 int armlength=1;
		 int x=n/2;
		 int y=n/2;
		 int dir=-1;
		 System.out.println(x+" "+y);
		 while(armlength<n) {
			 for(int i=0;i<armlength;i++) {
				 x+=dir;
				 System.out.println(x+" "+y);
			 }
			 for(int j=0;j<armlength;j++) {
				 y+=dir;
				 System.out.println(x+" "+y);
			 }
			 armlength++;
			 dir*=-1;
			 System.out.println("the length of the arm"+armlength+" the direction is"+dir);
		 }
		
	}

}
