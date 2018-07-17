package generic_tree;

import java.util.ArrayList;

public class node<T> {
	T data;
	ArrayList<node<T>> children;
	
	node(T data){
		this.data=data;
		children = new ArrayList<node<T>>();
	}
	
}
