public static int[] indicesOfelement(int[]arr, int target){
        int[] ar1= {-1,-1};
        int left=0;
        int right=arr.length-1;
        int mid=left+(right-left)/2;
        while(left<=right){
            if(arr[mid]==target) {
                System.out.println("entered to find the indices");
                //search for left most occurrence
                int s1=0;
                int e1=mid-1;
                int m1=s1+(e1-s1)/2;
                while(s1<=e1){
                    if(arr[m1]==target) e1=m1-1;
                    else s1=m1+1;
                    m1=s1+(e1-s1)/2;
                }
                ar1[0]=s1;
                //search for left most occurrence
                int s2=mid+1;
                int e2=arr.length-1;
                int m2=s2+(e2-s2)/2;
                while(s2<=e2){
                    if(arr[m2]==target) s2=m2+1;
                    else e2=m2-1;
                    m2=s2+(e2-s2)/2;
                }
                ar1[1]=e2;
                return ar1;
            }
            else if(arr[mid]<target) left=mid+1;
            else if(arr[mid]>target) right=mid-1;
            mid=left+(right-left)/2;
        }
        return ar1;
