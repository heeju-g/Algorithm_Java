package string;

import java.util.Scanner;
/*
 * ȸ���� �˻��� �� ���ĺ��� ������ �˻��ϸ� �̿��� ���ڴ� �����Ѵ�.(��ҹ��� �������� �ʴ´�)
 */

public class Palindrome2 {
	public String solution(String s) {
		String answer = "NO";
		//���Խ� : A-Z�� �ƴϸ� ���ڷ� �����.
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
