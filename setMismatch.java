    public static int[] setMismatch(int[] arr){
        int i=0;
        int repeated=-1;
        while(i<arr.length){
            if(arr[i]==i+1) i++;
            else if (arr[i]==arr[arr[i]-1]) {
                repeated = arr[i];
                i++;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[temp-1];
                arr[temp-1]=temp;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=j+1){
                return new int[]{repeated,j+1};
            }
        }
        return new int[]{-1,-1};
    }
