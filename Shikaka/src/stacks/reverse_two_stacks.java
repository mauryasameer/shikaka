package stacks;
import java.util.*;
public class reverse_two_stacks {

	public static Stack<Integer> reverse(Stack<Integer> s1,Stack<Integer> s2){
		int[]r=new int[s1.size()];
		for(int i=0;i<s1.size();i++){
			r[i]=s1.elementAt(i);
		}
		for(int i=r.length-1;i>=0;i--){
			s2.push(r[i]);
		}
		return s2;
	}
	
}
