package array;

public class Check_Sorted {
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		boolean res=sorted(arr);
		System.out.println(res);
	}
	public static boolean sorted(int[] arr) {
		for(int i=1;i<=arr.length-1;i++) {
			if(arr[i]>arr[i-1]) {
				return false;
			}
		}
		return true;
	}
}
