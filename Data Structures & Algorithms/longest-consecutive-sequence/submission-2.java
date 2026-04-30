class Solution {
    public int longestConsecutive(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        if (nums.length == 0) return 0;
        for (int i = 0; i < nums.length; i++){
            pq.offer(nums[i]);
        }
        int currElem = pq.poll();
        int longest = 1;
        int currLength = 1;
        while (!pq.isEmpty()){
            int newest = pq.poll();
            if (currElem + 1 == newest){
                currLength += 1;
            }
            else if (currElem == newest){
                continue;
            }
            else if (currLength > longest){
                longest = currLength;
                currLength = 1;
            }
            else{
                currLength = 1;
            }
            currElem = newest;
        }
        if (currLength > longest){
            return currLength;
        }
        return longest;
    }
}
