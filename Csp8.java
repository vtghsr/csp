import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Csp8 {
	static int x;
	static int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		x=sc.nextInt();
		y=sc.nextInt();
		Queue<int[]> q=new PriorityQueue<int[]>(new MyComparator());
		for (int i=1;i<=n;i++) {
			int[] point=new int[3];
			point[0]=sc.nextInt();
			point[1]=sc.nextInt();
			point[2]=i;
			q.add(point);		
		}
		for (int i=0;i<3;i++) {
			System.out.println(q.poll()[2]);
		}
		

	}
	private static class MyComparator implements Comparator<int[]>{

		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO Auto-generated method stub
			int dif=(o1[0]-x)*(o1[0]-x)+(o1[1]-y)*(o1[1]-y)-(o2[0]-x)*(o2[0]-x)-(o2[1]-y)*(o2[1]-y);
			if (dif>0) {
				return 1;
			}else if (dif<0) {
				return -1;
			}else {
				return o1[2]-o2[2];
			}
			
		}
		
	}


}
