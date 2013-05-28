package Tree;

/**
 * @File : GetLevelofNode.java
 * @Description : class for getting level of node
 * @author Mohit
 * 
 */
public class GetLevelofNode {

	public GetLevelofNode(){
		
	}
	
	/**
	 * Function for finding level of node recursively
	 * @param first
	 * @param data
	 * @param level
	 * @return
	 */
	public int findLevelofNode(TreeNode first,int data,int level){
		//if node is null, return zero
		if(first==null){
			return 0;
		}
		
		//if node found in tree, return current level
		if(first.getData()==data){
			return level;
		}
		//recursively get level from left or right subtrees
		return findLevelofNode(first.getLeft(), data, level+1)|
				findLevelofNode(first.getRight(), data, level+1);
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

		//variable of starting level and node data 
		int startlevel=1;
		int nodeData=10;
		
		//create object of GetLevelofNode
		GetLevelofNode getLevelofNode=new GetLevelofNode();
		//find level of node
		int level=getLevelofNode.findLevelofNode(first,nodeData,startlevel);
		//print level of node
		System.out.println("Level of node with "+nodeData +" data is : "+level);
	}

}
