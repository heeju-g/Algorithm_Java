package string;

import java.util.*;

//���� ���ĺ��� Ư�����ڷ� ������ ���ڿ��� �Է� �޾�, ���� ���ĺ��� ������ Ư�����ڴ� �״�� ��ġ�Ͽ� ���.
public class ReverseWord3 {

	public String solution(String str) {
		String answer;
		char[] s = str.toCharArray();
		int lt =0, rt=str.length()-1;
		while(lt<rt) {
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
		//static method�� Ŭ����.�޼ҵ� �̷��� ��.
		answer = String.valueOf(s);
		return answer;
	}
	
	public static void main(String[] args) {
		ReverseWord3 R = new ReverseWord3();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(R.solution(str));
		kb.close();
	}

}
