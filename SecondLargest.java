package array;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr= {1, 2, 4, 7, 7, 5};
		int res=second(arr);
		System.out.println(res);
	}
	public static int second(int[] arr) {
		int large=Integer.MIN_VALUE;
		int secondlarge=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				secondlarge=large;
				large=arr[i];
			}
			if(arr[i]> secondlarge && arr[i]!=large) {
				secondlarge=arr[i];
			}
			
		}
		return secondlarge;
	}
}
