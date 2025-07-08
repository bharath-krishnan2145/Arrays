package array;

public class NumberAppearsOnes {
	public static void main(String[] args) {
		int[] arr={4, 1, 2, 1, 2};
		int res=numones(arr);
		System.out.print(res);
	}
	public static int numones(int[] arr) {
		int xor=0;
		for(int i=0;i<arr.length;i++) {
			xor = xor ^ arr[i];
		}
		return xor;
	}
}
