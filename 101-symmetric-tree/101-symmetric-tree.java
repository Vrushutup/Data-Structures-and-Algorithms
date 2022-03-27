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
    public boolean helper(TreeNode n1,TreeNode n2){
        if(n1==null||n2==null) return n1==n2;
        return (n1.val==n2.val)&&helper(n1.left,n2.right)&&helper(n1.right,n2.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left,root.right);    
    }
}