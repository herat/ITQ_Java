package Tree;

/**
 * @File : TotalLeafNodes.java
 * @Description : File for getting total leaf Nodes
 * @author Mohit
 * 
 */
public class TotalLeafNodes {

	public TotalLeafNodes() {

	}

	/**
	 * Function for finding total leaf nodes
	 * 
	 * @param first
	 * @return
	 */
	public int findTotalLeafNodes(TreeNode first) {
		if (first == null) {
			return 0;
		}
		// if found leaf, return 1
		if (first.getLeft() == null && first.getRight() == null) {
			return 1;
		}
		// calculate leftLeaves and rightLeaves
		return findTotalLeafNodes(first.getLeft())
				+ findTotalLeafNodes(first.getRight());
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

		// create object of TotalLeafNodes
		TotalLeafNodes totalLeafNodes = new TotalLeafNodes();
		// find total leaf Nodes
		int totalLeaves = totalLeafNodes.findTotalLeafNodes(first);
		// print total leaf nodes
		System.out.println("Total Leaf Nodes : " + totalLeaves);
	}

}
