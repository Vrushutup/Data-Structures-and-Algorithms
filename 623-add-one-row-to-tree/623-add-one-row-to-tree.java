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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode a=new TreeNode(val);
            a.left=root;
            return a;
        }
        Queue<TreeNode> q=new ArrayDeque();
        q.add(root);
        while(q.size()!=0){
            int size=q.size();
            while(size-->0){
                TreeNode rnode=q.remove();
                
                if(depth==2){    
                  TreeNode l=rnode.left;
                  TreeNode x=new TreeNode(val);
                  rnode.left=x;
                  x.left=l;
                    
                  TreeNode r=rnode.right;
                  TreeNode y=new TreeNode(val);
                  rnode.right=y;
                  y.right=r;
                }
                else{
                if(rnode.left!=null){
                    q.add(rnode.left);
                }
                if(rnode.right!=null){
                    q.add(rnode.right);
                } 
                }
            }
                
            if(depth==2)return root;
            depth--;
        }
        
        return root;
    }
}