public static int removeDoublesTwo(int[] arr){
        int len=arr.length;
        if(len<=1) return 1;
        int current=1;
        int rep=0;
        for (int i = 1; i < len; i++) {
            if(arr[i]==arr[current-1]){
                if(rep==0){
                    rep=1;
                    arr[current]=arr[i];
                    current++;
                }
                else{
                    continue;
                }
            }
            else if(arr[i]!=arr[current-1]){
                rep=0;
                arr[current]=arr[i];
                current++;
            }
        }
        return current+1;
    }
