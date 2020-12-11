import java.util.Scanner;

public class Csp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] board=new int[n][m];
		int[][] bak=new int[n][m];
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				int x=sc.nextInt();
				board[i][j]=x;
				bak[i][j]=x;
			}
		}
		//消除横向连续
		for (int[] row:board) {
			int i=0,j=0;
			while (i<m) {
				j=i;
				while (j<m && row[i]==row[j]) {
					j++;
				}
				if (j-i>=3) {
					for (int k=i;k<j;k++) {
						row[k]=0;
					}
				}
				i=j;
			}
		}
		//消除纵向连续
		for (int c=0;c<m;c++) {
			int i=0,j=0;
			while (i<n) {
				j=i;
				while (j<n && bak[i][c]==bak[j][c]) {
					j++;
				}
				if (j-i>=3) {
					for (int k=i;k<j;k++) {
						board[k][c]=0;
					}
				}
				i=j;
			}
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<m-1;j++) {
				System.out.format("%d ", board[i][j]);
			}
			System.out.format("%d\n", board[i][m-1]);
		}
			
		
		
	}

}
