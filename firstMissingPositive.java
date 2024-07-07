   public static int firstMissingPositive(int[] arr){
        int i=0;
        int l=arr.length;
        while(i<l){
            if(arr[i]<0||arr[i]>=l)i++;
            else if(arr[i]==i) i++;
            else if (arr[i]>=0) {
                swap(arr,arr[i],i);
            }
        }
        for (int j = 1; j < arr.length; j++) {
            if(arr[j]<0) return j;
        }
        return arr[0]==0?l:0;
    }
