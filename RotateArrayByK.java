package array;

import java.util.Arrays;

public class RotateArrayByK {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int k=3;
		reverse(arr,k);
		
		
	}
	public static void reverse(int[] arr,int k) {
		int n=arr.length;
		rotate(arr,0,n-1);
		rotate(arr,0,k-1);
		rotate(arr,k,n-1);
		System.out.print(Arrays.toString(arr));
		
	}
	public static void rotate(int[] arr, int start, int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
