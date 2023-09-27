void arrayReversal(int arr[], int size){
    int temp;
    for(int i=0; i<=(size/2)-1;i++ ){
        temp=arr[i];
        arr[i]=arr[size-i-1];
        arr[size-i-1]=temp;
        //works for both even and odd length arrays
    }
}
