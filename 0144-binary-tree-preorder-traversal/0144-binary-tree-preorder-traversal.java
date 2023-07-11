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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Stack<TreeNode> stack= new Stack<>();
        List<Integer> list = new ArrayList<>();
        
        if(root==null){
            return list;
        }
        
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode topNode=stack.pop();
            if(topNode!=null){
                list.add(topNode.val);
                stack.push(topNode.right);
                stack.push(topNode.left);
            }
            
           
        }
        return list;
        
        
    }
}