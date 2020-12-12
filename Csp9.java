import java.util.Scanner;

public class Csp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int t=sc.nextInt();
		int xl=sc.nextInt();
		int yd=sc.nextInt();
		int xr=sc.nextInt();
		int yu=sc.nextInt();
//		int[][][] records=new int[n][t][2];
		int pass=0;
		int stay=0;
		for (int i=0;i<n;i++) {
			int count=0;
			boolean hasPassed=false;
			boolean hasStayed=false;
			for (int j=0;j<t;j++) {
				int x=sc.nextInt();
				int y=sc.nextInt();
				if (x>=xl && x<=xr && y>=yd && y<=yu) {
					count++;
					hasPassed=true;
					if (count>=k) {
						hasStayed=true;
					}
				}else {
					count=0;
				}
			}
			if (hasStayed)
				stay++;
			if (hasPassed)
				pass++;
		}
		System.out.println(pass);
		System.out.println(stay);
	}

}
