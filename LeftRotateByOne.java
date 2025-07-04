package array;

import java.util.Arrays;

public class LeftRotateByOne {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int[] res=leftRotate(arr);
		System.out.print(Arrays.toString(res));
	}
	public static int[] leftRotate(int[] arr) {
//		int temp[]=new int[arr.length];
//		for(int i=1;i<arr.length;i++) {
//			temp[i-1]=arr[i];
//		}
//		temp[arr.length-1]=arr[0];
//		return temp;
		int start=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=start;
		return arr;
	}
}
