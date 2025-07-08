package array;

public class MaximumOnes {
	public static void main(String[] args) {
		int[] arr= {1, 1, 0, 1, 1, 1 };
		int res=ones(arr);
		System.out.print(res);
	}
	public static int ones(int[] arr) {
		int count=0;
		int maxcount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
			else {
				count=0;
			}
		}
		maxcount=Math.max(maxcount, count);
		return maxcount;
	}
}
