import java.util.Scanner;

public class Csp10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int max=0,min=0;
//		float mid=0;
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		max=Math.max(arr[0], arr[n-1]);
		min=Math.min(arr[0], arr[n-1]);
		if (n%2==0) {
			int sum=(arr[n/2]+arr[n/2-1]);
			if (sum%2==0) {
				System.out.format("%d %d %d", max,sum/2,min);
			}else {
				System.out.format("%d %.1f %d", max,sum/2,min);
			}
		}else {
			System.out.format("%d %d %d", max,arr[(n-1)/2],min);
		}

	}

}
