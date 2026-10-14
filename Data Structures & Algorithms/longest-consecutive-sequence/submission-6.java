class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }

        int maxLen = Integer.MIN_VALUE;
        for(int i = 0; i <nums.length; i++){
            int len = 1;
            if(!set.contains(nums[i] - 1)){
                while(set.contains(nums[i] + len)){
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
