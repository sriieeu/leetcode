class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }
        while (low < high) {

            int k = low + (high - low) / 2;
            int hours = 0;

            for (int i = 0; i < piles.length; i++) {
                hours += (int) Math.ceil((double) piles[i] / k);
            }

            if (hours <= h) {
                high = k;
            } else {
                low = k + 1; 
            }
        }

        return low;
    }
}
