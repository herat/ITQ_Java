package Tree;

/**
 * @File : Levelorder.java
 * @Description : Class for printing level order in spiral form
 * @author : Mohit
 * 
 */
public class LevelOrderSpiral {

	public LevelOrderSpiral() {

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

		int flag = 1;
		// print nodes recursively at every level
		for (int i = 1; i <= height; i++) {
			printNodesatEveryLevel(i, first, flag);
			flag = ~flag;
		}
	}

	/**
	 * Function for displaying nodes at every level
	 * 
	 * @param level
	 * @param first
	 * @param flag
	 */
	public void printNodesatEveryLevel(int level, TreeNode first, int flag) {
		if (first == null) {
			return;
		}
		// if level,print node
		if (level == 1) {
			System.out.println(first.getData());
			// if level>1, print nodes recursively at every level
		} else if (level > 1) {
			if (flag == 1) {
				// print nodes of left child
				printNodesatEveryLevel(level - 1, first.getLeft(), flag);
				// print nodes of right child
				printNodesatEveryLevel(level - 1, first.getRight(), flag);
			} else {
				// print nodes of right child
				printNodesatEveryLevel(level - 1, first.getRight(), flag);
				// print nodes of left child
				printNodesatEveryLevel(level - 1, first.getLeft(), flag);
			}
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
		LevelOrderSpiral levelOrderSpiral = new LevelOrderSpiral();
		// print tree in levelorder
		levelOrderSpiral.printLevelorder(first);
	}

}
