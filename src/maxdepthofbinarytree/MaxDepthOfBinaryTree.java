package maxdepthofbinarytree;

public class MaxDepthOfBinaryTree {
  public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    else return 1 + max(maxDepth(root.left), maxDepth(root.right));
  }

  private int max(int a, int b) {
    return a > b ? a : b;
  }
}
