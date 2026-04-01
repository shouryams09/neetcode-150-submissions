class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        for (Integer val : set) {
            if (!set.contains(val - 1)){
            int x=val+1;
            int count=1;
            while(set.contains(x)){
                x++;
                count++;
            }
            max=Math.max(count,max);
            }
        }
        return max;
    }
}
