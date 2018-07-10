package Trees;

public class practice_tree_random {

	public static  void main(String[] args) {
		binary_node node = new binary_node(5);
		
		//		node.left.data=9;
		//		node.right.data=6;
		
		print_tree p= new print_tree();
		p.inorder(node);
	}
	

}
