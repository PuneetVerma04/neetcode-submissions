class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ll = new ArrayList<>();

        //sort the array because its two pointers approach
        Arrays.sort(nums);

        //Loop to cover only starting(first) element in array
        for(int i=0;i<nums.length-2;i++){
            
            //check if the current number is same as previous one to avoid duplicates
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int l = i+1; //this is the middle/second element in the set of three
            int r = nums.length-1; //this is third/last element in the set of three starting 
                                  //from array end
            
            while(l<r){
                //calculate sum
                int sum = nums[i] + nums[l] + nums[r];

                if(sum==0){
                    //add to the list
                    ll.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    
                    //check if next number for middle element is same or not
                    while(l<r && nums[l]==nums[l+1]){
                        l++;
                    }
                    //check if next number for last element is same or not (decreasing)
                    while(l<r && nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;   
                }else if(sum<0){ //need a bigger number, increase left pointer
                    l++;
                }else{ //need a smaller number, decrease right pointer
                    r--;
                }
            }
        }
        return ll;
    }
}
