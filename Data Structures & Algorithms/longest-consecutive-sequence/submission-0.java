class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> set = Arrays.stream(nums)
                         .boxed()
                         .collect(Collectors.toSet());
        
        for (Integer val : set) {
            int x=val+1;
            int count=1;
            while(set.contains(x)){
                x++;
                count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
