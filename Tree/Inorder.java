package Tree;
/**
 * @File : Inorder.java
 * @Description : Class for traversing tree inorder 
 * @author : Mohit
 *
 */
public class Inorder {

	public Inorder() {
		//create root node
		TreeNode first = new TreeNode(40);
		//insert children
		first.insert(30);
		first.insert(50);
		first.insert(20);
		first.insert(10);
		first.insert(60);
		//print inorder
		printInorder(first);
	}

	/**
	 * Print left subtree, root and right subtree recursively
	 * @param TreeNode first
	 */
	public void printInorder(TreeNode first) {
		if (first == null) {
			return;
		}
		//print left subtree
		printInorder(first.getLeft());
		//print root
		System.out.println(first.getData());
		//print right subtree
		printInorder(first.getRight());
	}

	public static void main(String[] args) {
		//create object of inorder
		Inorder inorder = new Inorder();
	}

}
