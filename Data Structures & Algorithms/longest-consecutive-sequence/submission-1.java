class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLen = Integer.MIN_VALUE;
        for(int i : nums){
            set.add(i);
        }


        for(int in : set){
            if(!set.contains(in - 1)){
                int len = 1;
                while(set.contains(in + len)){
                    len++;
                }
                if(maxLen < len){
                    maxLen = len;
                }
            }
        }
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;

    }
}
