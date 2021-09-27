package string;
/*
 * Palindrome(ȸ�����ڿ�) - �տ����� �ڿ��� ���� ���� ���� ���ڿ�. 
 * �Էµ� ���ڿ��� ȸ�����ڿ��̸� yes, �ƴϸ� no �߷�. (��ҹ��� �������� �ʴ´�.)
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
