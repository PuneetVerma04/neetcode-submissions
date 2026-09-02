class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ll = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            for(int j=0; j<words.length;j++){
                if(i!=j && words[j].contains(words[i])){
                    ll.add(words[i]);
                    break;
                }
            }
        }

        return ll;
    }
}