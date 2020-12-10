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
public class Csp2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] mat=new int[n][m];
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		for (int[] row:mat) {
			int i=0,j;//i是慢指针，j是快指针
			while (i<m) {
				j=i;
				while (j<m && row[i]==row[j]) {
					j++;
				}
				if (j-i>=3){
					for (int k=i;k<j;k++) {
						row[k]=0;
					}
				}
				i=j;
			}		
		}
		for (int c=0;c<m;c++) {
			int i=0,j;
			while (i<n) {
				j=i;
				while (j<n && (mat[i][c]==mat[j][c] || mat[i][c]==0 || mat[j][c]==0)) {
					j++; 
				}
				if (j-i>=3) {
					for (int k=i;k<j;k++) {
						mat[k][c]=0;
					}
				}
				i=j;
			}
		}
		for (int i=0;i<n;i++) {
			for (int j=0;j<m-1;j++) {
				System.out.format("%d ", mat[i][j]);
			}
			System.out.format("%d\n", mat[i][m-1]);
		}
		
	}
}