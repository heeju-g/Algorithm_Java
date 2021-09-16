package string;

import java.util.*;

//문장 속에서 가장 긴 단어를 출력(같은 길이의 경우 앞에 위치한 단어가 출력)
public class FindLongestWord {
	public String solution(String str) {
		String answer = "";
		int m = 0;
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			//len>=m이라 하면 같은 길이가 나올 경우 뒤에 위치한 단어가 출력된다.
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
