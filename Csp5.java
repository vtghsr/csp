import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Csp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=0;
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		for (int i=0;i<n;i++) {
			int x=sc.nextInt();
			if (map.containsKey(0-x)) {
				res++;
			}
			map.put(x, 0);
		}
		System.out.println(res);
		
	}

}
