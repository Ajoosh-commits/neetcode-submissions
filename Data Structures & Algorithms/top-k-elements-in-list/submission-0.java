class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (count.containsKey(nums[i])){
                count.put(nums[i], count.get(nums[i]) + 1);
            }
            else {
                count.put(nums[i], 1);
            }
        }
        int [] highest = new int[k];
        List<int[]> arr = new ArrayList<>();
        Set<Map.Entry<Integer, Integer>> entries = count.entrySet();
        for (Map.Entry<Integer, Integer> entry: entries){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);
        for (int i = 0; i < k; i++){
            highest[i] = arr.get(i)[1];
        }
        return highest;
    }
}
