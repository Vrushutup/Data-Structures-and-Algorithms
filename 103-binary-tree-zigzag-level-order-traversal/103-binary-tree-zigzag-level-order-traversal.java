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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(root==null) return ans;
        
        Queue<TreeNode> que=new ArrayDeque();
        que.add(root);
        int level=1;
        while(que.size()!=0){
            int size=que.size();
            List<Integer> l=new ArrayList();
                  while(size-->0){
                  TreeNode rnode=que.remove();
                      l.add(rnode.val);
                     if(rnode.left!=null) que.add(rnode.left);
                     if(rnode.right!=null) que.add(rnode.right);
                  }
            if(level%2==1){
                ans.add(l);
            }else{
                Collections.reverse(l);
                ans.add(l);
            }
            level++;
        }
        return ans;
    }
}