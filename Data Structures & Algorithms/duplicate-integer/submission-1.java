class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ss = new HashSet<>();

        for(int n: nums){
            ss.add(n);
        }

        if(ss.size()< nums.length){
            return true;
        }

        return false;
    }
}