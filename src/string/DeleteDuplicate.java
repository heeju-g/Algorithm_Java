package string;
import java.util.*;
/*
 * �ߺ��� ���� ���� : �ҹ��ڷ� �� ���� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� Ǯ��.
 */
public class DeleteDuplicate {
	public String solution(String str) {
		String answer  = "";
		for(int i = 0; i<str.length(); i++) {
			/*                                  �ڱ���ġ       �ش� ���ڰ� ó�� �߰ߵ� ��ġ
			System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			���ڰ� ó�� �߰ߵ� ��ġ�� ���� ��ġ�� ������ ó�� ���Դ� �ǹ��̹Ƿ� �信 �־��ش�.
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
