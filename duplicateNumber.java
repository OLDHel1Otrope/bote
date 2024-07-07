    public static int recurringNumber(int[] arr){
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i) i++;
            else{
                if(arr[arr[i]]==arr[i])return arr[i];
                else swap(arr,arr[i],i);
            }
        }
        return -1;
    }
