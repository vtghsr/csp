import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Csp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String choices=sc.nextLine();
		//0无参命令 , 1有参
		Map<Character,Integer> table=new HashMap<Character,Integer> ();
		for (int i=0;i<choices.length();i++) {
			if (choices.charAt(i)==':')
				continue;
			if (i+1==choices.length()) {
				table.put(choices.charAt(i), 0);
				continue;
			}
			if (choices.charAt(i+1)==':') {
				table.put(choices.charAt(i), 1);
			}else {
				table.put(choices.charAt(i), 0);
			}
		}
		int n=sc.nextInt();
		sc.nextLine();
		String[] res=new String[n+1];
		for (int i=1;i<=n;i++) {
			String[] dem=sc.nextLine().split(" ");
			if (dem.length==1) {
				res[i]="Case "+String.valueOf(i)+": ";
				continue;
			}
			List<String> temp=new ArrayList<String> ();
			temp.add("Case "+String.valueOf(i)+":");
			String[] alpha=new String[26];//按字母序输出
			int j=1;
			while (j<dem.length) {
				String s=dem[j];
				String regex="-[a-z]";
				if (!s.matches(regex) || !table.containsKey(s.charAt(1))) {//停止分析
					break;
				}else {
					if (table.get(s.charAt(1))==0) {//无参
						alpha[s.charAt(1)-'a']=s;
						j++;
					}else {//有参
						alpha[s.charAt(1)-'a']=dem[j+1];
						j+=2;
					}
				}
			}
			for (int k=0;k<26;k++) {
				if (alpha[k]==null)
					continue;
				if (alpha[k].charAt(0)=='-') {
					temp.add(alpha[k]);
				}else {
					temp.add("-"+String.valueOf((char) (k+'a')));
					temp.add(alpha[k]);
				}
			}
			res[i]=String.join(" ", temp);
		}
		for (int i=1;i<=n;i++) {
			System.out.println(res[i]);
		}

		
		
	}

}
