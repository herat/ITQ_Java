package Tree;

/**
 * @File : BinaryTreeDiameter.java
 * @Description : Class for finding diameter of Binart Tree
 * @author Mohit
 * 
 */
public class BinaryTreeDiameter {

	public BinaryTreeDiameter() {

	}

	/**
	 * Function for finding diameter recursively
	 * @param first
	 * @return
	 */
	public int findDiameter(TreeNode first) {
		//variables for storing left and right subtrees diameter
		int leftDiameter = 0, rightDiameter = 0;
		//variables for storing left and right subtrees height
		int leftHeight = 0, rightHeight = 0;
		// create object of BinaryTreeHeight
		BinaryTreeHeight binaryTreeHeight = new BinaryTreeHeight();
		
		//if first node is null, return 0
		if (first == null) {
			return 0;
		}

		//find diameter of left subtree
		leftDiameter = findDiameter(first.getLeft());
		//find diameter of right subtree
		rightDiameter = findDiameter(first.getRight());
		
		//find height of left subtree
		leftHeight = binaryTreeHeight.getHeight(first.getLeft());
		//find height of right subtree
		rightHeight = binaryTreeHeight.getHeight(first.getRight());

		//diameter means maximum value of leftheight_rightheight+1, leftDiameter and rightDiameter
		return Math.max(leftHeight + rightHeight + 1,
				Math.max(leftDiameter, rightDiameter));
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

		//create object of BinaryTreeDiameter
		BinaryTreeDiameter binaryTreeDiameter = new BinaryTreeDiameter();
		//find Diameter of Tree
		System.out.println("Diameter of this tree is : "
				+ binaryTreeDiameter.findDiameter(first));
	}

}
