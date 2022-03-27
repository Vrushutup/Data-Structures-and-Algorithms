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
     public boolean ans(TreeNode root,int value) {
         if(root==null) return true;
       if(root.val!=value) return false;
         
        return (root.val==value)&& ans(root.left,value)&& ans(root.right,value);
        
    }
    
    public boolean isUnivalTree(TreeNode root) {
        // if(root==nu)
        int value=root.val;
        return ans(root,value);
    }
}