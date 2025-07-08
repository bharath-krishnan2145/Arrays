package array;
import java.util.*;
public class Union {
	public static void main(String[] args) {
		int[] arr1= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arr2= {2, 3, 4, 4, 5, 11, 12};
		int[] res=unionofarr(arr1,arr2);
		System.out.print(Arrays.toString(res));
	}
	public static int[] unionofarr(int[] arr1, int[] arr2) {
		HashSet<Integer> set=new HashSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		int[] unionarr=new int[set.size()];
		int index=0;
		for(int num:set) {
			unionarr[index++]=num;
		}
		return unionarr;
	}
}
