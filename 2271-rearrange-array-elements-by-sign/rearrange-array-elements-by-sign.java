class Solution {
    public int[] rearrangeArray(int[] nums) {

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positive.add(nums[i]);
            } else {
                negative.add(nums[i]);
            }
        }

        int[] a = new int[nums.length];
        a[0] = positive.get(0);

        int p = 1;
        int n = 0;

        for (int j = 1; j < nums.length; j++) {  
            if (a[j - 1] >= 0) {
                a[j] = negative.get(n);          
                n++;                              
            } else {
                a[j] = positive.get(p);          
                p++;                              
            }
        }

        return a;
    }
}
