class Solution {
    public boolean isHappy(int n) {
        Set<Integer>s=new HashSet<>();
        Integer x=n;
        while(x!=1){
            x=findNumber(x);
            if(s.contains(x)){
                break;
            }
            s.add(x);
        }
        if(x!=1){
            return false;
        }
        return true;
    }

    private int findNumber(int x){
        int sum=0;
        while(x>0){
            sum+=(int)Math.pow(x%10,2);
            x=x/10;
        }
        return sum;
    }
}
