package Tree;

/**
 * @File : TreeNode.java
 * @Description : Class for node of trees
 * @author Mohit
 * 
 */
public class TreeNode {
	// variable for data
	private int data;
	// variable for left child
	private TreeNode left;
	// variable for right child
	private TreeNode right;
	// variable for next node at same level
	private TreeNode nextRight;

	/**
	 * Parameterized constructor
	 * 
	 * @param int data
	 */
	public TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		this.nextRight = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public TreeNode getNextRight() {
		return nextRight;
	}

	public void setNextRight(TreeNode nextRight) {
		this.nextRight = nextRight;
	}

	/**
	 * Function for inserting data into tree recursively
	 * 
	 * @param int data
	 */
	public void insert(int data) {
		// insert into left sub tree
		if (data <= this.data) {
			if (this.left == null) {
				setLeft(new TreeNode(data));
			} else {
				left.insert(data);
			}
			// insert into right subtree
		} else {
			if (this.right == null) {
				setRight(new TreeNode(data));
			} else {
				right.insert(data);
			}
		}
	}
}
