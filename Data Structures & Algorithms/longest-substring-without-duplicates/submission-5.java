class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        if(s.length() ==1){
            return 1;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.substring(left, i).contains("" + s.charAt(i))) {
                System.out.println(s.substring(left, i).indexOf(s.charAt(i)) + 1);
                left = left + s.substring(left, i).indexOf(s.charAt(i)) + 1;
            }
            if (max < i - left + 1) {
                max = i - left + 1;
            }
        }
        return max;
    }
}
