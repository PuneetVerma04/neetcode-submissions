class Solution {
    public boolean isPalindrome(String s) {
        //clear whitespaces and non alphanumeric characters from the string
        String c = s.replaceAll("[^a-zA-Z0-9]","");
        //lowercase the string 
        String cc = c.toLowerCase();
        int i=0;
        int j = cc.length() - 1;

        while(i<=j){
            //check is character is a not alphanumeric character 
            if(!Character.isLetterOrDigit(cc.charAt(i))){
                i++;
            }
            if(!Character.isLetterOrDigit(cc.charAt(j))){
                j--;
            }
            if(cc.charAt(i)!=cc.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }

        return true;
    }
}
