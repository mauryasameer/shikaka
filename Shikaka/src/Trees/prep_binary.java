package Trees;
import java.util.*;
public class prep_binary {
	public static BN<Integer> prep(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		if(data!=-1){
			BN<Integer> n = new BN<>(data);
			n.left = prep();
			n.right= prep();
			return n;
		}
		return null;
	}
}
