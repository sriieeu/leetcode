class Solution {
    List<Integer> a = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {
        inOrder(root);
        int start = 0;
        int end = a.size() - 1;
        while (start < end) {
            int sum = a.get(start) + a.get(end);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                start++;
            } else {
                end--;
            }
        }

        return false;
    }

    void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        a.add(root.val);
        inOrder(root.right);
    }
}
