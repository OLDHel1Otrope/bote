
public class Bitoperations {
	
	public static boolean isOdd(int n) {
		return (n&1)==1;
	}
	//there are two occurences of multiple elements and a single occurance of one element
  //to find that one single element
	public static int singleElement(int n[]) {
		int k=n.length;
		int val=0;
		for(int i=0;i<k;i++) {
			val^=n[i];
		}
		return val;
	}

  //find whether the ith bit is set or not
	public static boolean ithbit(int number,int bitval) {
		int x=(int)Math.pow(2, bitval);
		System.out.println(x);
		return (number&x)==number;
		//or n&(1<<(n-1)) this will return integer value
	}

  //to find the position of the right most set bit
	public static int posRight1(int n) {
		return n&(-n);
	}

  //nth magic number
	public static int nthMagicNO(int n) {
		int sum=0;
		int base=5;
		
		while(n>0) {
			sum+=(n&1)*base;
			n=n>>1;
			base=base*5;
		}
		return sum;
	}

  //numbet of digits in a given number in base 2
	public static int noDigits(int n) {
		int base=10;
		return (int)(Math.log(n)/Math.log(base))+1;
	}


  //find a^b
	public static long expo(int a,int b) {
		long ans=1;
		long base=a;
		
		while(b>0) {
			if((b&1)==1) {
				ans*=base;
			}
			base*=base;
			b>>=1;
		}
		return ans;
	}

  //reversing and flipping the bit image of a 2D array
	public static void reverseArray(int [][]n,int len, int bre) {
		int temp;
		for(int i=0;i<len;i++) {
			for(int j=0;j<=bre/2;j++) {
				temp=1^n[i][j];
				n[i][j]=1^n[i][bre-j-1];
				n[i][bre-j-1]=temp;
			}
		}
	}

	public static void main(String[] args) {
		//System.out.println(isOdd(42));
		//int[]n= {3,3,4,4,5,6,5,6,1};
		//System.out.println(singleElement(n));
		//System.out.println(ithbit(1,0));
		//System.out.println(posRight1(40));
		//System.out.println(nthMagicNO(5));
		//System.out.println(noDigits(1030));
		//System.out.println(expo(3,2));
		int array[][]= {
				{1,1,0},
				{1,1,1},
				{0,1,0}
		};
		reverseArray(array,3,3);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
