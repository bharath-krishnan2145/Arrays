package array;

import java.util.Arrays;

public class Remove_Duplicates2 {
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,3,4,4,5,6,6};
		int[] res=removeduplicates(arr);
		System.out.print(Arrays.toString(res));
	}
	static int[] removeduplicates(int[] arr) {
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[i] !=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		return Arrays.copyOfRange(arr,  0 , i+1);
		
	}
}
