class Solution {
    public int characterReplacement(String s, int k) {
        int[] frequency = new int[26];
        int max =0;
        int left =0;
        int maxFrequency =0;
        
        for(int right =0; right < s.length() ; right++){
            frequency[s.charAt(right)-'A']++;
            maxFrequency = Math.max(maxFrequency, frequency[s.charAt(right)-'A']);
            if(right+1 - left -maxFrequency > k){
                frequency[s.charAt(left)-'A']--;
                left++;
            }else{
                max= Math.max(max, right+1 -left);
            }
        }


        return max;
    }
}
