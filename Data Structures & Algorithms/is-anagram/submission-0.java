class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        
        char sh[] = s.toCharArray();
        char th[] = t.toCharArray();

        Arrays.sort(sh);
        Arrays.sort(th);

        String S = new String(sh);
        String T = new String(th);
        if(S.equals(T)){
            return true;
        }else{
            return false;
        }
    }
}
