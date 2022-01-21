class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 == null) {
            return new TreeNode(root2.val, mergeTrees(null, root2.left), mergeTrees(null, root2.right));
        }
        if (root2 == null) {
            return new TreeNode(root1.val, mergeTrees(root1.left, null), mergeTrees(root1.right, null));
        }
        return new TreeNode(root1.val + root2.val, mergeTrees(root1.left, root2.left), mergeTrees(root1.right, root2.right));
    }
}
