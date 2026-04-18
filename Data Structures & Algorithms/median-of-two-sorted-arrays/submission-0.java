class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int[] combined = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted()
                                  .toArray();
        int n=combined.length;

        if(n%2==0){
            return (double)(combined[(n-1)/2]+combined[n/2])/2;
        }
        return combined[n/2];
    }
}
