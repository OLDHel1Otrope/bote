public static HashSet<Integer> recurringNumbers(int[]arr){
        HashSet<Integer> list=new HashSet<>();
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i) i++;
            else{
                if(arr[i]<n && arr[arr[i]]==arr[i]){
                    list.add(arr[i]);
                    i++;
                }
                else swap(arr,arr[i],i);
            }
        }
        return list;
    }
