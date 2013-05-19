package Tree;

/**
 * @File : LeastCommonAncestor.java
 * @Description : Class for finding least common ancestor of given two nodes
 * @author Mohit
 * 
 */
public class LeastCommonAncestor {

	public LeastCommonAncestor() {

	}

	/**
	 * Function for finding least Common ancestor
	 * 
	 * @param first
	 * @param data1
	 * @param data2
	 * @return
	 */
	public int findLeastCommonAncestor(TreeNode first, int data1, int data2) {
		// variable for storing current node data
		int data;

		// if first node is null or first node data is same as data1 or data2,
		// return -1
		if (first == null || first.getData() == data1
				|| first.getData() == data2) {
			return -1;
		}

		// store current node data
		data = first.getData();
		// if left node is not null and its data is same as data1 or
		// data2,return current node data
		if (first.getLeft() != null) {
			if (first.getLeft().getData() == data1
					|| first.getLeft().getData() == data2) {
				return data;
			}
		}

		// if right node is not null and its data is same as data1 or
		// data2,return current node data
		if (first.getRight() != null) {
			if (first.getRight().getData() == data1
					|| first.getRight().getData() == data2) {
				return data;
			}
		}

		// if current node data is in between data1 and data2 return current
		// node data
		if (data > data1 && data < data2) {
			return data;
		}

		// if current node data is greater than data1 and data2,recursively find
		// common ancestor on left subtree
		if (data > data1 && data > data2) {
			return findLeastCommonAncestor(first.getLeft(), data1, data2);
		}
		// if current node data is less than data1 and data2,recursively find
		// common ancestor on right subtree
		if (data < data1 && data < data2) {
			return findLeastCommonAncestor(first.getLeft(), data1, data2);
		}
		return 0;
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

		// create object of LeastCommonAncestor
		LeastCommonAncestor leastCommonAncestor = new LeastCommonAncestor();
		// find least common ancestor of 20 and 30
		System.out.println("Least common ancestor is : "
				+ leastCommonAncestor.findLeastCommonAncestor(first, 20, 30));
	}

}
