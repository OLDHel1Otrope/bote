    public static String reverse1(int x) {
    	if(x<10)return ""+x;
    	return ""+(x%10)+reverse1(x/10);
      //returns a string
    }

    static int sum=0;
    public static void reverse2(int x) {
      //uses an external variable
    	if(x<10) {
    		sum=sum*10+x;
    		return;
    	}
    	else {
    		sum=sum*10+x%10;
    		reverse2(x/10);
    	}
    }
    
    public static int reverse3(int sum,int x) {
    	if(x<10) {
    		sum*=10;
    		sum+=x;
    		return sum;
    	}
    	else { 
    		sum=sum*10+x%10;
    		return reverse3(sum,x/10);
    	}
    }
