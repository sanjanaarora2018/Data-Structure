class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
     for(int i=0;i<strs.length;i++){
       char[] ch= strs[i].toCharArray();
       Arrays.sort(ch);
       String key=new String(ch);
      List<String> listStr= map.getOrDefault(key,new ArrayList<>());
      listStr.add(strs[i]);
      map.put(key,listStr);
     }
     return new ArrayList(map.values());
    }
}
