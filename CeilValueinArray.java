public class CeilArray {
    public static int ceilValuse(int arr[], int key){
        int x=0;
        int left=0;
        int right=arr.length-1;
        if(key>arr[right]) return -1;
        int mid=left+(right-left)/2;
        while(left<right){
            if(arr[mid]==key) return arr[mid];
            if(arr[mid]>key) right=mid-1;
            if(arr[mid]<key) left=mid+1;
            mid=left+(right-left)/2;
        }
        return arr[right];
    }
    public static void main(String[] args) {
        int x[]={3,5,6,7,11,20,33,554,6463};
        System.out.println(ceilValuse(x, 6463));
    }
}
