class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){

            //reduce the target
            int rem = target - nums[i];

            //if key value exists in map return
            if(m.containsKey(rem)){
                return new int[]{m.get(rem), i};
            }

            // if key value doesn't exist put in map
            m.put(nums[i], i);
        }

        return new int[]{0,0};
    }
}
