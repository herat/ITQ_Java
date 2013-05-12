package Tree;

/**
 * @File : Postorder.java
 * @Description : Class for traversing tree in postorder
 * @author : Mohit
 * 
 */
public class Postorder {

	public Postorder() {

	}

	/**
	 * Print left subtree, right subtree and root recursively
	 * 
	 * @param TreeNode first
	 */
	public void printPostorder(TreeNode first) {
		if (first == null) {
			return;
		}
		// print left subtree
		printPostorder(first.getLeft());
		// print right subtree
		printPostorder(first.getRight());
		// print root
		System.out.println(first.getData());
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

		// create object of postorder
		Postorder postorder = new Postorder();
		// print postorder
		postorder.printPostorder(first);
	}

}
