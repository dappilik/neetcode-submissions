class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        int startIndex = 0;
        int endIndex = s.length() - 1;

        while (startIndex < endIndex) {
            if (s.charAt(startIndex) != s.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}
