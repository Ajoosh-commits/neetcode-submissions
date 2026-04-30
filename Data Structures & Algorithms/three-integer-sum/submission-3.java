class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // 1. Sort the array so we can use pointers and avoid duplicates
        Arrays.sort(nums); 

        // 2. Lock in 'i' as our first number. We only go up to length - 2 
        // because we need room for 'left' and 'right' pointers.
        for (int i = 0; i < nums.length - 2; i++) {
            
            // 3. Skip duplicate 'i' values so we don't get duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            // 4. Two-pointer search for the remaining two numbers
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // We found a valid triplet! Add the VALUES, not indices.
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicate 'left' and 'right' values
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Move both pointers inward to look for other pairs
                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    // Sum is too small, we need a bigger number, so move left pointer up
                    left++;
                } 
                else {
                    // Sum is too big, we need a smaller number, so move right pointer down
                    right--;
                }
            }
        }
        return result;
    }
}