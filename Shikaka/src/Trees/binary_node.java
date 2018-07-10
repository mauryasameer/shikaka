package Trees;

public class binary_node {
	int data;
	binary_node left;
	binary_node right;
	binary_node(int i){
		this.data=i;
		right = null;
		left = null;
	}
	public binary_node() {
		left = null;
		right= null;
		data = 0;
	}
	public void set_Left(binary_node n){
		left = n;
	}
	public void set_right(binary_node n){
		right = n;
	}
	//function to get right
	public binary_node get_right(){
		return right;
	}
	//to get left
	public binary_node get_left(){
		return left;
	}
	public void set_data(int d){
		data = d;
	}
	public int getData(){
		return   data;
	}
}
