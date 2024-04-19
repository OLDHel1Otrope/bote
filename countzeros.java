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
