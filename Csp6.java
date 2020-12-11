import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Csp6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] windows=new int[n+1][4];
		int[][] clicks=new int[m][2];
		for (int i=1;i<=n;i++) {
			for (int j=0;j<4;j++) {
				windows[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<m;i++) {
			clicks[i][0]=sc.nextInt();
			clicks[i][1]=sc.nextInt();
		}
		Deque<Integer> seqStack=new LinkedList<Integer>();
		Deque<Integer> bakStack=new LinkedList<Integer>();
		//初始化栈，小数在栈底
		for (int i=1;i<=n;i++) {
			seqStack.push(i);
		}
		for (int i=0;i<m;i++) {
			int x=clicks[i][0];
			int y=clicks[i][1];
			while (!seqStack.isEmpty()) {
				int win=seqStack.pop();
				if (x>=windows[win][0] && x<=windows[win][2] && y>=windows[win][1] && y<=windows[win][3]) {
					while (!bakStack.isEmpty()) {
						seqStack.push(bakStack.pop());
					}
					seqStack.push(win);
					System.out.println(win);
					break;
				}else {
					bakStack.push(win);
				}
			}
			if (seqStack.isEmpty()) {
				System.out.println("IGNORED");
				while (!bakStack.isEmpty()) {
					seqStack.push(bakStack.pop());
				}
			}
		}
		
	}

}
