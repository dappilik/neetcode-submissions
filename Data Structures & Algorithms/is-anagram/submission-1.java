class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] sCount = new int[26];
        int[] tCount = new int[26];

        int offset = Character.getNumericValue('a');

        for (int i = 0; i < s.length(); i++) {
            sCount[Character.getNumericValue(s.charAt(i)) - offset]++;
            tCount[Character.getNumericValue(t.charAt(i)) - offset]++;
        }

        for (int i = 0; i < sCount.length; i++) {
            if (sCount[i] != tCount[i]) {
                return false;
            }
        }

        return true;
    }
}
