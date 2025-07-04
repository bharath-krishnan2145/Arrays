package array;
import java.util.*;
public class Remove_Duplicates {
	public static void main(String[] args) {
		int[] arr= {1, 2, 3, 4, 5,2,3,4,5};
		int[] res=removeduplicates(arr);
		System.out.print(Arrays.toString(res));
	}
	public static int[] removeduplicates(int[] arr) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		int[] result=new int[set.size()];
		int j=0;
		for(int nums:set) {
			result[j++]=nums;
		}
		return result;
	}
}
