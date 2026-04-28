import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> value = new HashMap<>();
        value.put('I', 1);
        value.put('V', 5);
        value.put('X', 10);
        value.put('L', 50);
        value.put('C', 100);
        value.put('D', 500);
        value.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int curVal = value.get(s.charAt(i));
            int nextVal = (i + 1 < s.length()) ? value.get(s.charAt(i + 1)) : 0;
            if (curVal < nextVal) {
                result += nextVal - curVal;
                i++;
            } else {
                result += curVal;
            }
        }
        return result;
    }
}