class Solution {

    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > low) {
                low = weights[i];   
            }
            high = high + weights[i]; 
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            int currentWeight = 0;
            int requiredDays = 1;
            for (int i = 0; i < weights.length; i++) {
                if (currentWeight + weights[i] > mid) {
                    requiredDays = requiredDays + 1;
                    currentWeight = 0;
                }
                currentWeight = currentWeight + weights[i];
            }
            if (requiredDays <= days) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
