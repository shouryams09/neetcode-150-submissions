class Solution {
    public int binarySearch(int[] nums, int target,int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int idx=-1;
        while(l<=r){
            if (nums[l] < nums[r]) {
                idx=l;
                break;
            }

            int mid=l+(r-l)/2;
            int prev=(mid+n-1)%n;
            int next=(mid+1)%n;

            if(nums[mid]<=nums[prev] && nums[mid]<=nums[next]){
                idx=mid;
                break;
            }
            if(nums[l]<=nums[mid]){
                l=mid+1;
            }else if(nums[mid]<=nums[r]){
                r=mid-1;
            }
        }
        int x=binarySearch(nums,target,0,(idx+n-1)%n);
        System.out.println(x);
        if(x>-1){
            return x;
        }
        int y=binarySearch(nums,target,idx,n-1);

        return y;
    }
}
