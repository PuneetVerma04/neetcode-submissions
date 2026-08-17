class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1 = word1.length();
        int s2 = word2.length();

        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        while(i<s1 && j<s2){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;j++;
        }
        while(i<s1){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<s2){
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
    }
}