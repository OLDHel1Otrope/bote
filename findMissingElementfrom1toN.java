 public static int cyclicSort2(int[] nums){
        int n = nums.length;

        // Cyclic sort
        int i = 0;
        while (i < n) {
            if (nums[i] < n && nums[i] != nums[nums[i]]) {
                //condition: current index pe jo value hai wo array ki range se kam hai
                //and jo current index pe value hai wo us index ki value se barabar nahi hai
                //to fir swap kardo un dono ko
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
            } else {
                i++;
            }
        }
        //aakhiri me saare index pe uski respective values aa jayengi, siva jiske pass value na ho uski(largest value aa jayegi wahan)

        // Find the missing number
        for (i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        // If no number is missing in the range 0 to n-1, then the missing number is n
        return n;
    }
