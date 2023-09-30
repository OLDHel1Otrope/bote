void sort012(int arr[], int size){
     int ars[size]={0};
     int j=size-1;
     int one=0;
    for(int i=0;i<size;i++){
        if(arr[i]!=0){
            if(arr[i]==2){
                ars[j]=2;
                j--;
            }
            if(arr[i]==1){
                one++;
            }
        }
    }
    for(int x=j;x>j-one;x--){
        ars[x]=1;
    }

    for(int l=0;l<size;l++){
        cout<<ars[l]<<"\t";
    }
}
