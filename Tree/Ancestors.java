package Tree;

/**
 * @File : Ancestors.java
 * @Description : Class for printing all ancestors of given node
 * @author Mohit
 * 
 */
public class Ancestors {

	public Ancestors() {

	}

	/**
	 * Function for printing all ancestors of node
	 * 
	 * @param first
	 * @param data
	 * @return
	 */
	public boolean printAllAncestors(TreeNode first, int data) {
		if (first == null) {
			return false;
		}
		// if node found, return true to print ancestors
		if (first.getData() == data) {
			return true;
		}
		// if present node on left or right subtree, print current node data and
		// return true to print all ancestors
		if (printAllAncestors(first.getLeft(), data)
				|| printAllAncestors(first.getRight(), data)) {
			System.out.print(first.getData() + " ");
			return true;
		}
		// if not found return false;
		return false;
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

		int nodeData = 10;
		//create object of Ancestors
		Ancestors ancestors = new Ancestors();
		//print all ancestors
		System.out.println("Ancestors of " + nodeData + " are :");
		ancestors.printAllAncestors(first, nodeData);

	}

}
