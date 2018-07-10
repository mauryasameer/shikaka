package Trees;

public class print_tree {
	public void inorder(binary_node node){
		if(node!=null){
			inorder(node.get_left());
			System.out.println(node.getData());
			inorder(node.get_right());
		}
	}
}
