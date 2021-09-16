package hashmap;
import java.util.*;
/*
 * ��� �Ƴ��׷� ã�� : �� ���ڿ�(S,T)�� �Է¹޾� �� �ȿ� �����ϴ� ��� �Ƴ��׷��� �κй��ڿ� ������ ����ϴ� ���α׷�.
 * S���ڿ� ���̴� 10000�����̰�, T�� S���ڿ����� ���̰� �۰ų� ����.
 * hash/two pointers/sliding window
 */
public class FindAnagrams {
	public int solution(String s, String t) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		//���� ����(t)�� bm���� ����
		for(char x : t.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
		int L  = t.length();
		//t�� ���缭 am �ϳ� ����
		for(int i = 0; i<L; i++) am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0)+1);
		//��
		if(am.equals(bm)) answer++;
		int lt = 0;
		for(int rt = L; rt<s.length(); rt++) {
			am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0)+1);
			//���� lt �ű��� value-1���ְ�, �� ���� 0�� ��쿣 ���������� �Ѵ�.
			am.put(s.charAt(lt), am.get(s.charAt(lt))-1);
			if(am.get(s.charAt(lt))==0) am.remove(s.charAt(lt));
			if(am.equals(bm)) answer++;
			lt++;
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		FindAnagrams F = new FindAnagrams();
		Scanner kb = new Scanner(System.in);
		String a = kb.next();
		String b = kb.next();
		System.out.print(F.solution(a, b));
		kb.close();
		
	}

}
