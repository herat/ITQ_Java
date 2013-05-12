package Tree;

/**
 * @File : SameTree.java
 * @Description : Class for checking both trees are identically same or not
 * @author : Mohit
 * 
 */
public class SameTree {

	public SameTree() {

	}

	/**
	 * Function for checking both trees identical recursively
	 * 
	 * @param TreeNode first
	 * @param TreeNode second
	 * @return boolean
	 */
	public boolean isSameTree(TreeNode first, TreeNode second) {
		// if both trees are empty, return true
		if (first == null && second == null) {
			return true;
			// if both trees are not empty, compare subtrees
		} else if (first != null && second != null) {
			// if data of both node are same
			if (first.getData() == second.getData()) {
				// check left and right subtrees recursively
				return isSameTree(first.getLeft(), second.getLeft())
						&& isSameTree(first.getRight(), second.getRight());
			} else {
				return false;
			}
		} else {
			return false;
		}
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

		// create second tree
		TreeNode second = new TreeNode(40);
		// insert children
		second.insert(30);
		second.insert(50);
		second.insert(20);
		second.insert(10);
		second.insert(60);

		// create object of SameTree
		SameTree sameTree = new SameTree();
		// check that both trees are same or not
		if (sameTree.isSameTree(first, second)) {
			System.out.println("Both trees are same.");
		} else {
			System.out.println("Both trees are not same.");
		}
	}

}
