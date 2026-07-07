class Solution {
    public boolean isPalindrome(String s) {
        int startIndex = 0;
        int endIndex = s.length() - 1;

        while (startIndex < endIndex) {
            while (startIndex < endIndex && !isLetterOrNumber(s.charAt(startIndex))) {
                startIndex++;
            }
            System.out.println(
                startIndex + "," + endIndex + " -> " + !isLetterOrNumber(s.charAt(endIndex)));
            while (startIndex < endIndex && !isLetterOrNumber(s.charAt(endIndex))) {
                endIndex--;
            }
            System.out.println(endIndex + " -> " + !isLetterOrNumber(s.charAt(endIndex)));

                if (Character.toLowerCase(s.charAt(startIndex))
                    != Character.toLowerCase(s.charAt(endIndex))) {
                System.out.println(s.charAt(startIndex) + " = " + s.charAt(endIndex));
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    private boolean isLetterOrNumber(char c) {
        System.out.println(c + " = " + (c - 'a' >= 0 && c - 'a' <= 26) + "," + (c - 'A' >= 0 && c - 'A' <= 26) + "," + (c - '0' >= 0 && c - 'A' <= 9));
        if (c - 'a' >= 0 && c - 'a' <= 26) {
            return true;
        }
        if (c - 'A' >= 0 && c - 'A' <= 26) {
            return true;
        }
        if (c - '0' >= 0 && c - '0' <= 9) {
            return true;
        }
        return false;
    }
}
