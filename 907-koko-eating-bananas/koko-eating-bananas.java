class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Find maximum pile
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }

        // Binary search on eating speed
        while (low < high) {

            int mid = low + (high - low) / 2;
            int hours = 0;

            // Calculate total hours needed at speed = mid
            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;  // ceil division
            }

            if (hours <= h) {
                high = mid;      // try smaller speed
            } else {
                low = mid + 1;   // need faster speed
            }
        }

        return low;
    }
}
