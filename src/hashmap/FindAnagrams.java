package hashmap;
import java.util.*;
/*
 * 모든 아나그램 찾기 : 두 문자열(S,T)을 입력받아 그 안에 존재하는 모든 아나그램의 부분문자열 개수를 출력하는 프로그램.
 * S문자열 길이는 10000이하이고, T는 S문자열보다 길이가 작거나 같다.
 * hash/two pointers/sliding window
 */
public class FindAnagrams {
	public int solution(String s, String t) {
		int answer = 0;
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		//작은 길이(t)인 bm먼저 세팅
		for(char x : t.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
		int L  = t.length();
		//t에 맞춰서 am 하나 세팅
		for(int i = 0; i<L; i++) am.put(s.charAt(i), am.getOrDefault(s.charAt(i), 0)+1);
		//비교
		if(am.equals(bm)) answer++;
		int lt = 0;
		for(int rt = L; rt<s.length(); rt++) {
			am.put(s.charAt(rt), am.getOrDefault(s.charAt(rt), 0)+1);
			//이전 lt 옮기면셔 value-1해주고, 그 값이 0인 경우엔 지워버려야 한다.
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
