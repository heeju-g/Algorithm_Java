package string;

import java.util.Scanner;
/*
 * 회문을 검사할 때 알파벳만 가지고 검사하며 이외의 문자는 무시한다.(대소문자 구분하지 않는다)
 */

public class Palindrome2 {
	public String solution(String s) {
		String answer = "NO";
		//정규식 : A-Z가 아니면 빈문자로 만들기.
		s = s.toUpperCase().replaceAll("[^A-Z]","");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) return "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Palindrome2 P = new Palindrome2();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(P.solution(str));
		kb.close();
	}

}
