package stackAndqueue;
import java.util.*;
/* Stack ���
 * �ùٸ� ��ȣ. ��ȣ ���ڿ��� �ùٸ��� YES, �ƴϸ� NO
 */
public class Parenthesis {
	public String solution(String str) {
		String answer = "YES";
		//���� ��ȣ�� ���ÿ� �ְ�, �ݴ� ��ȣ(¦)�� ������ ���ÿ� �ִ� �� ���� �ȴ�. �ݴ� ��ȣ�� ���Դµ� ���� ���ÿ� ���� ��ȣ�� ���ٸ� no
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x=='(') stack.push(x);
			//�ݴ� ��ȣ ������ �������ÿ� �ϴ� ���� ��ȣ �ִ��� Ȯ��. ������ no, ������ ���� ��ȣ ������.
			else {
				if(stack.isEmpty()) answer="NO";
				stack.pop();
			}
		}
		//�� �ߴµ� ���ÿ� ���� ��ȣ�� ���������� NO
		if(!stack.isEmpty()) answer = "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		Parenthesis P = new Parenthesis();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(P.solution(str));
		kb.close();
	}
	
	
}
