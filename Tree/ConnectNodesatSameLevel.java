package Tree;

/**
 * @File : ConnectNodesatSameLevel.java
 * @Description : Class for connecting nodes at same level using recursion and
 *              constant extra space
 * @author Mohit
 * 
 */
public class ConnectNodesatSameLevel {

	/**
	 * Function to connect nodes at same level
	 * 
	 * @param root
	 */
	public void connectNodes(TreeNode root) {
		if (root == null) {
			return;
		}

		// before moving down to left or right child of root, we need to set
		// next node of root's NextRight node,as we will use right sides node
		// to set left or right's NextRight
		if (root.getNextRight() != null) {
			connectNodes(root.getNextRight());
		}
		// if root's left child is not null,check for right child
		if (root.getLeft() != null) {
			// if right child also not null, set right next of left child to
			// right child of root and set NextRight of right child using root's
			// NextRight child
			if (root.getRight() != null) {
				root.getLeft().setNextRight(root.getRight());
				root.getRight().setNextRight(getNextRightNode(root));
			} else {
				// if right child is null, set left child's NextRight using
				// root's NextRight child
				root.getLeft().setNextRight(getNextRightNode(root));
			}
			// recursively go down to set NextRights
			connectNodes(root.getLeft());
		}
		// if right left child is null, check with right child ,if not null, set
		// NextRight of right child using root's NextRight
		else if (root.getRight() != null) {
			root.getRight().setNextRight(getNextRightNode(root));
			// recursively go down to set NextRights
			connectNodes(root.getRight());
		} else {
			// if both children are null, set NextRights of root's NextRight
			connectNodes(getNextRightNode(root));
		}
	}

	/**
	 * helper function to get nextRight of node
	 * 
	 * @param root
	 * @return
	 */
	public TreeNode getNextRightNode(TreeNode root) {
		// get root's nextRight node
		TreeNode temp = root.getNextRight();
		// iterate till we wont get correct node to connect
		while (temp != null) {
			// if temp's left node is not null, return that node
			if (temp.getLeft() != null) {
				return temp.getLeft();
			}
			// if tenp's right node is not null,return that node
			if (temp.getRight() != null) {
				return temp.getRight();
			}
			temp = temp.getNextRight();
		}
		// if we checked all nodes, return null as we don't find correct right
		// node
		return null;
	}

	/**
	 * Function to print node value and nextRight node values
	 * 
	 * @param root
	 */
	public void printInorderWithNextRightNode(TreeNode root) {
		if (root == null) {
			return;
		}
		printInorderWithNextRightNode(root.getLeft());
		System.out.print("Node Value : " + root.getData()
				+ " , Next right Value : ");
		// if root's nextRight is not null,print nextRight node's value
		if (root.getNextRight() != null) {
			System.out.print(root.getNextRight().getData());
		} else {
			System.out.print("null");
		}
		System.out.println();
		printInorderWithNextRightNode(root.getRight());
	}

	public static void main(String[] args) {
		// create root node
		TreeNode root = new TreeNode(40);
		// insert children
		root.insert(30);
		root.insert(35);
		root.insert(50);
		root.insert(45);
		root.insert(20);
		root.insert(10);
		root.insert(60);
		root.insert(65);
		// create object of ConectNodesatSameLevel
		ConnectNodesatSameLevel connectNodesatSameLevel = new ConnectNodesatSameLevel();
		// connect nodes
		connectNodesatSameLevel.connectNodes(root);
		// print nodes' value and nextRight nodes' value
		connectNodesatSameLevel.printInorderWithNextRightNode(root);
	}

}
