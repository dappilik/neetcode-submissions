class Solution {
    public int characterReplacement(String s, int k) {
        int[] frequencies = new int[26];
        int maxFreq = 0;
        int left = 0;
        int answer = 0;

        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            frequencies[index]++;
            maxFreq = Math.max(maxFreq, frequencies[index]);
            while ((right - left + 1) - maxFreq > k) {
                index = s.charAt(left) - 'A';
                frequencies[index]--;
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}
