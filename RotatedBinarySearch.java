public static int binarySearchRotatedArray(int []arr, int target){
        int left=0;
        int right=arr.length-1;
        int mid=left+(right-left)/2;
        while(left<=right){
            if(arr[mid]==target) return mid;
            if(arr[left]<=arr[mid]){
                if(target>=arr[left]&&target<=arr[mid]) right=mid-1;
                else left=mid+1;
            }
            else if(target>=arr[mid]&&target<=arr[right]) left=mid+1;
            else right=mid-1;
            mid=left+(right-left)/2;
        }
        return -1;

    }
