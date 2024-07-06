    public static int minSubArrayLen(int target, int[] arr) {
        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
