class Solution {

    public boolean search(int a[],int target){
        int l=0;
        int r=a.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(a[mid]==target){
                return true;
            }else if(a[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        boolean val=false;
        for(int i=0;i<matrix.length;i++){
            val = search(matrix[i],target);
            if(val){
                return true;
            }
        }
        return val;
    }
}
