package generic_tree;

import java.util.Scanner;

public class prep {
	static Scanner s = new Scanner(System.in);
	
	public static node<Integer>pre(){
		int data = s.nextInt();
		node<Integer> root = new node<>(data);
		int no_of_child = s.nextInt();
		for(int i=0;i<no_of_child;i++){
			root.children.add(pre());
		}
		return root;
		
		
	}
	
	
}
