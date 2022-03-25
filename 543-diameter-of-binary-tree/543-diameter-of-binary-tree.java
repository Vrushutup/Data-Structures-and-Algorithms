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
    static class Pair{
        int maxDfromLeaf=-1;
        int dia=-1;
    }
    public Pair helper(TreeNode root){
        if(root==null) return new Pair();
        
          Pair l= helper(root.left);
          Pair r= helper(root.right);
        
        Pair curr=new Pair();
        curr.maxDfromLeaf=Math.max(l.maxDfromLeaf,r.maxDfromLeaf)+1;
        curr.dia=Math.max(Math.max(l.dia,r.dia),l.maxDfromLeaf+r.maxDfromLeaf+2);
        return curr;
        
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root).dia;
    }
}