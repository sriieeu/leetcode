class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int best = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > low) {
                low = nums[i];
            }
            high += nums[i];
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int leftsum = 0;
            int rightsum = 0;
            int parts = 1;
            for (int i = 0; i < nums.length; i++) {
                leftsum += nums[i];
                if (leftsum > mid) {
                    parts++;
                    rightsum = leftsum - nums[i]; 
                    leftsum = nums[i];        
                }
            }
            if (parts > k) {
                low = mid + 1;      
            } else {
                best = mid;         
                high = mid - 1;    
            }
        }

        return best;
    }
}
