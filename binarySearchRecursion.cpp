int binarySearch(int arr[], int ln, int rn, int key){
    if((ln==rn&&arr[ln]!=key)||key>arr[rn]||key<arr[ln]){return -1;
    }
    int mid=ln+(rn-ln)/2;
    if(arr[mid]==key){return mid;}
    else if(arr[mid]<=key){ binarySearch(arr, mid+1, rn, key);}
    else if(arr[mid]>=key){ binarySearch(arr, ln, mid-1, key);}
}
