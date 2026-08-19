class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mm = new HashMap<>();

        //add frequencies for distinct array values
        for(int i=0;i<nums.length;i++){
            mm.put(nums[i],mm.getOrDefault(nums[i],0)+1);
        }

        //Create buckets
        List<Integer>[] ll = new List[nums.length+1];
        for(int i=0;i<ll.length;i++){
            ll[i] = new ArrayList<>();
        }
        
        // keys in buckets based on their frequency as indexes
        for(int n: mm.keySet()){
            int f = mm.get(n);
            ll[f].add(n);
        }

        int[] result = new int[k];
        int idx = 0;

        //iterate over buckets from last to add number with highest frequencies
        for(int i=ll.length-1;i>=0 && idx<k;i--){
            for(int n: ll[i]){
                result[idx] = n;
                idx++;
                if(idx==k){
                    break;
                }
            }
        }

        return result;
    }
}
