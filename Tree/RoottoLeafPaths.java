package Tree;

/**
 * @File : RoottoLeafPaths.java
 * @Description : class for printing all root to leaf paths
 * @author Mohit
 * 
 */
public class RoottoLeafPaths {

	// array for storing paths
	private int[] paths;

	public RoottoLeafPaths() {
		// initializing path array
		paths = new int[100];

	}

	/**
	 * Function for printing paths
	 * 
	 * @param first
	 */
	public void printPaths(TreeNode first) {
		// call storeandPrintPaths method with paths array,starting count and
		// starting node of tree
		storeandPrintPaths(this.paths, first, 0);
	}

	/**
	 * Function for finding and storing all paths recursively and print that
	 * path
	 * 
	 * @param paths
	 * @param first
	 * @param count
	 */
	public void storeandPrintPaths(int[] paths, TreeNode first, int count) {
		if (first == null) {
			return;
		}
		// store current node data to path
		paths[count] = first.getData();
		// increment counter
		count = count + 1;

		// if we reach to leaf,print that path
		if (first.getLeft() == null && first.getRight() == null) {
			printPath(paths, count);
		}
		// recursively store nodes values to path array
		storeandPrintPaths(paths, first.getLeft(), count);
		storeandPrintPaths(paths, first.getRight(), count);
	}

	/**
	 * Function for printing path
	 * 
	 * @param path
	 * @param count
	 */
	public void printPath(int[] path, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
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

		// create object of roottoLeafPaths
		RoottoLeafPaths roottoLeafPaths = new RoottoLeafPaths();
		// print paths
		roottoLeafPaths.printPaths(first);

	}

}
