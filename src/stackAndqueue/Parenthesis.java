package stackAndqueue;
import java.util.*;
/* Stack 사용
 * 올바른 괄호. 괄호 문자열이 올바르면 YES, 아니면 NO
 */
public class Parenthesis {
	public String solution(String str) {
		String answer = "YES";
		//여는 괄호는 스택에 넣고, 닫는 괄호(짝)이 나오면 스택에 있던 거 빼면 된다. 닫는 괄호가 나왔는데 기존 스택에 여는 괄호가 없다면 no
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x=='(') stack.push(x);
			//닫는 괄호 나오면 기존스택에 일단 여는 괄호 있는지 확인. 없으면 no, 있으면 여는 괄호 꺼내기.
			else {
				if(stack.isEmpty()) answer="NO";
				stack.pop();
			}
		}
		//다 했는데 스택에 여는 괄호가 남아있으면 NO
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
