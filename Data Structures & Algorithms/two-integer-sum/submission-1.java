class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans=new int[2];
        Map<Integer,Integer>m = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(m.containsKey(diff)){
                ans[0]=m.get(diff);
                ans[1]=i;
                return ans;
            }else{
                m.put(nums[i],i);
            }
        }
        return ans;
    }
}
