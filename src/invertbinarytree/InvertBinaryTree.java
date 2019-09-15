package invertbinarytree;

public class InvertBinaryTree {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;
    else if (isLeafNode(root)) return root;
    else if (isLeafNode(root.left) && isLeafNode(root.right)) {
      swapChildren(root, root.left, root.right);
    } else if (isLeafNode(root.left)) {
      swapChildren(root, root.left, invertTree(root.right));
    } else if (isLeafNode(root.right)) {
      swapChildren(root, invertTree(root.left), root.right);
    } else {
      swapChildren(root, invertTree(root.left), invertTree(root.right));
    }
    return root;
  }

  private void swapChildren(TreeNode root, TreeNode left, TreeNode right) {
    TreeNode temp = left;
    root.left = right;
    root.right = temp;
  }

  private boolean isLeafNode(TreeNode node) {
    if (node == null) return true;
    else return node.left == null && node.right == null;
  }
}
