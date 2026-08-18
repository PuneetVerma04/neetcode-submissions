class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String k = new String(c);
            if(!map.containsKey(k)){
                map.put(k, new ArrayList<>());
            }
            map.get(k).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
