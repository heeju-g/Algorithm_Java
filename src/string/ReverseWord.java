package string;

import java.util.*;

//n개 만큼 입력받은 단어들을 뒤집어서 출력
public class ReverseWord {

	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			//String은 연산할 때 새로운 객체가 계속 만들어지는데, StringBuilder는 처음 만들어진 객체가 계속 사용되기 때문에 메모리 낭비를 줄일 수 있다.
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		ReverseWord R = new ReverseWord();
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
