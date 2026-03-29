class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=arr.get(i)[1];
        }
        return ans;
    }
}
