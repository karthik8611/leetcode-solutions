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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> ans= new ArrayList<>();
        if(root==null) return ans;
        List<List<Integer>> list= new ArrayList<>();
        levelOrder(root,list,0);
        
//         for(int i=0;i<list.size();i++){
//             for(int j=0;j<list.get(i).size();j++){
//                 ans.add(list.get(i).get(list.get(i).size()-1));
//             }
//         }
         for (List<Integer> sublist : list) {
            int lastIndex = sublist.size() - 1;
            if (lastIndex >= 0) { // Check if sublist is not empty
                ans.add(sublist.get(lastIndex));
            }
        }
        
        return ans;
        
    }
    
    public void levelOrder(TreeNode root, List<List<Integer>> list,int level){
        if(root==null){
            return;
        }
        
        if(level==list.size()){
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        levelOrder(root.left,list,level+1);
        levelOrder(root.right,list,level+1);
        
        
    }
}