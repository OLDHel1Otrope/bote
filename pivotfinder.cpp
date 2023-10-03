//this code dosent work as intended
void pivotfinder(int arr[], int size)
{
    int start=0;
    int end=start-1;
    int mid=start+(end-start)/2;
    //arr[start]!=arr[end]
    while(start<=end){
        if(arr[start]>arr[mid]){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
        mid=start+(end-start)/2;
    }
    cout<<mid;
}
