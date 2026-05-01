class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedList <Character> values = new LinkedList<Character>();
        int greatest = 0;
        int curr = 0;
        for (int i = 0; i < s.length(); i++){
            char element = s.charAt(i);
            while(values.contains(element)){
                values.removeLast();
                curr--;
            }
            values.addFirst(element);
            curr++;
            greatest = Math.max(curr, greatest);
        }
        return greatest;
    }
}
