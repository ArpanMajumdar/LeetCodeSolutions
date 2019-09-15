package mergetwobinarytrees;

public class MergeTwoBinaryTrees {

  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

    TreeNode newNode;
    if (t1 != null && t2 != null) {
      newNode = new TreeNode(t1.val + t2.val);
      newNode.left = mergeTrees(t1.left, t2.left);
      newNode.right = mergeTrees(t1.right, t2.right);
    } else if (t1 != null) {
      newNode = new TreeNode(t1.val);
      newNode.left = mergeTrees(t1.left, null);
      newNode.right = mergeTrees(t1.right, null);
    } else if (t2 != null) {
      newNode = new TreeNode(t2.val);
      newNode.left = mergeTrees(null, t2.left);
      newNode.right = mergeTrees(null, t2.right);
    } else {
      newNode = null;
    }
    return newNode;
  }
}
