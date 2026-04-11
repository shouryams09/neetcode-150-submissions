class Pair<T,V>{
    private T first;
    private V second;

    public Pair(T first,V second){
        this.first=first;
        this.second=second;
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<Pair<Integer,Integer>> pair=new ArrayList<>();
        for(int i=0;i<position.length;i++){
            pair.add(new Pair(position[i],speed[i]));
        }
        pair.sort((a, b) -> b.first - a.first);
        Stack<Double> s=new Stack<>();
        for(int i=0;i<pair.size();i++){
            Pair<Integer,Integer> y=pair.get(i);
            s.push((double)(target-y.first)/y.second);

            if(s.size()>=2 && s.peek()<=s.get(s.size()-2)){
                s.pop();
            }
        }

        return s.size();

    }
}
