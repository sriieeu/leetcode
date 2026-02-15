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
    public TreeNode searchBST(TreeNode root, int val) {
    TreeNode head = root;
    while(head != null){
        if(head.val == val){
            return head;
        }
        else if( head.val > val){
            head=head.left;
        }
        else if(head.val < val){
            head=head.right;
        }

    }
        return null;
    }
}