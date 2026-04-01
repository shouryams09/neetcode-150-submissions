class Solution {
    public boolean isPalindrome(String s) {
        String m=s.toLowerCase();
        int i=0,j=m.length()-1;

        while(i<j){
            while(i<j && !((m.charAt(i)>='a' && m.charAt(i)<='z') || (m.charAt(i) >= '0' && m.charAt(i) <= '9'))){
                i++;
            }
            while(j>i && !((m.charAt(j)>='a' && m.charAt(j)<='z') || (m.charAt(j) >= '0' && m.charAt(j) <= '9'))){
                j--;
            }
            if(m.charAt(i)!=m.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;

    }
}
