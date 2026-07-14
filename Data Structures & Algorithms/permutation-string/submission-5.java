class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] f1 = new int[26];
        int[] f2 = new int[26];
        int left = 0;

        for (char c : s1.toCharArray()) {
            f1[c - 'a']++;
        }

        for (int right = 0; right < s2.length(); right++) {
            f2[s2.charAt(right) - 'a']++;
            if (right - left + 1 < s1.length()) {
                continue;
            } else if (right - left + 1 > s1.length()) {
                f2[s2.charAt(left) - 'a']--;
                left++;
            }

            if (Arrays.equals(f1, f2)) {
                return true;
            }
        }
        return false;
    }
}
