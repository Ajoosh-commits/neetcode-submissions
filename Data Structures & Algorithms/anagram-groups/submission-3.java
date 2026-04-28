class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> elem = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            String curr_str = strs[i];
            char [] chars = curr_str.toCharArray();
            Arrays.sort(chars);
            String new_str = new String(chars);
            if (elem.containsKey(new_str)){
                elem.get(new_str).add(curr_str);
            }
            else {
                List<String> val = new ArrayList<>();
                val.add(curr_str);
                elem.put(new_str, val);
            }
        }
        List<List<String>> all_lists = new ArrayList<>();
        for (List<String> value: elem.values()){
            all_lists.add(value);
        }
        return all_lists;
    }
}
