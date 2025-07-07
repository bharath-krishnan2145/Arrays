package array;

public class LinearSearch {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int target=4;
		int res=linear(arr,target);
		System.out.print(res);
	}
	public static int linear(int[] arr,int target) {
		 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
}
