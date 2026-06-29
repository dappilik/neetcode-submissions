class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 1;
        int length = !s.isEmpty() ? 1 : 0;

        while (right < s.length()) {
            String temp = s.substring(left, right);
            int index = temp.indexOf(s.charAt(right));
            if (index >= 0) {
                left = left + index + 1;
                right++;
            } else {
                right++;
                length = Math.max(length, right - left);
            }
        }
        return length;
    }
}
