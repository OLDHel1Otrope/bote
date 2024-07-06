 public static int binarySearchMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<end){
            if(end-start==1)return start;
            else if(arr[mid-1]<arr[mid]) start=mid;//this means that the left subtree is sorted
            else if(arr[mid-1]>arr[mid]) end=mid;
            mid=start+(end-start)/2;
        }
        return -1;
    }
