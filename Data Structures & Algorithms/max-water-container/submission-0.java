class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0;
        int r = heights.length - 1;
        int maxAmt = 0;
        while(l<r){
            int lh = heights[l];
            int rh = heights[r];
            int h = Math.min(lh,rh);
            int amt = h*(r-l);

            maxAmt = Math.max(maxAmt, amt);

            if(lh<rh){
                l++;
            }else{
                r--;
            }
        }

        return maxAmt;
    }
}
