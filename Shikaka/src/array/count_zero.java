package array;

public class count_zero {
	public static int[]zero_check(int[] arr){
		int i=0;
		int count=0;
		int[] test = new int[arr.length];
		for(int k=0;k<arr.length;k++){
			if(arr[k]==0){
				count++;
			}
			else{
				test[i]=arr[k];
				i++;
			}
		}
		for(int k=count;k>0;k--){
			test[test.length-k]=0;
		}
		for(int k=0;k<arr.length;k++){
			arr[k]=test[k];
		}
		return arr;
	}
	
}
