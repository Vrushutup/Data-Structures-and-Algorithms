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
    public int deepestLeavesSum(TreeNode root) {
     Queue<TreeNode> que=new ArrayDeque();
        int sum=0,ans=0;
        que.add(root);
        while(que.size()!=0){
            sum=0;
            int size=que.size();
            while(size-->0){
            TreeNode rnode=que.remove();
                if(rnode.left==null&&rnode.right==null){
                    sum+=rnode.val;
                }
                if(rnode.left!=null){
                    que.add(rnode.left);
                    // sum+=rnode.left.val;
                }
                 if(rnode.right!=null){
                    que.add(rnode.right);
                    // sum+=rnode.right.val;
                }   
            }
        }
            return sum;
    }
}