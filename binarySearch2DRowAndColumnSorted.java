public static int[] binarySearch2DRowColumnSorted(int[][] arr, int target){

        int rows=arr.length-1, cols=arr[0].length;
        int row=0,col=cols-1;
        while(row<=rows&&col>-1){
            if(arr[row][col]==target)return new int[]{row,col};
            if(target>arr[row][col])row++;
            else col--;
            System.out.println(row+" "+col);
        }
        return new int[]{-1,-1};
    }
