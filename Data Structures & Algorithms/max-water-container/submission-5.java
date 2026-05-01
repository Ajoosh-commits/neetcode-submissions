class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int greatest = 0;
        while (start < end){
            int currWeight = (end - start) * Math.min(heights[start], heights[end]);
            if (currWeight > greatest){
                greatest = currWeight;
            }
            if (heights[start] > heights[end]){
                end--;
            }
            else {
                start++;
            }
        }
        return greatest;
    }
}
