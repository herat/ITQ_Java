package Tree;

/**
 * @File : MinMaxValueinBST.java
 * @Description : class for getting min and max value in Binary Search Tree
 * @author Mohit
 * 
 */
public class MinMaxValueinBST {

	public MinMaxValueinBST() {

	}

	/**
	 * Function for getting minimum value in BST
	 * 
	 * @param first
	 * @return
	 */
	public int getMinValue(TreeNode first) {
		int result = 0;
		// go till left most node
		while (first.getLeft() != null) {
			first = first.getLeft();
		}
		// get min value
		result = first.getData();
		return result;
	}

	/**
	 * Function for getting max value in BST
	 * 
	 * @param first
	 * @return int
	 */
	public int getMaxValue(TreeNode first) {
		int result = 0;
		// go till right most node in tree
		while (first.getRight() != null) {
			first = first.getRight();
		}
		// get max value
		result = first.getData();
		return result;

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

		// create object of MinMaxValueinBST
		MinMaxValueinBST minMaxValueinBST = new MinMaxValueinBST();
		// getting min and max values in BST
		System.out.println("Minimum value in BST is : "
				+ minMaxValueinBST.getMinValue(first));
		System.out.println("Maximum value in BST is : "
				+ minMaxValueinBST.getMaxValue(first));
	}

}
