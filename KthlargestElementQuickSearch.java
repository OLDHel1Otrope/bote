public static int kthLargestValue(int[] arr, int k){
        if(k>arr.length)return -1;
        int left=0;
        int right=arr.length-1;
        int index= partition(arr,left,right);
        while(index!=arr.length-k){
            if (index < arr.length - k) {
                left = index + 1;
            } else {
                right = index - 1;
            }
            index = partition3(arr, left, right);
        }

        return arr[index];
    }

    private static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        System.out.println(Arrays.toString(arr));
        return i + 1;
    }
    

    static int partition3(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int st = low;
        int end = high;
        int k = high;
        for (int i = high; i > low; i--) {
            if (arr[i] > pivot)
                swap(arr, i, k--);
        }
        swap(arr, low, k);
        return k;
    }
