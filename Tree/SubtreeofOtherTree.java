package Tree;

/**
 * @File : SubtreeofOtherTree.java
 * @Description : Class for checking that one tree is subtree of other tree or
 *              not
 * @author Mohit
 * 
 */
public class SubtreeofOtherTree {

	public SubtreeofOtherTree() {

	}

	/**
	 * Function for finding subtree root in other tree and check if that tree is
	 * subtree of main tree or not
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public boolean isSubtreeofOtherTree(TreeNode first, TreeNode second) {
		// if tree empty,it is subtree
		if (first == null) {
			return true;
		}
		// if main tree is empty,return false
		if (second == null) {
			return false;
		}

		// if tree root node and current node of second tree is same,check for
		// structure and data
		if (areIdentical(first, second)) {
			return true;
		}
		// recursively check with other descendants of main tree
		return isSubtreeofOtherTree(first, second.getLeft())
				|| isSubtreeofOtherTree(first, second.getRight());
	}

	/**
	 * Function for checking the structure and data of subtree in main tree
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public boolean areIdentical(TreeNode first, TreeNode second) {
		// if both node null, return true
		if (first == null && second == null) {
			return true;
		}
		// if one node is not null, return false
		if (first == null || second == null) {
			return false;
		}
		// check data of both nodes and recursively check left and right
		// subtrees for same structure and data
		return ((first.getData() == second.getData())
				&& areIdentical(first.getLeft(), second.getLeft()) && areIdentical(
					first.getRight(), second.getRight()));
	}

	public static void main(String[] args) {

		// create first tree root node
		TreeNode first = new TreeNode(30);
		// insert children
		first.insert(20);
		first.insert(10);
		first.insert(35);
		// create second tree root node
		TreeNode second = new TreeNode(40);
		// insert children
		second.insert(30);
		second.insert(50);
		second.insert(20);
		second.insert(10);
		second.insert(60);
		second.insert(35);
		second.insert(45);

		// create object of SubtreeofOtherTree
		SubtreeofOtherTree subtreeofOtherTree = new SubtreeofOtherTree();
		// check that first tree is subtree of second tree
		if (subtreeofOtherTree.isSubtreeofOtherTree(first, second)) {
			System.out.println("First tree is subtree of second tree.");
		} else {
			System.out.println("First tree is not subtree of second tree.");
		}
	}

}
