package string;
/*
 * Palindrome(회문문자열) - 앞에서나 뒤에서 읽을 때나 같은 문자열. 
 * 입력된 문자열이 회문문자열이면 yes, 아니면 no 추력. (대소문자 구별하지 않는다.)
 */

import java.util.Scanner;

public class Palindrome {

	public String solution(String str) {
		String answer = "YES";
		str = str.toUpperCase();
		int len = str.length();
		for(int i = 0; i<len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Palindrome P = new Palindrome();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(P.solution(str));
		kb.close();
	}
}
