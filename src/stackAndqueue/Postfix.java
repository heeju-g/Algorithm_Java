package stackAndqueue;
import java.util.*;
/*
 * 후위식 연산(postfix) - 스택사용
 */
public class Postfix {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		//숫자를 만나면 스택에 넣고, 연산자이면 스택에서 꺼내서 연산을 한다. 근데 x는 지금 문자열 형태의 숫자라서 아스키넘버로 들어가기 때문에 -48을 해야 한다.
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
		//연산을 다 하면 스택에 하나가 남아있을 것이다.
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
