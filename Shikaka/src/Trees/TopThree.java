package Trees;

public class TopThree {
	public static int First,Second,Third=Integer.MIN_VALUE;
	public static void t3(BN<Integer> node){
		if(node == null){
			return;
		}
		if(node.data>First){
			
			Third=Second;
			Second=First;
			First=node.data;
		}
	else if(node.data>Second){
			
			Third=Second;
			Second=node.data;
		}
	else if(node.data>Third){
		
			Third=node.data;
	}	
	t3(node.left);
	t3(node.right);
	System.out.println(First+" "+Second+" "+Third);
		
		
	}
}
