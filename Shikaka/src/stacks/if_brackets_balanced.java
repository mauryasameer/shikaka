package stacks;
import java.util.*;
public class if_brackets_balanced {

	
	public static boolean check(char a,char b){
		if(a=='('&&b==')'){
			return true;
		}
		else if(a=='{'&&b=='}'){
			return true;
		}
		else if(a=='['&&b==']'){
			return true;
		}
		else{
		return false;
		}
	}
	
	public static boolean CheckBal(String exp){
		Stack s = new Stack();
		
		
		for(int i =0;i<exp.length();i++){
			if(exp.charAt(i)=='('||exp.charAt(i)=='['|| exp.charAt(i)=='{')
			{
				s.push(exp.charAt(i));
			}
			if(exp.charAt(i)==')'||exp.charAt(i)=='}'|| exp.charAt(i)==']'){
				
				if(s.isEmpty()){
					return false;
				}
				
				else if(!check((char) s.pop(),exp.charAt(i))){
					return false;
				}
				
			}
		}	
		if(s.isEmpty()){
			return true;
		}
		else{
			return false;
		}
		
		
//		for(int i =0;i<exp.length();i++){
//			if(exp.charAt(i)=='(')
//			{
//				int r=exp.length()-1;
//				while(r>=0){
//					if(exp.charAt(r)==')'){
//						s.push(exp.charAt(i));
//						s.push(exp.charAt(r));
//					}
//					r--;
//				}
//			}
//		}
//			
//		for(int i =0;i<exp.length();i++){
//				if(exp.charAt(i)=='{')
//				{
//					int r=exp.length()-1;
//					while(r>=0){exp.re
//						if(exp.charAt(r)=='}'){
//							s.push(exp.charAt(i));
//							s.push(exp.charAt(r));
//						}
//						r--;
//					}
//					
//				}
//				
//			}
//		
//		for(int i =0;i<exp.length();i++){
//			if(exp.charAt(i)=='[')
//			{
//				int r=exp.length()-1;
//				while(r>=0){
//					if(exp.charAt(r)==']'){
//						s.push(exp.charAt(i));
//						s.push(exp.charAt(r));
//					}
//					r--;
//				}
//			}
//			
//		}
//		return s;
//		}
		
//		for(int i =0;i<exp.length();i++){
//			if(exp.charAt(i)=='('||exp.charAt(i)=='{'||exp.charAt(i)=='['){
//				s.pop();
//			}
//		}
//		if(exp.isEmpty()){
//			return true;
//
//		}
//		else{
//			return false;
//		}
//		
	}
}
