package string;

import java.util.*;

//n개 단어 입력받고, 단어 각 끝 글자끼리 바꿔나가기
public class ReverseWord2 {

	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0,rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			//문자배열을 스트링화 
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ReverseWord2 R = new ReverseWord2();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String[] str = new String[n];
		for(int i = 0; i<n; i++) {
			str[i] = kb.next();
		}
		for(String x : R.solution(n, str)) {
			System.out.println(x);
		}
		kb.close();
	}
}
