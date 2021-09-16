package string;

import java.util.*;

//영어 알파벳과 특수문자로 구성된 문자열을 입력 받아, 영어 알파벳만 뒤집고 특수문자는 그대로 위치하여 출력.
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
		//static method라서 클래스.메소드 이렇게 함.
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
