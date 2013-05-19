package Tree;

/**
 * @File : CheckSumProperty.java
 * @Description : Class for checking sum property of tree,sum property means sum
 *              of left and right children must be equal to parent value
 * @author Mohit
 * 
 */
public class CheckSumProperty {

	public CheckSumProperty() {

	}

	/**
	 * Function for checking sum property
	 * 
	 * @param first
	 * @return
	 */
	public boolean isSumProperty(TreeNode first) {
		int leftdata = 0;
		int rightdata = 0;

		// if node is null or left and right children are null,return true
		if (first == null || first.getLeft() == null
				&& first.getRight() == null) {
			return true;
		}

		// get left child
		if (first.getLeft() != null) {
			leftdata = first.getLeft().getData();
		}

		// get right child
		if (first.getRight() != null) {
			rightdata = first.getRight().getData();
		}

		// check left and right tree recursively and also check sum property of
		// current node
		return (leftdata + rightdata == first.getData())
				&& isSumProperty(first.getLeft())
				&& isSumProperty(first.getRight());
	}

	public static void main(String[] args) {

		// create root node
		TreeNode first = new TreeNode(20);
		// create children
		first.setLeft(new TreeNode(15));
		first.setRight(new TreeNode(5));
		first.getLeft().setLeft(new TreeNode(9));
		first.getLeft().setRight(new TreeNode(6));
		first.getRight().setLeft(new TreeNode(1));
		first.getRight().setRight(new TreeNode(4));

		// create object of CheckSumProperty
		CheckSumProperty checkSumProperty = new CheckSumProperty();
		// check sum property
		if (checkSumProperty.isSumProperty(first)) {
			System.out.println("This Tree satisfies Sum Property.");
		} else {
			System.out.println("This Tree does not satisfy Sum Property.");
		}
	}

}
