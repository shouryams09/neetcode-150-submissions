class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(map.containsKey(val) && map.get(val)!=i){
                a[0]=i;
                a[1]=map.get(val);
                return a;
            }
        }
        return a;
    }
}
