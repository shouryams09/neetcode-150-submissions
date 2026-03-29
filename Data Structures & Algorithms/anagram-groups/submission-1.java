class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
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
        
        return new ArrayList<>(m.values());
    }
}
