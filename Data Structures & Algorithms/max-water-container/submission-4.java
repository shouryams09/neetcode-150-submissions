class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int l=0;
        int r=n-1;
        int max=Integer.MIN_VALUE;
        while(l<r){
            int min=Math.min(heights[l],heights[r]);
            int val=min*(r-l);
            max=Math.max(val,max);
            if(heights[l]==min){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
