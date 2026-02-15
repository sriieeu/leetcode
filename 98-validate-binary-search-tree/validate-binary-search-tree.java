class Solution {
    List<Integer> a = new ArrayList<>();

    public boolean isValidBST(TreeNode root) {
        inOrder(root);

        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) >= a.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        a.add(root.val);
        inOrder(root.right);
    }
}
