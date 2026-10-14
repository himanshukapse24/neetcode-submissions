class Solution {
    public int lengthOfLongestSubstring(String s) {
        int first = 0, second = 0, maxLen = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();

        while (second < s.length()) {
            while(set.contains(s.charAt(second))){
                set.remove(s.charAt(first));
                first++;
            }

            if(maxLen < set.size()){
                maxLen = set.size();
            }

            set.add(s.charAt(second));
            second++;
        }
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen + 1;
    }
}
