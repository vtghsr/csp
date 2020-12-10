import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Csp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		sc.nextLine();
		String[] strs=new String[m];
		for (int i=0;i<m;i++) {
			strs[i]=sc.nextLine();
		}
		Map<String,String> map=new HashMap<String, String>();
		for (int i=0;i<n;i++) {
			String[] input=sc.nextLine().split(" ", 2);
			map.put(input[0], input[1].substring(1, input[1].length()-1));
		}
		for (String s:strs) {
			StringBuilder sb=new StringBuilder();
			int i=0;
			while (i<s.length()) {
				if (s.charAt(i)!='{') {
					sb.append(s.charAt(i));
					i++;
				}else {
					int j=i+3;
					StringBuilder varname=new StringBuilder();
					while (s.charAt(j)!=' ') {
						varname.append(s.charAt(j));
						j++;
					}
					String var=varname.toString();
					if (map.get(var)!=null) {
						sb.append(map.get(var));
					}
					i=j+3;
				}
			}
			System.out.println(sb.toString());
			
		}
		
		
		
	}

}
