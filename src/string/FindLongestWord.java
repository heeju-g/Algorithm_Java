package string;

import java.util.*;

//���� �ӿ��� ���� �� �ܾ ���(���� ������ ��� �տ� ��ġ�� �ܾ ���)
public class FindLongestWord {
	public String solution(String str) {
		String answer = "";
		int m = 0;
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			//len>=m�̶� �ϸ� ���� ���̰� ���� ��� �ڿ� ��ġ�� �ܾ ��µȴ�.
			if(len>m) {
				m=len;
				answer=x;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		FindLongestWord T = new FindLongestWord();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
		kb.close();
	}
}
