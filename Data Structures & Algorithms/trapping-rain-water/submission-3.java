class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0){
            return 0;
        }
        int start = 0;
        int end = height.length - 1;
        int leftMax = height[start];
        int rightMax = height[end];
        int total = 0;
        while (start < end){
            if (leftMax < rightMax){
                start++;
                leftMax = Math.max(leftMax, height[start]);
                total += leftMax - height[start];
            }
            else {
                end--;
                rightMax = Math.max(rightMax, height[end]);
                total += rightMax - height[end];
            }
        }
        return total;
    }
}
