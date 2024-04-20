	public static boolean checkSorted(int[] arr,int i) {
		if(i==arr.length-1) return true;
		return arr[i]<=arr[i+1]&&checkSorted(arr,i+1);
	}
	public static boolean linearSearch(int[] arr,int i,int target) {
		if(i==arr.length) return false;
		if(arr[i]==target) {
			System.out.println("value found at index "+i);return true;
		}
		return linearSearch(arr,i+1, target);
	}
	public static boolean linearSearch2(int[] arr,int i,int target) {
		if(i==arr.length) return false;
		return arr[i]==target||linearSearch2(arr,i+1,target);
	}
	
