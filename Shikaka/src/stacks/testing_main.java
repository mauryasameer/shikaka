package stacks;

import java.util.*;

public class testing_main {

	public static void main(String[] args) {
		Stack s1=new Stack();
		Stack s2=new Stack();
		Scanner s =new Scanner(System.in);
		int size = s.nextInt();
		for(int i=0;i<size;i++){
			s1.push(s.nextInt());
		}
	System.out.println(reverse_two_stacks.reverse(s1, s2));
		//	System.out.println(if_brackets_balanced.CheckBal("()[]"));
	}

}
