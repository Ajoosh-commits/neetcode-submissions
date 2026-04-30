class Solution {
    public String encode(List<String> strs) {
        StringBuilder answer = new StringBuilder();
        for (String str : strs) {
            answer.append(str.length()).append("#").append(str);
        }
        return answer.toString();
    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int delimiterIndex = str.indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            int stringStart = delimiterIndex + 1;
            int stringEnd = stringStart + length;
            arr.add(str.substring(stringStart, stringEnd));
            
            i = stringEnd;
        }
        return arr;
    }
}
