package Tree;

/**
 * @File : BinaryTreeSize.java
 * @Description : Class for finding total number of nodes in tree(size of tree)
 * @author : Mohit
 * 
 */

public class BinaryTreeSize {

	public BinaryTreeSize() {

	}

	/**
	 * Function for calculating size of Binary Tree
	 * 
	 * @param TreeNode first
	 * @return int (Size)
	 */
	public int getSize(TreeNode first) {
		// if root is null, retur 0
		if (first == null) {
			return 0;
		} else {
			// return left subtree size+right subtree size +1
			return getSize(first.getLeft()) + getSize(first.getRight()) + 1;
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

		// create object of BinaryTreeSize
		BinaryTreeSize binaryTreeSize = new BinaryTreeSize();
		// print number of nodes in tree
		System.out.println(binaryTreeSize.getSize(first));
	}

}
