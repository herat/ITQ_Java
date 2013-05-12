package Tree;

/**
 * @File : Preorder.java
 * @Description : Class for traversing tree in preorder
 * @author : Mohit
 * 
 */
public class Preorder {

	public Preorder() {

	}

	/**
	 * Print root, left subtree and right subtree recursively
	 * 
	 * @param TreeNode
	 *            first
	 */
	public void printPreorder(TreeNode first) {
		if (first == null) {
			return;
		}
		// print root
		System.out.println(first.getData());
		// print left subtree
		printPreorder(first.getLeft());
		// print right subtree
		printPreorder(first.getRight());
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

		// create object of preorder
		Preorder preorder = new Preorder();
		// print preorder
		preorder.printPreorder(first);
	}

}
