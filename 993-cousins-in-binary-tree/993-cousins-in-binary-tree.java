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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(x==root.val||y==root.val) return false;
        
        int level=0,levelx=0,levely=0;
        int parx=root.val,pary=root.val;
        Queue<TreeNode> que=new ArrayDeque();
        que.add(root);
        while(que.size()!=0){
            int size=que.size();
            level++;
            while(size-->0){
            TreeNode rnode=que.remove();
                if(rnode.left!=null){
                    if(rnode.left.val==x){
                        parx=rnode.val;
                        levelx=level;
                    }else if(rnode.left.val==y){
                      pary=rnode.val;
                        levely=level;
                    }
                    que.add(rnode.left);
                }
                if(rnode.right!=null){
                    if(rnode.right.val==x){
                        parx=rnode.val;
                        levelx=level;
                    }else if(rnode.right.val==y){
                      pary=rnode.val;
                        levely=level;
                    }
                     que.add(rnode.right);
                } 
            }
            if(pary!=parx&&levelx==levely) return true;          
        }
        return false;
    }
}