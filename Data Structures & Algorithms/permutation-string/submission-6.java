class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] f1 = new int[26];
        int[] f2 = new int[26];
        int matches = 0;

        for (int i = 0; i < s1.length(); i++) {
            f1[s1.charAt(i) - 'a']++;
            f2[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (f1[i] == f2[i]) {
                matches++;
            }
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            if (matches == 26) {
                return true;
            }
            int add = s2.charAt(i) - 'a';
            f2[add]++;
            // check after addition, related this char
            if (f2[add] == f1[add]) {
                matches++;
            } else if (f2[add] == f1[add] + 1) {
                matches--;
            }

            int remove = s2.charAt(i - s1.length()) - 'a';
            f2[remove]--;

            // check after removal and before removal
            if (f2[remove] == f1[remove]) {
                matches++;
            } else if (f2[remove] == f1[remove] - 1) {
                matches--;
            }
        }
        return matches == 26;
    }
}
