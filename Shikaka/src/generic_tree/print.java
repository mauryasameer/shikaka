package generic_tree;

public class print{
	
	public static void print(node<Integer> root){
		System.out.println(root.data);
		for(int i=0;i<root.children.size();i++){
			print(root.children.get(i));
		}
	}
	
}
