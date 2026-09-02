class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int curmax = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    break;   
                }
                curmax++;
            }

            max = Math.max(max, curmax);
        }

        return max;
    }
}