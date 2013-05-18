package Tree;

/**
 * @File : Levelorder.java
 * @Description : Class for traversing tree in levelorder
 * @author : Mohit
 * 
 */
public class Levelorder {

	public Levelorder() {

	}

	/**
	 * Function for displaying tree in Level order
	 * 
	 * @param first
	 */
	public void printLevelorder(TreeNode first) {
		// create object of BinaryTreeHeight
		BinaryTreeHeight binaryTreeHeight = new BinaryTreeHeight();
		// get height of root
		int height = binaryTreeHeight.getHeight(first);
		// print nodes recursively at every level
		for (int i = 1; i <= height; i++) {
			printNodesatEveryLevel(i, first);
		}
	}

	/**
	 * Function for displaying nodes at every level
	 * 
	 * @param level
	 * @param first
	 */
	public void printNodesatEveryLevel(int level, TreeNode first) {
		if (first == null) {
			return;
		}
		// if level,print node
		if (level == 1) {
			System.out.println(first.getData());
			// if level>1, print nodes recursively at every level
		} else if (level > 1) {
			// print nodes of left child
			printNodesatEveryLevel(level - 1, first.getLeft());
			// print nodes of right child
			printNodesatEveryLevel(level - 1, first.getRight());
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
		// create object of levelorder
		Levelorder levelorder = new Levelorder();
		//print tree in levelorder
		levelorder.printLevelorder(first);
	}

}
