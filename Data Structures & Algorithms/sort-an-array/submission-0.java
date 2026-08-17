class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<nums.length;j++){
                if (nums[minPos]>nums[j]){  //to sort in descending order use "<"
                    minPos=j;
                }
            }

            //Swap
            int swap = nums[minPos];
            nums[minPos]=nums[i];
            nums[i]= swap;
        }

        return nums;
    }
}