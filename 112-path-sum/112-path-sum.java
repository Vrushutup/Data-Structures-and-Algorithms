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
    
    public boolean sum(TreeNode root, int targetSum,int cSum){
        if(root==null) return false;
        
        if(root.left==null&&root.right==null){
            if(cSum+root.val==targetSum)
            return true;
            else return false;
        }
        
        return sum(root.left,targetSum,cSum+root.val)||sum(root.right,targetSum,cSum+root.val);
    }
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // int csum=0;
    return sum(root,targetSum,0);
        
    }
}