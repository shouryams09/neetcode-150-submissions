class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> m=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(m.containsKey(sortedString)){
                m.get(sortedString).add(strs[i]);
            }else{
                m.put(sortedString,new ArrayList<>(List.of(strs[i])));
            }
        }
        for (List<String> list : m.values()) {
               ans.add(list);
        }
        return ans;
    }
}
