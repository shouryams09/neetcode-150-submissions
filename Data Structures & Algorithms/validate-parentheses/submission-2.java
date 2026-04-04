class Solution {
    public boolean isValid(String s) {
        Stack<Character> res=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                res.push(s.charAt(i));
            }else{
                if(s.charAt(i)=='}' && !res.empty() && res.peek()=='{'){
                    res.pop();
                }else if(s.charAt(i)==']' && !res.empty() && res.peek()=='['){
                    res.pop();
                }else if(s.charAt(i)==')' && !res.empty() && res.peek()=='('){
                    res.pop();
                }else{
                    res.push(s.charAt(i));
                }
            }
        }
        if(!res.empty()){
            return false;
        }
        return true;
    }
}
