class Solution {
    public int subarraySum(int[] nums, int k) {
        int right = 0, currSum = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        while(right < nums.length){
            currSum += nums[right];

            if(map.containsKey(currSum - k)){
                count += map.get(currSum - k);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
            right++;
        }
        return count;

    }
}