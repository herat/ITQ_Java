package Tree;

/**
 * @File : IsBST.java
 * @Description : class for checking that binary tree is BST or not
 * @author Mohit
 * 
 */
public class IsBST {

	public IsBST() {

	}

	/**
	 * Function for checking that tree is BST or not
	 * 
	 * @param first
	 * @return
	 */
	public boolean checkIsBST(TreeNode first) {
		return isBST(first, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	/**
	 * Helper function to check that Tree is BST or not
	 * 
	 * @param first
	 * @param min
	 * @param max
	 * @return
	 */
	public boolean isBST(TreeNode first, int min, int max) {
		// if node is null, return true
		if (first == null) {
			return true;
		}
		// if node value is less than min or node value is greater than
		// max,return false
		if (first.getData() < min || first.getData() > max) {
			return false;
		}

		// check left and right subtrees recursively
		return isBST(first.getLeft(), min, first.getData() - 1)
				&& isBST(first.getRight(), first.getData() + 1, max);
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

		// create object of IsBST
		IsBST isBST = new IsBST();
		// check binary tree is BST
		if (isBST.checkIsBST(first)) {
			System.out.println("This Tree is BST.");
		} else {
			System.out.println("This Tree is not BST.");
		}
	}
}
