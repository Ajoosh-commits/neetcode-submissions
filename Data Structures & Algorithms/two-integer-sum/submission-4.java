class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> scores = new HashMap<>();
        int i1 = -1;
        int i2 = -1;
        for (int i = 0; i < nums.length; i++){
            if (scores.containsKey(target - nums[i])){
                i1 = scores.get(target - nums[i]);
                i2 = i;
                break;
            }
            scores.put(nums[i], i);
        }
        return new int[] {i1, i2};
    }
}
