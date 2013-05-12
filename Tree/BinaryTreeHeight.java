package Tree;

/**
 * @File : BinaryTreeHeight.java
 * @Description : Class for finding height of tree
 * @author : Mohit
 * 
 */
public class BinaryTreeHeight {

	public BinaryTreeHeight() {
	}

	/**
	 * Function for getting height recursively
	 * 
	 * @param TreeNode
	 *            first
	 * @return int height
	 */
	public int getHeight(TreeNode first) {
		// if node is null,return 0
		if (first == null) {
			return 0;
		} else {
			// return maximum height of subtrees +1
			return Math.max(getHeight(first.getLeft()),
					getHeight(first.getRight())) + 1;
		}
	}

	public static void main(String[] args) {
		// create object of binaryTreeHeight
		BinaryTreeHeight binaryTreeHeight = new BinaryTreeHeight();
		// create root node
		TreeNode first = new TreeNode(40);
		// insert children
		first.insert(30);
		first.insert(50);
		first.insert(20);
		first.insert(10);
		first.insert(60);
		System.out.println(binaryTreeHeight.getHeight(first));
	}

}
