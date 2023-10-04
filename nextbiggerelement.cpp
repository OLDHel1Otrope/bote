//finding element just bigger than the entered key
void element(int arr[], int size, int key){
    int start=0;
    int end=size-1;
    int mid=start+(end-start)/2;

    while(true){
        if(key==arr[mid]){
            cout<<mid;
        break;
        }
        else if(key<arr[mid]){
            end=mid-1;
            if(start==mid){
                cout<<start;
            break;
            }
        }
        else if(key>arr[mid]){
            start=mid+1;
        if(start==mid){
            cout<<start;
            break;
        }
    }
    mid=start+(end-start)/2;
    }
}
