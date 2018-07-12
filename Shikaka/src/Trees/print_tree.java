package Trees;

public class print_tree {
	public static void print(BN<Integer> node){
		if(node==null){
			return ;
		}
		System.out.println(node.data);
		print(node.left);
		print(node.right);
	}
}
