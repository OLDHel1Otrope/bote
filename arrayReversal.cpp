void arrayReversal(int arr[], int size){
    int temp;
    int odd=0;
    if(size%2!=0){
        odd=1;
    }
    for(int i=0; i<=(size/2)-1;i++ ){

        temp=arr[i];
        arr[i]=arr[size-i-1];
        arr[size-i-1]=temp;

    }
}
