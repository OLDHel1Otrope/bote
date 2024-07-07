public static HashSet<Integer> recurringNumbers(int[]arr){
        //all the numbers from o to need to be there in the array, otherwise it wont work
        //working on a better solution
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
