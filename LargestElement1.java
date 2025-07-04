package array;

public class LargestElement1 {
	public static void main(String[] args) {
		int[] arr= {13, 46, 24, 52, 20, 9};
		int ans=large(arr);
		System.out.print(ans);
	}
	public static int large(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
		
	}
}
