class Solution {
    public int maxArea(int[] heights) {
       int n=heights.length;
       int i=0;
       int j=n-1;
       int ans=0;

       while(i<j){
        int minHeight=Math.min(heights[i],heights[j]);
        int area=(j-i)*minHeight;
        ans=Math.max(area,ans);
        if(heights[i]<=heights[j]){
            i++;
        }else{
            j--;
        }
       }
       return ans;
    }
}
