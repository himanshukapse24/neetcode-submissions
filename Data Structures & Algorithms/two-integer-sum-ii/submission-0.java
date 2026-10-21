class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for (int n : numbers) {
            map.put(n, index);
            index++;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[] {i + 1, map.get(target - numbers[i]) + 1};
            }
        }

        return new int[] {-1, -1};
    }
}
