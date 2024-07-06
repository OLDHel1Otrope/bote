public static int pivotRotatedArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        if(arr[start]<arr[end]) return -1; //this means the array is sorted therefore there is no pivot element
        while(start<end){
            if(end-start==1) return start;
            else if(arr[start]>arr[mid]) end=mid;
            else if(arr[start]<arr[mid]) start=mid;
            mid=start+(end-start)/2;
        }
        return -1;
    }
