	public static int countzeros(int val) {
		return  (count(val,0));
	}
	
	private static int count(int val, int count) {
		if(val==0) { 
			return count;}
		else {
			if(val%10==0) {
				count++;
			}
			return count(val/10,count);
		}
	}


	public static int stepcount(int val, int count) {
		if(val==1) return count;
		return val%2==0?stepcount(val/2,count+1):stepcount(val-1,count+1);
	}

