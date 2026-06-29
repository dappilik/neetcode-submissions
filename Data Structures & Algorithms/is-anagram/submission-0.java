class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) +1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) +1);
        }

        for(Character c: sMap.keySet()){
            if(sMap.get(c) != tMap.get(c)){
                return false;
            }
        }

        return true;
    }
}
