class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLen = Integer.MIN_VALUE;
        for(int i : nums){
            set.add(i);
        }


        for(int i : set){
            if(!set.contains(i - 1)){
                int len = 1;
                while(set.contains(i + len)){
                    len++;
                }

                if(len > maxLen) maxLen = len;
            }
        }
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;

    }
}
