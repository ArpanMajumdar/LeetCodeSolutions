package maxdepthofbinarytree;

public class Main {

  public static void main(String[] args) {
    TreeNode tree = new TreeNode(3);
    tree.left = new TreeNode(9);
    tree.right = new TreeNode(20);
    tree.right.left = new TreeNode(15);
    tree.right.right = new TreeNode(7);
    tree.right.left.right = new TreeNode(2);

    MaxDepthOfBinaryTree m = new MaxDepthOfBinaryTree();
    System.out.println("Depth of tree is :" + m.maxDepth(tree));
  }
}
