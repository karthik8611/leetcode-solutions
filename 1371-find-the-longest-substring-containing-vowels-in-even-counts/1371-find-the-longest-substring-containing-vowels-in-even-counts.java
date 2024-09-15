class Solution {

    public int findTheLongestSubstring(String s) {
        int n = s.length();
        int curr_state = 0;
        int len=0;

        Map<Integer, Integer> map = new HashMap<>();

        map.put(curr_state, -1);

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                curr_state = curr_state ^ (1 << 0);
            } else if (ch == 'e') {
                curr_state = curr_state ^ (1 << 1);
            } else if (ch == 'i') {
                curr_state = curr_state ^ (1 << 2);
            } else if (ch == 'o') {
                curr_state = curr_state ^ (1<< 3);
            } else if (ch == 'u') {
                curr_state = curr_state ^ (1 << 4);
            }

            if (map.containsKey(curr_state)) {
                len = Math.max(len, i - map.get(curr_state));
            } else {
                map.put(curr_state, i);
            }
        }

        return len;
    }
}
