void tripletFinder(int arr[], int size, int sum){
    for(int i=0;i<size; i++){
        for(int j=i+1;j<size;j++){
            for(int k=j+1; k<size; k++){
                if(arr[i]+arr[j]+arr[k]==sum){
                    cout<<arr[i]<<"\t"<<arr[j]<<"\t"<<arr[k]<<endl;
                }
            }
        }
    }
}
