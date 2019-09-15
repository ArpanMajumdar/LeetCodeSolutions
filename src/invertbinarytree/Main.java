package invertbinarytree;

import sun.reflect.generics.tree.Tree;

public class Main {

  public static void main(String[] args) {
    //     4
    //   /   \
    //  2     7
    // / \   / \
    // 1   3 6   9

    TreeNode tree = new TreeNode(4);
    tree.left = new TreeNode(2);
    tree.right = new TreeNode(7);

    tree.left.left = new TreeNode(1);
    tree.left.right = new TreeNode(3);

    tree.right.left = new TreeNode(6);
    tree.right.right = new TreeNode(9);

    InvertBinaryTree ibt = new InvertBinaryTree();
    TreeNode invertedTree = ibt.invertTree(tree);

    System.out.println(invertedTree);

    TreeNode tree2 = new TreeNode(1);
    tree2.left = new TreeNode(2);
    invertedTree = ibt.invertTree(tree2);

    System.out.println(invertedTree);
  }
}
