class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int ans=0;

        while(l<=r){
            if (nums[l] < nums[r]) {
                ans=nums[l];
                return ans;
            }
            int mid=l+(r-l)/2;
            int next=(mid+1)%n;
            int prev=(mid+n-1)%n;

            if(nums[mid]<=nums[next] && nums[mid]<=nums[prev]){
                ans=nums[mid];
                return ans;
            }if(nums[l]<=nums[mid]){
                l=mid+1;
            }else if(nums[mid]<=nums[r]){
                r=mid-1;
            }
        }
        return ans;
    }
}
