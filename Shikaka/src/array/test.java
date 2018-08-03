package array;
import java.util.*;
public class test {

	public static void main(String[] args) {
		
		int[] arr= {1,0,0,0,3,2,0,5,0};
		int []ar= count_zero.zero_check(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(ar[i]);
		}
	}

}
