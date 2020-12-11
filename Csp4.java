import java.util.Scanner;

public class Csp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		int d=sc.nextInt();
		boolean ruin=false;
		if ((y%400==0) || (y%4==0 && y%100!=0)) {
			ruin=true;
		}
		int[] month= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if (ruin) {
			month[2]=29;
		}
		int count=0;
		for (int i=1;i<=12;i++) {
			if (count+month[i]>d) {
				System.out.println(i);
				System.out.println(d-count);
				break;
			}else {
				count+=month[i];
			}
		}

	}

}
