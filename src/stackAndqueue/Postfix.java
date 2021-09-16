package stackAndqueue;
import java.util.*;
/*
 * ������ ����(postfix) - ���û��
 */
public class Postfix {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		//���ڸ� ������ ���ÿ� �ְ�, �������̸� ���ÿ��� ������ ������ �Ѵ�. �ٵ� x�� ���� ���ڿ� ������ ���ڶ� �ƽ�Ű�ѹ��� ���� ������ -48�� �ؾ� �Ѵ�.
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) stack.push(x-48);
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				if(x=='+') stack.push(lt+rt);
				else if(x=='-') stack.push(lt-rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='/') stack.push(lt/rt);
			}
		}
		//������ �� �ϸ� ���ÿ� �ϳ��� �������� ���̴�.
		answer = stack.get(0);
		return answer;
	}
	
	public static void main(String[] args) {
		Postfix P = new Postfix();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(P.solution(str));
		kb.close();
	}
}
