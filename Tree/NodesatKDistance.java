package Tree;

/**
 * @File : NodesatKDistance.java
 * @Description : Class for finding and printing nodes at k distance from root
 *              node
 * @author Mohit
 * 
 */
public class NodesatKDistance {

	public NodesatKDistance() {

	}

	/**
	 * Function for finding and printing Nodes at K Distance from root
	 * 
	 * @param first
	 * @param k
	 */
	public void findandPrintNodesatKDistance(TreeNode first, int k) {
		// if node is null,return
		if (first == null) {
			return;
		}
		// if reach to k, print that node data
		if (k == 0) {
			System.out.println(first.getData());
			return;
		} else {
			// recursively find and print nodes on left and right subtree
			findandPrintNodesatKDistance(first.getLeft(), k - 1);
			findandPrintNodesatKDistance(first.getRight(), k - 1);
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
		first.insert(35);
		first.insert(45);
		first.insert(25);
		first.insert(55);
		// create object of NodesatKDistance
		NodesatKDistance nodesatKDistance = new NodesatKDistance();
		// find and print nodes at kth distance
		System.out.println("Nodes at 2 distance : ");
		nodesatKDistance.findandPrintNodesatKDistance(first, 2);

	}

}
