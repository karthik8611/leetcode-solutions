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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        
        List<List<Integer>> list = new ArrayList<>();
        
        levelOrder(root,list,0);
        
          List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<list.size();i++){
            
            List<Integer> sub= list.get(i);
            if(i%2!=0){
                Collections.reverse(sub);
            }
            ans.add(sub);
        }
        
        return ans;
        
        
        
        
        
        
    }
    
    public void  levelOrder(TreeNode root,List<List<Integer>> list, int level){
        
        if(root==null) return;
        
        if(level==list.size()){
            list.add(new ArrayList<>());
        }
        
        list.get(level).add(root.val);
        
        levelOrder(root.left,list,level+1);
        levelOrder(root.right,list,level+1);
        
    
        
    }
}