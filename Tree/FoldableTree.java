package Tree;

/**
 * @File : FoldableTree.java
 * @Description : class for checking that tree is foldable or not,
 * @author Mohit
 * 
 */
public class FoldableTree {

	public FoldableTree() {

	}

	/**
	 * Function for checking that tree is foldable or not
	 * 
	 * @param first
	 * @return
	 */
	public boolean isFoldableTree(TreeNode first) {
		if (first == null) {
			return true;
		}
		// checking that left and right subtree is mirror of each other or not
		return isMirror(first.getLeft(), first.getRight());
	}

	/**
	 * Function for checking mirror of two trees
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public boolean isMirror(TreeNode first, TreeNode second) {
		// if both are null, return true
		if (first == null && second == null) {
			return true;
		}

		// if one is null, return false
		if (first == null || second == null) {
			return false;
		}

		// recursively check that left and right are mirror or not
		return isMirror(first.getLeft(), second.getRight())
				&& isMirror(first.getRight(), second.getLeft());
	}

	public static void main(String[] args) {
		// create root node
		TreeNode first = new TreeNode(40);
		// insert children
		first.insert(30);
		first.insert(50);
		first.insert(35);
		first.insert(45);

		// create object of FoldableTree
		FoldableTree foldableTree = new FoldableTree();
		// check that tree is foldable or not
		if (foldableTree.isFoldableTree(first)) {
			System.out.println("This Tree is foldable.");
		} else {
			System.out.println("This Tree is not foldable.");
		}
	}

}
