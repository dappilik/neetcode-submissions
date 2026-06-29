class Solution {
    int[] hashTable = new int[] { 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
            89, 97, 101, 103 };


    public List<List<String>> groupAnagrams(String[] strs) {

        Map<Integer, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            int key = getKey(strs[i]);
            List<String> list = map.computeIfAbsent(key, k -> new ArrayList<>());
            list.add(strs[i]);
        }

        return new ArrayList<>(map.values());
        
    }

    private int getKey(String s) {
        int res = 1;
        for (int i = 0; i < s.length(); i++)
            res *= hashTable[s.charAt(i) - 'a'];
        return res;
    }
}
