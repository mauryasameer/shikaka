package Trees;

public class practice_tree_random {

	public static  void main(String[] args) {
		
		
		prep_binary pr=new prep_binary();
		BN<Integer>head=pr.prep();
		print_tree print= new print_tree();
		print.print(head);
		
	}

}
