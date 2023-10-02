int binaryLSearch(int arr[], int start, int end, int key){
    int mid=start+(end-start)/2;
    int storage=-1;
    while(start<=end){
        if(arr[mid]==key){
            storage=mid;
            end=mid-1;
        }
        else if(arr[mid]<key){start=mid+1;}
        else if(arr[mid]>key){end=mid-1;}
        mid=start+(end-start)/2;
}
  return storage;
}
int binaryRSearch(int arr[], int start, int end, int key){
    int mid=start+(end-start)/2;
    int storage=-1;
    while(start<=end){
        if(arr[mid]==key){
            storage=mid;
            start=mid+1;
        }
        else if(arr[mid]<key){start=mid+1;}
        else if(arr[mid]>key){end=mid-1;}
        mid=start+(end-start)/2;
}
  return storage;
}
