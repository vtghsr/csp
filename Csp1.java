import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Csp1 {
	static int maxx=1010;
	static int[][] node=new int[maxx][maxx];
	static int n,m;
	static int[] in=new int[maxx];//���ĳһ���Ƿ��Ѿ�������С��������
	static int[] to=new int[maxx];//�����������еĵ�ľ���
    static int INF=Integer.MAX_VALUE;
	static long res=0;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				node[i][j]=INF;
			}
		}
		for (int i=0;i<m;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			node[a][b]=c;
			node[b][a]=c;
		}
		for (int i=1;i<=n;i++) {
			to[i]=INF;
		}
		Prim();

	}
	static private void Prim() {
		in[1]=1;
		for (int i=1;i<=n;i++) {
			to[i]=node[1][i];
		}
		for (int i=1;i<=n-1;i++) {
			int minLen=INF;//���·��
			int point=1;//�¼���ĵ�
		
			for (int j=1;j<=n;j++) {
				if (in[j]==0 && to[j]<minLen) {
					minLen=to[j];
					point=j;
				}
			}
			//����¼���ĵ㲢����to
			in[point]=1;
			for (int j=1;j<=n;j++) {
				to[j]=Math.min(to[j], node[point][j]);
			}
			res+=minLen;
			
		}
		System.out.println(res);
	}
		
}