class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        int left = 0;

        for (int i = 0; i < s1.length(); i++) {
            f1[s1.charAt(i) - 'a']++;
        }

        for (int right = 0; right < s2.length(); right++) {
            f2[s2.charAt(right) - 'a']++;
            if (right - left + 1 < s1.length()) {
                continue;
            }
            while (left < s2.length() && f2[s2.charAt(left) - 'a'] > f1[s2.charAt(left) - 'a']) {
                f2[s2.charAt(left) - 'a']--;
                left++;
            }
            if (right - left + 1 == s1.length()) {
                boolean isMatched = true;
                for (int i = left; i <= right; i++) {
                    if (f1[s2.charAt(i) - 'a'] != f2[s2.charAt(i) - 'a']) {
                        isMatched = false;
                    }
                }
                if (isMatched) {
                    return isMatched;
                }
                f2[s2.charAt(left) - 'a']--;
                left++;
            }
        }
        return false;
    }
}
