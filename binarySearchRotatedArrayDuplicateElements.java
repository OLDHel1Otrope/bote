public static int binarySearchRotatedArrayDuplicateElements(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==target) return mid;
                if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            }
            else if(arr[start]<=arr[mid]){//checks if the left sub array is sorted
                if(arr[mid]>=target&&arr[start]<=target)end=mid-1;//checks if the element might lie in the left sub array, go to left one
                else start=mid+1;//if element dosent lie in the left sub array, go to the right one
            } else if (arr[start]>target&&arr[mid]<target)start=mid+1;
            else end=mid-1;
            mid=start+(end-start)/2;
        }
        return -1;
    }
