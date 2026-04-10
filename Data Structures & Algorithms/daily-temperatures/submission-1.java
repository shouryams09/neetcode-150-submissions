//Similar to next greater right
class Pair<T,V>{
    public T first;
    public V second;

    public Pair(T first,V second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int x=temperatures.length-1;
        int a[]=new int[temperatures.length];
        Stack<Pair<Integer,Integer>> s=new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--){
            if(s.isEmpty()){
                a[x--]=0;
            }else if(s.peek().first>temperatures[i]){
                a[x--]=Math.abs(s.peek().second-i);
            }else if(s.peek().first<=temperatures[i]){
                while(!s.isEmpty() && s.peek().first<=temperatures[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    a[x--]=0;
                }else{
                    a[x--]=Math.abs(s.peek().second-i);
                }
            }
            s.push(new Pair(temperatures[i],i));
        }

        return a;
    }
}
