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
    public TreeNode removeLeafNodes(TreeNode node, int target) {
        if(node==null) return null;
        
        
       TreeNode left= removeLeafNodes(node.left,target) ;
      TreeNode right=  removeLeafNodes(node.right,target) ;
        node.left=left;
        node.right=right;
        if(node.left==null&&node.right==null&&node.val==target){
            return null;
        }
        return node;
        
    }
}