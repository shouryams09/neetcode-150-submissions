class Pair<T,V>{
    public T first;
    public T second;

    public Pair(T first,T second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair<Integer,Integer>> s=new Stack<>();
        int n=temperatures.length;
        int a[]=new int[n];
        for(int i=n-1;i>=0;i--){
            if(s.isEmpty()){
                a[i]=0;
            }
            else if(!s.isEmpty() && temperatures[i]<s.peek().first){
                a[i]=s.peek().second-i;
            }else if(!s.isEmpty() && temperatures[i]>=s.peek().first){
                while(!s.isEmpty() && temperatures[i]>=s.peek().first){
                    s.pop();
                }
                if(s.isEmpty()){
                    a[i]=0;
                }else{
                    a[i]=s.peek().second-i;
                }
            }
            s.push(new Pair(temperatures[i],i));
        }

        return a;
    }
}
