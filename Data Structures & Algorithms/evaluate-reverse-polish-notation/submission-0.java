class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<tokens.length;i++){
            if (!tokens[i].equals("+") &&
                !tokens[i].equals("-") &&
                !tokens[i].equals("*") &&
                !tokens[i].equals("/")) {
                
                s.push(Integer.valueOf(tokens[i]));
                }else{
                    int a[]=new int[2];
                    int j=0;
                    while(j<2 && !s.isEmpty()){
                        a[j]=s.peek();
                        s.pop();
                        j++;
                    }
                    if(tokens[i].equals("+")){
                        s.push(a[1]+a[0]);
                    }else if(tokens[i].equals("-")){
                        s.push(a[1]-a[0]);
                    }else if(tokens[i].equals("*")){
                        s.push(a[1]*a[0]);
                    }else if(tokens[i].equals("/")){
                        s.push(a[1]/a[0]);
                    }
                }
        }
        return s.peek();
    }
}
