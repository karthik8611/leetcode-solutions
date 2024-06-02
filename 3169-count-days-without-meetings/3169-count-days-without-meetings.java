class Solution {

    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int last = 0;
        int ans = 0;
        int n = meetings.length;

        for (int i = 0; i < n; i++) {
            if (meetings[i][0] > last) {
                ans += meetings[i][0] - last - 1;
            }
            last = Math.max(meetings[i][1], last);
        }
        if (last < days) {
            ans += days - last;
        }

        return ans;
    }
}
