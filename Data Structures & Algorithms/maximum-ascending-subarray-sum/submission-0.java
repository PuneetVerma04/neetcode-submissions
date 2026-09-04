class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum = nums[0];
        int cursum = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                cursum = cursum + nums[i];
            }else{
                cursum = nums[i];
            }
            maxsum = Math.max(cursum,maxsum);
        }

        return maxsum;
    }
}