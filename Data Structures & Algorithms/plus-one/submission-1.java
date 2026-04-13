class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<digits.length;i++){
            s.append(digits[i]);
        }
        long x=Long.valueOf(s.toString());
        x++;
        String l=String.valueOf(x);
        int ans[]=new int[l.length()];
        for(int i=0;i<l.length();i++){
            ans[i]=l.charAt(i)-'0';
        }

        return ans;
    }
}
