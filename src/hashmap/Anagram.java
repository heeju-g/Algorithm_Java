package hashmap;
import java.util.*;

/*
 * Anagram(hash): �� ���ڿ��� ���ĺ� ���� ������ �ٸ����� �� ������ ��ġ�ϸ� �� �ܾ�� �Ƴ��׷��̴�. 
 * ���̰� ���� �� �ܾ �Ƴ��׷����� �Ǻ��ϴ� ���α׷�. YES / NO
 */
public class Anagram {
	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		//map�� s1�Է¹����鼭 ī��Ʈ�ϰ�(put), s2�� ���� �� ������ ī��Ʈ �ٿ�������.
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		for(char x: s2.toCharArray()) {
			//s2�� �ִ� ���ĺ��� s1�� ���� ��
			if(!map.containsKey(x)|| map.get(x)==0) answer = "NO";
			//���� �� ������ value -1
			map.put(x, map.get(x)-1);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Anagram A = new Anagram();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.println(A.solution(a, b));
		kb.close();
	}
}
