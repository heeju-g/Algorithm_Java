package string;

import java.util.*;
//문자열 비교 (방법 2가지)
public class FindCharacter {
	public int solution(String str,char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		/*1. 일반 for문
		 * for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==t) answer++;
		}
		*/
		
		//2. 향상된 for문
		for(char x : str.toCharArray()) {
			if(x==t) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		FindCharacter T = new FindCharacter();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		System.out.println(T.solution(str, c));
		kb.close();
	}
}
