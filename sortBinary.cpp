void sortBinary(int arr[], int size){
    int sortedArray[size]={0};
    int j=size-1;
//kewal 1 ki value hi to aayegi wo jab bhi mile aakhri me daal di humne
    for(int i=0;i<size;i++){
        if(arr[i]==1){
            sortedArray[j]=1;
            j--;
        }
    }
    for(int i=0;i<size;i++){
        cout<<sortedArray[i]<<"\t";
    }
}
