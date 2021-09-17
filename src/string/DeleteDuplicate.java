package string;
import java.util.*;
/*
 * 중복된 문자 제거 : 소문자로 한 개의 문자열이 입력되면 중복된 문자를 제거하고 풀력.
 */
public class DeleteDuplicate {
	public String solution(String str) {
		String answer  = "";
		for(int i = 0; i<str.length(); i++) {
			/*                                  자기위치       해당 문자가 처음 발견된 위치
			System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			문자가 처음 발견된 위치와 현재 위치가 같으면 처음 나왔단 의미이므로 답에 넣어준다.
			*/
			if(str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		DeleteDuplicate D = new DeleteDuplicate();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.print(D.solution(str));
		kb.close();
	}
}
