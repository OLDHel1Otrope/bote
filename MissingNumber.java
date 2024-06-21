public int missingNumber(int[] nums) {
        int len=nums.length;
        int min=nums[0];
        int max=min;
        int sum=min;
        for(int i=1;i<len;i++){
            sum+=nums[i];
            if(nums[i]>max) max=nums[i];
            else if(nums[i]<min) min=nums[i];
        }
        if(min!=0) return 0;
        int minsum=((min-1)*min)/2;
        int maxsum=(max*(max+1))/2;
        int val= (maxsum-minsum)-sum;
        if(val==0) return max+1;
        return val;
    }
