package array;
import java.util.*;
public class MoveZeros {
	public static void main(String[] args) {
		int[] arr= {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
		int[] res=move(arr);
		System.out.print(Arrays.toString(res));
	}
	public static int[] move(int[] arr) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				list.add(arr[i]);
			}
		}
		int size=list.size();
		for(int i=0;i<size;i++) {
			arr[i]=list.get(i);
		}
		for(int i=size;i<arr.length;i++) {
			arr[i]=0;
		}
		return arr;
	}
}
