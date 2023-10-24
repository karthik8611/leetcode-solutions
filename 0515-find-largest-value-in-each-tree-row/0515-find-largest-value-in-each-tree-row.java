/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
     
        
        // bfs
        if(root==null){
            return new ArrayList<Integer>();
        }
        
        Queue<TreeNode> queue= new LinkedList<>();
        
        List<Integer> ans= new ArrayList<>();
        
        queue.add(root);
        
        
        while(!queue.isEmpty()){
            int n=queue.size();
            int max=Integer.MIN_VALUE;
            
            for(int i=0;i<n;i++){
                TreeNode node=queue.poll();
                max=Math.max(max,node.val);
                
                if(node.left!=null){
                    queue.offer(node.left);
                }
                
                if(node.right!=null){
                    queue.offer(node.right);
                }
                
            }
            
            ans.add(max);
            
            
        }
        
        return ans;
    

   }
}