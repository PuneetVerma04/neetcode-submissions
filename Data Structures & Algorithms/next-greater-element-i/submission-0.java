class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] result = new int[nums1.length];
        for(int i=nums1.length-1;i>=0;i--){
            int m = -1;
            for(int j=nums2.length-1;j>=0;j--){
                if(nums2[j] > nums1[i]){
                    m = nums2[j];
                }else if(nums2[j] == nums1[i]){
                    break;
                }
            }

            result[i] = m;
        }
        
        return result;
    }
}