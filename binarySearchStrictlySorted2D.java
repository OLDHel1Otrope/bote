public static int[] binarySearchStrictlySorted2D(int[][] arr, int target){
        //the idea is to search the first column and find the index of the number which is just smaller or equal to the target element using bs
        //once that element is found apply bs again in that row to get to the element
        //finding the row number
        int start=0;
        int endRows=arr.length-1;
        int mid1=start+(endRows-start)/2;
        while(start<=endRows){
            if(arr[mid1][0]==target)return new int[]{mid1,0};
            if(arr[mid1][0]>target)endRows=mid1-1;
            else start=mid1+1;
            mid1=start+(endRows-start)/2;
        }
        //endRows is the row in which has the element
        start=0;
        int endCols=arr[0].length-1;
        int mid2=start+(endCols-start)/2;
        while(start<=endCols){
            if(arr[endRows][mid2]==target)return new int[]{endRows,mid2};
            if(arr[endRows][mid2]>target)endCols=mid2-1;
            else start=mid2+1;
            mid2=start+(endCols-start)/2;
        }
        return new int[]{-1,-1};
    }
