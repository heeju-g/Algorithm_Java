package hashmap;
import java.util.*;

/*
 * �б�ȸ�� ����
 * A,B,C,D,E �ټ� �ĺ��� ���. �� �л���(5<=N<=50)�� �־�����,
 * �� ��°�� N�� ��ǥ������ ������ �� �ĺ��� ��ȣ�� ��ǥ ������� ���ڿ��� �Է�.
 * (key�� ���ĺ�, value�� ��ǥ���� �ϸ� �� ��)
 */
public class Hash00 {
	public char solution(int n, String s) {
		char answer = ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : s.toCharArray()) {
		//ī������ �� ����!! map.getOrDefault : x��� Ű�� ������� ������ �� value�������� �ǰ� ������ 0����
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		//key������ value���� ���鼭 �ִ� ã��
		int max = 0;
		for(char key : map.keySet()) {
			//key, value ��� : System.out.println(x+" "+map.get(x));
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		Hash00 H = new Hash00();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		String str = kb.next();
		System.out.println(H.solution(n, str));
		kb.close();
	}

}
