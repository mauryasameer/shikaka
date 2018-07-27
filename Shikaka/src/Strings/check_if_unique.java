package Strings;

public class check_if_unique {

	public static boolean unique(String s){
		
		boolean[]c=new boolean[256];
		for(int i=0;i<s.length();i++){
			int val=s.charAt(i);
			if(c[val]){
				return false;
			}
			c[val]=true;
		}
		return true;
		
	}
	
}
