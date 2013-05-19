package Tree;

/**
 * @File : CheckHeightBalancedTree.java
 * @Description : Class for checking tree is height balanced tree or not,Height
 *              balanced tree means height difference between left and right
 *              subtrees must be less than and equal to 1
 * @author Mohit
 * 
 */

public class CheckHeightBalancedTree {

	public CheckHeightBalancedTree() {

	}

	/**
	 * Function for checking Tree is height balanced or not
	 * 
	 * @param first
	 * @return
	 */
	public boolean isHeightBalancedTree(TreeNode first) {
		// variables for storing height of left and right subtree
		int leftHeight = 0, rightHeight = 0;
		// create object of BinaryTreeHeight
		BinaryTreeHeight binaryTreeHeight = new BinaryTreeHeight();

		if (first == null) {
			return true;
		}
		// get height of left subtree
		leftHeight = binaryTreeHeight.getHeight(first.getLeft());
		// get height of right subtree
		rightHeight = binaryTreeHeight.getHeight(first.getRight());
		// check height of current node and recursively check left and right
		// subtrees
		return (Math.abs(leftHeight - rightHeight) <= 1)
				&& isHeightBalancedTree(first.getLeft())
				&& isHeightBalancedTree(first.getRight());
	}

	public static void main(String[] args) {
		// create root node
		TreeNode first = new TreeNode(40);
		// insert children
		first.insert(30);
		first.insert(50);
		first.insert(20);
		first.insert(10);
		first.insert(60);
		first.insert(35);
		first.insert(45);

		// create object of CheckHeightBalancedTree
		CheckHeightBalancedTree checkHeightBalancedTree = new CheckHeightBalancedTree();
		// check that tree is height balanced or not
		if (checkHeightBalancedTree.isHeightBalancedTree(first)) {
			System.out.println("This Tree is Height Balanced.");
		} else {
			System.out.println("This Tree is not Height Balanced.");
		}
	}
}
