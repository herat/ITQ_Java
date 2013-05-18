package Tree;

/**
 * @File : DoubleTree.java
 * @Description : class for converting given tree to double tree
 * @author Mohit
 * 
 */
public class DoubleTree {

	public DoubleTree() {

	}

	/**
	 * Function for converting tree to double tree. In double tree, we create
	 * new left child with same data as root
	 * 
	 * @param first
	 */
	public void converttoDoubleTree(TreeNode first) {
		// temporary TreeNode for storing old left node
		TreeNode t;

		if (first == null) {
			return;
		}

		// convert left subtree to DoubleTree
		converttoDoubleTree(first.getLeft());
		// convert right subtree to DoubleTree
		converttoDoubleTree(first.getRight());

		// store original left child
		t = first.getLeft();
		// create new left child with same data as node
		first.setLeft(new TreeNode(first.getData()));
		// set original left child to created left child
		first.getLeft().setLeft(t);
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

		// create object of DoubleTree
		DoubleTree doubleTree = new DoubleTree();

		// create object of inorder to print tree
		Inorder inorder = new Inorder();
		// print original Tree
		System.out.println("Original Tree : ");
		inorder.printInorder(first);
		// convert tree to double tree
		doubleTree.converttoDoubleTree(first);
		// print mirror Tree
		System.out.println("Double Tree : ");
		inorder.printInorder(first);
	}

}
