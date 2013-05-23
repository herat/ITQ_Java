package Tree;

/**
 * @File : InorderSuccessor.java
 * @Description : Class for finding inorder successor of node traversing from
 *              root node
 * @author Mohit
 * 
 */
public class InorderSuccessor {

	public InorderSuccessor() {

	}

	/**
	 * Function for finding inorder successor
	 * 
	 * @param first
	 * @param node
	 * @return TreeNode
	 */
	public TreeNode findInorderSuccessor(TreeNode first, TreeNode node) {
		// initialize inorder successor
		TreeNode successor = null;
		// if right node is not null, return left most child of right node
		if (node.getRight() != null) {
			// get left most child of right node as successor
			successor = findMinValueNode(node.getRight());
		} else {
			// search from root to find successor
			while (first != null) {
				// if node data is less than current node data, make successor
				// as current node and current node to left node
				if (node.getData() < first.getData()) {
					successor = first;
					first = first.getLeft();
					// if node data is grater than current node data, change
					// current node to right node
				} else if (node.getData() > first.getData()) {
					first = first.getRight();
				} else {
					break;
				}
			}
		}
		//return successor
		return successor;
	}

	/**
	 * Function for getting left most child as successor
	 * 
	 * @param first
	 * @return TreeNode
	 */
	public TreeNode findMinValueNode(TreeNode first) {
		// set current as provided node
		TreeNode current = first;
		// go till left most child and change current
		while (current.getLeft() != null) {
			current = current.getLeft();
		}
		// return current
		return current;
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
		first.insert(35);
		first.insert(45);

		// create object of InorderSuccessor
		InorderSuccessor inorderSuccessor = new InorderSuccessor();
		// find inorder Successor
		TreeNode successor = inorderSuccessor.findInorderSuccessor(first, first
				.getLeft().getRight());
		// print data of inorder successor
		System.out.println("Inorder Successor's Data : ");
		System.out.println(successor.getData());

	}

}
