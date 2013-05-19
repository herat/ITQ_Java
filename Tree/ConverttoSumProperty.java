package Tree;

/**
 * @File : ConverttoSumProperty.java
 * @Description : Class for converting arbitrary tree to tree which satisfies
 *              sum property
 * @author Mohit
 * 
 */
public class ConverttoSumProperty {

	public ConverttoSumProperty() {

	}

	/**
	 * Function for converting tree which satisfies Summ property
	 * 
	 * @param first
	 */
	public void convert(TreeNode first) {
		int leftdata = 0;
		int rightdata = 0;
		int diff;

		// if node is null or left and right children are null,return true
		if (first == null
				|| (first.getLeft() == null && first.getRight() == null)) {
			return;
		}

		// convert left subtree
		convert(first.getLeft());
		// convert right subtree
		convert(first.getRight());
		// get left node data
		if (first.getLeft() != null) {
			leftdata = first.getLeft().getData();
		}
		// get right node data
		if (first.getRight() != null) {
			rightdata = first.getRight().getData();
		}
		// get difference between sum of left and right node data and parent
		// node data
		diff = leftdata + rightdata - first.getData();

		// if diff is less than 0, increment children data
		if (diff < 0) {
			increment(first, diff);
			// if diff is greater than 0, change node data
		} else if (diff > 0) {
			first.setData(first.getData() + diff);
		}
	}

	/**
	 * Function for incrementing data of children
	 * 
	 * @param first
	 * @param diff
	 */
	public void increment(TreeNode first, int diff) {
		// change diff to positive
		diff = -diff;

		// if left child is not null, change left child
		if (first.getLeft() != null) {
			// change data of left node
			first.getLeft().setData(first.getLeft().getData() + diff);
			// increment descendant data recursively
			increment(first.getLeft(), diff);
		} else if (first.getRight() != null) {
			// change data of right node
			first.getRight().setData(first.getRight().getData() + diff);
			// increment descendant data recursively
			increment(first.getRight(), diff);
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

		// create object of inorder
		Inorder inorder = new Inorder();

		// print original tree
		System.out.println("Original Tree : ");
		inorder.printInorder(first);
		// create object of ConverttoSumProperty
		ConverttoSumProperty converttoSumProperty = new ConverttoSumProperty();
		// convert tree
		converttoSumProperty.convert(first);
		// print converted tree
		System.out.println("Converted Tree which satisfies sum property : ");
		inorder.printInorder(first);
	}

}
