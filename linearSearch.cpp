    bool linearSearch(int arr[],int size,int flag ){
        bool x=false;
        for(int i=0;i<size;i++){
            if(arr[i]==flag){
                x=true;
            }
        }
        cout<<x;
        return x;
    }
