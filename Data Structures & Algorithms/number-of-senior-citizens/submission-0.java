class Solution {
    public int countSeniors(String[] details) {
        int seniors = 0;
        int[] ages  = new int[details.length];

        for(int i = 0;i<details.length;i++){
            String age = details[i].substring(11,13);
            ages[i] = Integer.parseInt(age);
        }

        for(int i: ages){
            if(i>60){
                seniors++;
            }
        }

        return seniors;
    }
}