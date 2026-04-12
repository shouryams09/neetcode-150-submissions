class Pair<T,V>{
    public T first;
    public T second;

    public Pair(T first,T second){
        this.first=first;
        this.second=second;
    }
}
class Solution {

    public int[] nextSmallestRight(int[] heights){
        int n=heights.length;
        int []ans=new int[n];
        Stack<Pair<Integer,Integer>>s=new Stack<>();

        for(int i=n-1;i>=0;i--){
            if(s.isEmpty()){
                ans[i]=n;
            }else if(heights[i]>s.peek().first){
                ans[i]=s.peek().second;
            }else if(heights[i]<=s.peek().first){
                while(!s.isEmpty() && heights[i]<=s.peek().first){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=n;
                }else{
                    ans[i]=s.peek().second;
                }
            }
            s.push(new Pair(heights[i],i));
        }

        return ans;
    }

    public int[] nextSmallestLeft(int[] heights){
        int n=heights.length;
        int []ans=new int[n];
        Stack<Pair<Integer,Integer>>s=new Stack<>();

        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                ans[i]=-1;
            }else if(heights[i]>s.peek().first){
                ans[i]=s.peek().second;
            }else if(heights[i]<=s.peek().first){
                while(!s.isEmpty() && heights[i]<=s.peek().first){
                    s.pop();
                }
                if(s.isEmpty()){
                    ans[i]=-1;
                }else{
                    ans[i]=s.peek().second;
                }
            }
            s.push(new Pair(heights[i],i));
        }

        return ans;
    }

    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int []nsr=nextSmallestRight(heights);
        int []nsl=nextSmallestLeft(heights);

        int []width=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            width[i]=nsr[i]-nsl[i]-1;
            int area=heights[i]*width[i];
            max=Math.max(area,max);
        }
        return max;
    }
}
