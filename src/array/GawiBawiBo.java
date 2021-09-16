package array;
import java.util.*;

//n번 가위바위보를 해서 각 줄에 각 회의 승자를 출력(비기는 경우 d)
public class GawiBawiBo {
	
	public String solution(int n, int[] a,int[] b) {
		String answer = "";
		for(int i = 0; i<n; i++) {
			if(a[i]==b[i]) answer+="D";
			else if(a[i]==1 && b[i]==3) answer+="A";
			else if(a[i]==2 && b[i]==1) answer+="A";
			else if(a[i]==3 && b[i]==2) answer+="A";
			else answer+="B";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		GawiBawiBo G = new GawiBawiBo();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i<n; i++) {
			a[i]=kb.nextInt();
			b[i]=kb.nextInt();
		}
		for(char x : G.solution(n, a, b).toCharArray()) System.out.println(x);
	
		kb.close();
	}
	
}
