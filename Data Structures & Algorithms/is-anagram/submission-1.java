class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> numChars = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (numChars.containsKey(s.charAt(i))){
                numChars.put(s.charAt(i), numChars.get(s.charAt(i)) + 1);
            }
            else {
                numChars.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++){
            if (numChars.containsKey(t.charAt(i))){
                numChars.put(t.charAt(i), numChars.get(t.charAt(i)) - 1);
                if (numChars.get(t.charAt(i)) < 0){
                    return false;
                }
            }
            else {
                return false;
            }
        }
        for(Integer values: numChars.values()){
            if (values != 0){
                return false;
            }
        }
        return true;
    }
}
