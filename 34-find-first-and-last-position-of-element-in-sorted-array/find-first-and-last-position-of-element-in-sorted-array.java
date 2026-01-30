class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int second = -1;
        int left = 0;
        int right  = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                int i = mid;
                while (i >= 0 && nums[i] == target) {
                    first = i;
                    i--;
                }
                int j = mid;
                while (j < nums.length && nums[j] == target) {
                    second = j;
                    j++;
                }

                return new int[]{first, second};
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return new int[]{first, second};
    }
}
