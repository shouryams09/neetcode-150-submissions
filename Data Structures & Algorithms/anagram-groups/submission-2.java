class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int a[]=new int[26];
            for(int j=0;j<strs[i].length();j++){
                a[strs[i].charAt(j)-'a']++;
            }
            String key=Arrays.toString(a);
            ans.putIfAbsent(key,new ArrayList<>());
            ans.get(key).add(strs[i]);
        }
        
        return new ArrayList<>(ans.values());
    }
}
