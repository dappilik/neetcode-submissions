class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> req = new ArrayList<>();
        for(String s: strs){
            map.computeIfAbsent(calculateKey(s), k -> new ArrayList<>()).add(s);
        }

        return map.values().stream().toList();
    }

    private String calculateKey(String s){
            int[] counter = new int[26];
            StringBuilder sb = new StringBuilder();
            for(char c:s.toCharArray()){
                counter[c-'a']++;
            }
            for(int i =0; i< 26; i++){
                if(counter[i] != 0){
                    char c = (char) ('a'+i);
                    sb.append(c).append(counter[i]);
                } 
            }
            return sb.toString();
    }
}
