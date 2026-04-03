class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        int s=0;
        int m=s+1;
        int r=n-1;
        Arrays.sort(nums);
        while(s<m && s<=(n-3) && m<=(n-2)){
            while(m<r){
                int target=nums[s]+nums[m]+nums[r];
                if(target==0){
                    ans.add(new ArrayList<>(Arrays.asList(nums[s],nums[m],nums[r])));
                     //duplicates
                    while (m<r && nums[m] == nums[m+1]) {
                        m++;
                    }
                    
                    //  duplicates
                    while (m<r && nums[r] == nums[r-1]){ 
                        r--;
                    }
                    m++;
                    r--;
                }
                else if(target>0){
                    r--;
                }else{
                    m++;
                }
            }
            // if we have more than 2 same nos. that is why for while loop
            while(s<n-2 && nums[s]==nums[s+1]){
                s++;
            }
            s++;
            m=s+1;
            r=n-1;
        }
        return ans;
    }
}