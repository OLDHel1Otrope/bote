    public static void move(int []arr){
        int len=arr.length;
        int marker=0;
        for(int i=0;i<len;i++){
            if(arr[i]!=0){    
                arr[marker++]=arr[i];
            }
        }
        System.out.println(marker);
        for(int i=marker;i<len;i++){
            arr[i]=0;
        }
    }
