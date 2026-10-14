class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxFreq = 0, maxLen = Integer.MIN_VALUE;

        int count[] = new int[26];

        while(right < s.length()){
            char rightChar = s.charAt(right);
            count[rightChar - 'A']++;


            maxFreq = Math.max(maxFreq, count[rightChar - 'A']);

            int windowSize = right - left + 1;
            if(windowSize - maxFreq > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right-left+1);
            right++;

        }
        return maxLen;
    }
}
