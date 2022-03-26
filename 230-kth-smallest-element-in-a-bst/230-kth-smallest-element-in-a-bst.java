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
    int min=Integer.MAX_VALUE;
    public int helper(TreeNode root,int ans){
        if(root.val>ans&&root.val<min){
            min=root.val;
        }
        if(root.left!=null) helper(root.left,ans);
        if(root.right!=null) helper(root.right,ans);
        return min;
    }
    
    public int kthSmallest(TreeNode root, int k) {
        int ans=Integer.MIN_VALUE;
        while(k-->0){
            ans=helper(root,ans);
            min=Integer.MAX_VALUE;
        }
        return ans;
        
    }
}