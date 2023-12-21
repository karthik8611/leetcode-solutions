class Solution {

    public int maxWidthOfVerticalArea(int[][] points) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                list.add(points[i][0]);
            }
        }

        Collections.sort(list);
        int ans=0;

        for (int i = 1; i < list.size(); i++) {
            
            ans=Math.max(list.get(i)-list.get(i-1),ans);
            
            
        }
        
        return ans;
    }
}
