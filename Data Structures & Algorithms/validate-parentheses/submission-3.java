class Solution {
    public boolean isValid(String s) {
        Stack<Character> v=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                v.push(s.charAt(i));
            }else{
                if(v.empty()) return false;
                if((s.charAt(i) == ')' && v.peek() != '(') ||
                   (s.charAt(i) == '}' && v.peek() != '{') ||
                   (s.charAt(i) == ']' && v.peek() != '[')) {
                    return false;
                   }
                v.pop();
            }
        }
        if(v.size()>0){
            return false;
        }
        return true;
    }
}