package Tree;

/**
 * @File : MirrorTree.java
 * @Description : class for converting given tree to mirror tree
 * @author Mohit
 * 
 */
public class MirrorTree {

	public MirrorTree() {

	}

	/**
	 * Function for converting tree to mirror tree recursively
	 * 
	 * @param first
	 */
	public void convertToMirrorTree(TreeNode first) {
		// temporary TreeNode variable for swapping
		TreeNode t;
		if (first == null) {
			return;
		} else {
			// convert left tree subtree
			convertToMirrorTree(first.getLeft());
			// convert right subtree
			convertToMirrorTree(first.getRight());
			// swap left and right child of node
			t = first.getLeft();
			first.setLeft(first.getRight());
			first.setRight(t);
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

		// create object of mirrorTree
		MirrorTree mirrorTree = new MirrorTree();

		// create object of inorder to print tree
		Inorder inorder = new Inorder();
		// print original Tree
		System.out.println("Original Tree : ");
		inorder.printInorder(first);
		// convert tree to mirror tree
		mirrorTree.convertToMirrorTree(first);
		// print mirror Tree
		System.out.println("Mirror Tree : ");
		inorder.printInorder(first);
	}

}
