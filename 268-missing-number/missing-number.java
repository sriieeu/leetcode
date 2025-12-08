class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
      int i =0 ;
        for(int j=0 ; j < n ; j++){
            for(int k= j+1 ; k< n ;k++){
                if(nums[j]> nums[k]){
                    int temp = nums[j];
                    nums[j]= nums[k];
                    nums[k]= temp;
                }
            }
        }
        for(int a = 0 ; a< nums.length ; a++ ){
          
            if(nums[a] == i){
                i++;
            }          
        }
   return i;
    }
}