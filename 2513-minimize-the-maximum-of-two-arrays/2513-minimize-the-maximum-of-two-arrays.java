class Solution {

    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        
        // binary search
        long low = 1, high = (int) 10e10;

        long ans = high;

        long lcm = ((long) divisor1 * (long) divisor2) / gcd(divisor1, divisor2);

        while (low <= high) {
            long mid = low + (high - low) / 2;
            int x = (int) (mid - mid / divisor1);
            int y = (int) (mid - mid / divisor2);
            int z = (int) (mid - mid / lcm);
            if (x < uniqueCnt1 || y < uniqueCnt2 || z < uniqueCnt1 + uniqueCnt2) {
                low = mid + 1;
            } else {
                ans = Math.min(mid, ans);
                high = mid - 1;
            }
        }
        return (int) ans;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
