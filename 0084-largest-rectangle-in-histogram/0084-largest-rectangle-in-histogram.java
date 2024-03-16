class Solution {

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nser = nextSmallerIndexOnRight(heights, n);
        int[] nsel = nextSmallerIndexOnLeft(heights, n);
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int h = heights[i];

            int width = nser[i] - nsel[i] - 1;
            int area = h * width;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    public static int[] nextSmallerIndexOnRight(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();

        int[] nser = new int[n];

        for (int i = 0; i < n; i++) {
            long ele = arr[i];

            while (st.size() > 0 && ele < arr[st.peek()]) {
                int idx = st.pop();
                nser[idx] = i;
            }
            st.push(i);
        }

        while (st.size() != 0) {
            int idx = st.pop();
            nser[idx] = n;
        }

        return nser;
    }

    public static int[] nextSmallerIndexOnLeft(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();

        int[] nsel = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            long ele = arr[i];

            while (st.size() > 0 && ele < arr[st.peek()]) {
                int idx = st.pop();
                nsel[idx] = i;
            }
            st.push(i);
        }

        while (st.size() != 0) {
            int idx = st.pop();
            nsel[idx] = -1;
        }

        return nsel;
    }
}
