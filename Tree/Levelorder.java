package Tree;

public class Levelorder {

	public Levelorder() {
		TreeNode first = new TreeNode(40);
		first.insert(30);
		first.insert(50);
		first.insert(20);
		first.insert(10);
		first.insert(60);
		printLevelorder(first);
	}

	public void printLevelorder(TreeNode first) {
		if (first == null) {
			return;
		}

		printLevelorder(first.getLeft());
		printLevelorder(first.getRight());
		System.out.println(first.getData());
	}

	public static void main(String[] args) {

		Levelorder levelorder = new Levelorder();
	}

}
