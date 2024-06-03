class Solution {
    public void sortColors(int[] nums) {
        int l;
        int i=0,j=0,k=0;
        for(l=0;l<nums.length;l++){
            if(nums[l]==0)i++;
            else if(nums[l]==1)j++;
            else k++;
        }
        for(l=0;l<i;l++){
            nums[l]=0;
        }
        for(l=i;l<i+j;l++){
            nums[l]=1;
        }
        for(l=i+j;l<nums.length;l++){
            nums[l]=2;
        }
    }
//this is two pointer approach
  public static void sortx(int []arr){
        int mid=0,high=arr.length-1;
        for(int i=0;i<=high;i++){
            if(arr[i]==0){
                int temp=arr[mid];
                arr[mid]=arr[i];
                arr[i]=temp;
                mid++;
            }
            else if(arr[i]==1){
                continue;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[high];
                arr[high]=temp;
                i--;
                high--;
            }
        }
    }
}
