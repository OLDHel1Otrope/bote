public static int randomizedBinary(int[] arr, int target, int left, int right){
        if (left > right) return -1;
        Random random = new Random();
        int partition = random.nextInt(right - left + 1) + left;
        if (arr[partition] == target) return partition;
        else if (arr[partition] > target)return randomizedBinary(arr, target, left, partition - 1);
        else return randomizedBinary(arr, target, partition + 1, right);
    }
