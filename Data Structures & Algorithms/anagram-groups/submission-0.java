class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0){
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            
            String fqs = getfqS(str);

            if(map.containsKey(fqs)){//If the frequency String exists
                //Add string to list for the key
                map.get(fqs).add(str);
            }else{
                //Create a new List and put the string in it, then put the list in the map

                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(fqs, list);
            }
        }

        return new ArrayList<>(map.values());
    }

    public String getfqS(String str){
        int arr[] = new int[26];

        for(char ch : str.toCharArray()){
            arr[ch-'a']++;
        }

        StringBuilder s = new StringBuilder();
        char ch = 'a';
        for(int i: arr){
            s.append(ch);
            s.append(i);
            ch++;
        }

        return s.toString();
    }
}