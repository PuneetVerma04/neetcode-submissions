class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] list = new List[nums.length+1];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i: map.keySet()){
            int fq = map.get(i);

            if(list[fq]==null){
                list[fq] = new ArrayList<>();
            }
            list[fq].add(i);
        }

        int[] res = new int[k];
        int count =0;

        for(int i=list.length-1;i>=0 && count<k;i--){
            if(list[i]!=null){
                for(int j: list[i]){
                    res[count++] = j;
                }
            }
        }

        return res;
    }
}
