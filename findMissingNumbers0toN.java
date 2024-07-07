public static List<Integer> findMissingNumbers0toN(int[] nums, int n){
        //the problem is lets assume you have a range o to n elements inclusive but the nums.length is less than n,
        //cyclic sort can tell within the array length which numbers are missing but cannot tell outside that size
        //a solution to that might be to add all the misplaced numbers to array and at the end of the loop remove them form the List
        int i=0;
        int l=nums.length;
        while(i<l){
            if(nums[i]<l&&nums[i]!=nums[nums[i]]){
                swap(nums,i,nums[i]);
            }
            else i++;
        }
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> list2=new HashSet<>();
        for (int j = 0; j < l; j++) {
            if(nums[j]!=j){
                list.add(j);
                list2.add(nums[j]);
            }
        }
        for(;l<=n;l++){
            if(!list2.contains(l))list.add(l);
        }
        return list;
    }
