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
        List<Integer> l=new ArrayList<Integer>();
    public void helper(TreeNode root){
           if(root==null){
               return;
           }
          if(root.right==null&&root.left==null){
             l.add(root.val);
           return;
          }
         helper(root.left);
         l.add(root.val);
         helper(root.right); 
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return l;
    }
}