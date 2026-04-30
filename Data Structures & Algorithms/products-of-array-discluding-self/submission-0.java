class Solution {
    public int[] productExceptSelf(int[] nums) {
        // If 0, no 0. If 1, one 0. If 2, two+ 0s.
        int checker = 0;
        int zeroIndex = -1;
        int product = 1;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                if (checker == 1){
                    checker = 2;
                    break;
                }
                checker = 1;
                zeroIndex = i;
            }
            else{
                product *= nums[i];
            }
        }
        int [] newArr = new int[nums.length];
        if (checker == 2){
            return newArr;
        }
        if (checker == 1){
            newArr[zeroIndex] = product;
            return newArr;
        }
        for (int i = 0; i < nums.length; i++){
            newArr[i] = product / nums[i];
        }
        return newArr;
    }
}  
