class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> req = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            if(map.get(sorted) != null){
               List<String> list =  map.get(sorted);
               list.add(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sorted, list);
            }
        }

        for(String k: map.keySet()){
            req.add(map.get(k));
        }

        return req;
        
    }
}
