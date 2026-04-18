// Binary Search
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        int ans=r;
       
        while(l<=r){
            int mid=l+(r-l)/2;
            int count=0;
            for(int i=0;i<piles.length;i++){
                count+=(int)Math.ceil((double)piles[i]/mid);//counting hours pile which Koko will take to eat bananas
            }
          if(count<=h){
            ans=mid;
            r=mid-1;
          }else{
            l=mid+1;
          }
        }
      return ans;  
    }
}
