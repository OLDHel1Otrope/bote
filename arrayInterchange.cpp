//interchange two simultaneous occuring elements of an array
int swap(int arr[], int size){
    int temp;
    if(size%2==1){
        size--;
    }
    for(int i=0;i<size;i+=2){
        temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
