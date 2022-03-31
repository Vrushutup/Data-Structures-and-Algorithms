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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        if(root==null) return null;
        
        if(root.right==null&&root.left==null){ 
            root.val+=sum;
            sum=root.val;
            return root;
            }
       TreeNode right= bstToGst(root.right);
       //  right.val+=sum;
       // sum=right.val;
        root.val+=sum;
       sum=root.val;
       TreeNode left=bstToGst(root.left);
        // if(left==null) return root;
        return root;
    }
}