package string;

import java.util.*;

//n�� ��ŭ �Է¹��� �ܾ���� ����� ���
public class ReverseWord {

	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			//String�� ������ �� ���ο� ��ü�� ��� ��������µ�, StringBuilder�� ó�� ������� ��ü�� ��� ���Ǳ� ������ �޸� ���� ���� �� �ִ�.
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
